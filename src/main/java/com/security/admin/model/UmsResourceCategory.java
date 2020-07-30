package com.security.admin.model;


import com.anjuxing.platform.common.base.ValidateData;
import com.anjuxing.platform.common.crud.CrudModel;
import com.anjuxing.platform.common.util.CodeUtils;
import com.anjuxing.platform.common.util.DateUtils;
import com.anjuxing.platform.common.util.ValidateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 资源分类表
 */
public class UmsResourceCategory extends CrudModel<UmsResourceCategory> {

    private static final long serialVersionUID = 1L;

    private Long id; // 
    private Object createTime; // 创建时间
    private String name; // 分类名称
    private Integer sort; // 排序

    /************************************************自定义字段***********************************************/

    public UmsResourceCategory() {

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
     * 获取分类名称
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取排序
     * @return Integer
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
        sb.append("; sort=" + (sort == null ? "null" : sort.toString()));
        return sb.toString();
    }

}