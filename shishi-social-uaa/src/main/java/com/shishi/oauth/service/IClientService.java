package com.shishi.oauth.service;

import com.shishi.common.model.PageResult;
import com.shishi.common.model.Result;
import com.shishi.common.service.ISuperService;
import com.shishi.oauth.model.Client;

import java.util.Map;

/**
 * @author huangqf
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto);

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClent(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}
