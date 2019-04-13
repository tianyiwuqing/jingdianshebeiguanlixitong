package com.lynu.bean;

import java.util.Date;

public class TableDepartment {
    private Integer id;

    private String name;

    private String address;

    private String telephone;

    private String departmentdescribe;

    private Integer isDelete;

    private Integer newisDelete;

    private String isDeleteStr;

    private Date updateTime;

    private Date createTime;

    private String ownemployee;

    private String newownemployee;


    private TableEmployee employee;

    public Integer getNewisDelete() {
        return newisDelete;
    }

    public void setNewisDelete(Integer newisDelete) {
        this.newisDelete = newisDelete;
    }

    public String getNewownemployee() {
        return newownemployee;
    }

    public void setNewownemployee(String newownemployee) {
        this.newownemployee = newownemployee;
    }

    public String getIsDeleteStr() {
        return isDeleteStr;
    }

    public void setIsDeleteStr(String isDeleteStr) {
        this.isDeleteStr = isDeleteStr;
    }

    public TableEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(TableEmployee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getDepartmentdescribe() {
        return departmentdescribe;
    }

    public void setDepartmentdescribe(String departmentdescribe) {
        this.departmentdescribe = departmentdescribe == null ? null : departmentdescribe.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOwnemployee() {
        return ownemployee;
    }

    public void setOwnemployee(String ownemployee) {
        this.ownemployee = ownemployee == null ? null : ownemployee.trim();
    }

    @Override
    public String toString() {
        return "TableDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", departmentdescribe='" + departmentdescribe + '\'' +
                ", isDelete=" + isDelete +
                ", isDeleteStr='" + isDeleteStr + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", ownemployee='" + ownemployee + '\'' +
                ", employee=" + employee +
                '}';
    }
}