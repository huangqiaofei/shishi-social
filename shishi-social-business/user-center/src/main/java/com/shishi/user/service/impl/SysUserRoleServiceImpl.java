package com.shishi.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shishi.common.model.SysRoleUser;
import com.shishi.user.mapper.SysUserRoleMapper;
import com.shishi.user.service.ISysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author huangqf
 * @since 2019-04-14
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysRoleUser> implements ISysUserRoleService {

}
