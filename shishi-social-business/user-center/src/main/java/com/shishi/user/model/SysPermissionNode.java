package com.shishi.user.model;

import com.shishi.common.model.SysPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author huangqf on 2018/9/30.
 */
public class SysPermissionNode extends SysPermission {
    @Getter
    @Setter
    private List<SysPermissionNode> children;
}
