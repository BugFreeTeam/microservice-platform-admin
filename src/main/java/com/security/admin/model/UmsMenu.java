package com.security.admin.model;


import com.anjuxing.platform.common.base.ValidateData;
import com.anjuxing.platform.common.crud.CrudModel;
import com.anjuxing.platform.common.util.CodeUtils;
import com.anjuxing.platform.common.util.DateUtils;
import com.anjuxing.platform.common.util.ValidateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 后台菜单表
 */
public class UmsMenu extends CrudModel<UmsMenu> {

    private static final long serialVersionUID = 1L;

    private Long id; // 
    private Long parentId; // 父级ID
    private Object createTime; // 创建时间
    private String title; // 菜单名称
    private Integer level; // 菜单级数
    private Integer sort; // 菜单排序
    private String name; // 前端名称
    private String icon; // 前端图标
    private Integer hidden; // 前端隐藏

    /************************************************自定义字段***********************************************/

    public UmsMenu() {

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
     * 获取父级ID
     * @return Long
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父级ID
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * 获取菜单名称
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置菜单名称
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取菜单级数
     * @return Integer
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置菜单级数
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取菜单排序
     * @return Integer
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置菜单排序
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取前端名称
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置前端名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取前端图标
     * @return String
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置前端图标
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取前端隐藏
     * @return Integer
     */
    public Integer getHidden() {
        return hidden;
    }

    /**
     * 设置前端隐藏
     * @param hidden
     */
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
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
        sb.append("; parentId=" + (parentId == null ? "null" : parentId.toString()));
        sb.append("; createTime=" + (createTime == null ? "null" : createTime.toString()));
        sb.append("; title=" + (title == null ? "null" : title.toString()));
        sb.append("; level=" + (level == null ? "null" : level.toString()));
        sb.append("; sort=" + (sort == null ? "null" : sort.toString()));
        sb.append("; name=" + (name == null ? "null" : name.toString()));
        sb.append("; icon=" + (icon == null ? "null" : icon.toString()));
        sb.append("; hidden=" + (hidden == null ? "null" : hidden.toString()));
        return sb.toString();
    }

}