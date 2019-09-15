package com.shishi.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shishi.common.model.SysRole;
import com.shishi.common.model.SysRoleMenu;

import java.util.List;

/**
* @author huangqf
 */
public interface ISysRoleService extends IService<SysRole> {
	public List<SysRoleMenu> getRolePermission(Long roleId);

	boolean saves(SysRole entity);

	boolean updates(SysRole entity);
}
