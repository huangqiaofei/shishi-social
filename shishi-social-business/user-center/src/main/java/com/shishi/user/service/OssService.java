package com.shishi.user.service;


import com.shishi.user.vo.OssCallbackResult;
import com.shishi.user.vo.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * @author huangqf on 2018/5/17.
 */
public interface OssService {
    OssPolicyResult policy();

    OssCallbackResult callback(HttpServletRequest request);
}
