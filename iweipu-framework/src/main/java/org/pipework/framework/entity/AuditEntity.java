/*
 * 文件名称: AuditEntity.java
 * 版权信息: Copyright 2005-2013 Allen.Hu Inc. All right reserved.
 * ----------------------------------------------------------------------------------------------
 * 修改历史:
 * ----------------------------------------------------------------------------------------------
 * 修改原因: 新增
 * 修改人员: Allen.Hu
 * 修改日期: 2013-6-22
 * 修改内容: 
 */
package org.pipework.framework.entity;

import java.util.Date;

import com.google.gson.annotations.Expose;

public class AuditEntity extends IdEntity {

    private static final long serialVersionUID = -3834040296262115688L;

    public static final String CREATE_USER_SYSTEM = "SYSTEM";
    
    @Expose private String createUser = CREATE_USER_SYSTEM;

    @Expose private Date createTime = new Date();

    @Expose private String modifyUser;

    @Expose private Date modifyTime;
    
    @Expose private Integer delete;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

}
