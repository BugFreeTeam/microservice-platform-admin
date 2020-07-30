package com.security.admin.model;


import com.anjuxing.platform.common.base.ValidateData;
import com.anjuxing.platform.common.crud.CrudModel;
import com.anjuxing.platform.common.util.CodeUtils;
import com.anjuxing.platform.common.util.DateUtils;
import com.anjuxing.platform.common.util.ValidateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 后台用户表
 */
public class UmsAdmin extends CrudModel<UmsAdmin> {

    private static final long serialVersionUID = 1L;

    private Long id; // 
    private String username; // 
    private String password; // 
    private String icon; // 头像
    private String email; // 邮箱
    private String nickName; // 昵称
    private String note; // 备注信息
    private Object createTime; // 创建时间
    private Object loginTime; // 最后登录时间
    private Integer status; // 帐号启用状态：0->禁用；1->启用

    /************************************************自定义字段***********************************************/

    public UmsAdmin() {

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
     * 获取
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取头像
     * @return String
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置头像
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取邮箱
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取昵称
     * @return String
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取备注信息
     * @return String
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注信息
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
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
     * 获取最后登录时间
     * @return Object
     */
    public Object getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     * @param loginTime
     */
    public void setLoginTime(Object loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取帐号启用状态：0->禁用；1->启用
     * @return Integer
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置帐号启用状态：0->禁用；1->启用
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append("; username=" + (username == null ? "null" : username.toString()));
        sb.append("; password=" + (password == null ? "null" : password.toString()));
        sb.append("; icon=" + (icon == null ? "null" : icon.toString()));
        sb.append("; email=" + (email == null ? "null" : email.toString()));
        sb.append("; nickName=" + (nickName == null ? "null" : nickName.toString()));
        sb.append("; note=" + (note == null ? "null" : note.toString()));
        sb.append("; createTime=" + (createTime == null ? "null" : createTime.toString()));
        sb.append("; loginTime=" + (loginTime == null ? "null" : loginTime.toString()));
        sb.append("; status=" + (status == null ? "null" : status.toString()));
        return sb.toString();
    }

}