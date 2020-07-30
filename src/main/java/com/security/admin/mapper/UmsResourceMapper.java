package com.security.admin.mapper;

import com.anjuxing.platform.common.crud.CrudMapper;
import com.security.admin.model.UmsResource;

import java.util.List;

public interface UmsResourceMapper extends CrudMapper<UmsResource> {

    public List<UmsResource> getResourceList(Long adminId);
}