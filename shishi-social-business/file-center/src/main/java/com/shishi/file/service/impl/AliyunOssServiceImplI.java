package com.shishi.file.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aliyun.oss.OSSClient;
import com.shishi.file.model.FileInfo;
import com.shishi.file.model.FileType;

/**
 * 阿里云oss存储文件
 *
 * @author huangqf
 */
@Service("aliyunOssServiceImpl")
public class AliyunOssServiceImplI extends AbstractIFileService {
    @Autowired
    private OSSClient ossClient;
    @Value("${aliyun.oss.bucketName:xxxxx}")
    private String bucketName;
    @Value("${aliyun.oss.domain:xxxxx}")
    private String domain;

    @Override
    protected FileType fileType() {
        return FileType.ALIYUN;
    }

    @Override
    protected void uploadFile(MultipartFile file, FileInfo fileInfo) throws Exception {
        ossClient.putObject(bucketName, fileInfo.getName(), file.getInputStream());
        fileInfo.setUrl(domain + "/" + fileInfo.getName());
    }

    @Override
    protected boolean deleteFile(FileInfo fileInfo) {
        ossClient.deleteObject(bucketName, fileInfo.getName());
        return true;
    }
}
