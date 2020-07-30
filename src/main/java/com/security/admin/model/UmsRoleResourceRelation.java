package com.security.admin.model;


import com.anjuxing.platform.common.base.ValidateData;
import com.anjuxing.platform.common.crud.CrudModel;
import com.anjuxing.platform.common.util.CodeUtils;
import com.anjuxing.platform.common.util.DateUtils;
import com.anjuxing.platform.common.util.ValidateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 后台角色资源关系表
 */
public class UmsRoleResourceRelation extends CrudModel<UmsRoleResourceRelation> {

    private static final long serialVersionUID = 1L;

    private Long id; // 
    private Long roleId; // 角色ID
    private Long resourceId; // 资源ID

    /************************************************自定义字段***********************************************/

    public UmsRoleResourceRelation() {

    }

    /**
     * 获取
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色ID
     * @return Long
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取资源ID
     * @return Long
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源ID
     * @param resourceId
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /********************************************数据校验处理操作***********************************************/

    /**
     * 数据校验，插入数据之前执行，需要手动调用
     * @return
     */
    @Override
    public ValidateData validate() {
        ValidateData valid = new ValidateData();
        StringBuffer msg = new StringBuffer();
        boolean status = true;
        valid.setStatus(status);
        valid.setMessage(msg.toString());
        return valid;
    }

    /**
     * 插入数据之前执行方法，需要手动调用
     */
    @Override
    public void preInsert() {
        if (ValidateUtils.isEmpty(this.id)) {
            //this.id = CodeUtils.getUUID();
        }
    }

    /**
     * 更新数据之前执行方法，需要手动调用
     */
    @Override
    public void preUpdate() {

    }

    /**
     * 逻辑删除数据之前执行方法，需要手动调用
     * @param
     */
    @Override
    public void preCancel() {

    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName());
        sb.append("; id=" + (id == null ? "null" : id.toString()));
        sb.append("; roleId=" + (roleId == null ? "null" : roleId.toString()));
        sb.append("; resourceId=" + (resourceId == null ? "null" : resourceId.toString()));
        return sb.toString();
    }

}