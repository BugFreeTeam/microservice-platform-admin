package com.security.admin.mapper;

import com.anjuxing.platform.common.crud.CrudMapper;
import com.security.admin.model.UmsAdmin;

public interface UmsAdminMapper extends CrudMapper<UmsAdmin> {
    public UmsAdmin getAdminByUserName(String username);
}