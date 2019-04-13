package com.lynu.bean;

import java.util.Date;

public class TableEmployee {
    private Integer id;

    private String employeename;

    private String username;

    private String password;

    private Integer sex;

    private String sexStr;

    private String telephone;

    private String address;

    private Integer isValid;

    private String isValidStr;

    private Integer isLeader;

    private String isLeaderStr;

    private String description;

    private String departmentId;

    private String departmentName;

    private Integer type;

    private Integer delFlag;

    private String delFlagStr;

    private String photograph;

    private Date createTime;

    private Date updateTime;

    private TableDepartment department;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSexStr() {
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }

    public String getIsValidStr() {
        return isValidStr;
    }

    public void setIsValidStr(String isValidStr) {
        this.isValidStr = isValidStr;
    }

    public String getIsLeaderStr() {
        return isLeaderStr;
    }

    public void setIsLeaderStr(String isLeaderStr) {
        this.isLeaderStr = isLeaderStr;
    }

    public String getDelFlagStr() {
        return delFlagStr;
    }

    public void setDelFlagStr(String delFlagStr) {
        this.delFlagStr = delFlagStr;
    }

    public TableDepartment getDepartment() {
        return department;
    }

    public void setDepartment(TableDepartment department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getPhotograph() {
        return photograph;
    }

    public void setPhotograph(String photograph) {
        this.photograph = photograph == null ? null : photograph.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "TableEmployee{" +
                "id=" + id +
                ", employeename='" + employeename + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", isValid=" + isValid +
                ", isLeader=" + isLeader +
                ", description='" + description + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", type=" + type +
                ", delFlag=" + delFlag +
                ", photograph='" + photograph + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}