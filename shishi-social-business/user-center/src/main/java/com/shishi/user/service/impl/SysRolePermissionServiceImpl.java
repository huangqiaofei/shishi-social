package com.shishi.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shishi.common.model.SysRoleMenu;
import com.shishi.user.mapper.SysRolePermissionMapper;
import com.shishi.user.service.ISysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色和权限关系表 服务实现类
 * </p>
 *
 * @author huangqf
 * @since 2019-04-14
 */
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRoleMenu> implements ISysRolePermissionService {

}
