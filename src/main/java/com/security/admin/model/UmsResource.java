package com.security.admin.model;


import com.anjuxing.platform.common.base.ValidateData;
import com.anjuxing.platform.common.crud.CrudModel;
import com.anjuxing.platform.common.util.CodeUtils;
import com.anjuxing.platform.common.util.DateUtils;
import com.anjuxing.platform.common.util.ValidateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 后台资源表
 */
public class UmsResource extends CrudModel<UmsResource> {

    private static final long serialVersionUID = 1L;

    private Long id; // 
    private Object createTime; // 创建时间
    private String name; // 资源名称
    private String url; // 资源URL
    private String description; // 描述
    private Long categoryId; // 资源分类ID

    /************************************************自定义字段***********************************************/

    public UmsResource() {

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
     * 获取创建时间
     * @return Object
     */
    public Object getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime
     */
    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取资源名称
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资源URL
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源URL
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取描述
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取资源分类ID
     * @return Long
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置资源分类ID
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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
        sb.append("; createTime=" + (createTime == null ? "null" : createTime.toString()));
        sb.append("; name=" + (name == null ? "null" : name.toString()));
        sb.append("; url=" + (url == null ? "null" : url.toString()));
        sb.append("; description=" + (description == null ? "null" : description.toString()));
        sb.append("; categoryId=" + (categoryId == null ? "null" : categoryId.toString()));
        return sb.toString();
    }

}