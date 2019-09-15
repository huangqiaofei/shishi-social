package com.shishi.log.dao;

import com.shishi.log.model.SlowQueryLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author huangqf
 */
@Component
public interface SlowQueryLogDao extends ElasticsearchRepository<SlowQueryLog, String> {

}