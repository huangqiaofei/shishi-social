package com.shishi.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shishi.common.model.SysPermission;

import java.util.List;

/**
 * 菜单
 *
 * @author huangqf
 */
public interface SysMenuMapper extends BaseMapper<SysPermission> {

    List<SysPermission> listMenuByUserId(Long id);

    List<SysPermission> listPermissByUserId(Long roleId);

}
