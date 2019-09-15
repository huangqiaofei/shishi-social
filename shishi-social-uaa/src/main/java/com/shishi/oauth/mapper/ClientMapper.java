package com.shishi.oauth.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shishi.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

import com.shishi.oauth.model.Client;

/**
 * @author huangqf
 */
public interface ClientMapper extends SuperMapper<Client> {
    List<Client> findList(Page<Client> page, @Param("params") Map<String, Object> params );
}
