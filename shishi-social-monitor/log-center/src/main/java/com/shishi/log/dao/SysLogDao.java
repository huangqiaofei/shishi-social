package com.shishi.log.dao;

import com.shishi.log.model.SysLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author huangqf
 */
@Component
public interface SysLogDao extends ElasticsearchRepository<SysLog, String> {

}