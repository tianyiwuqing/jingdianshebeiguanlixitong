package com.lynu.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TableRepertoryOut {
    private Integer id;

    private String repertoryoutbills;

    private String equipmentcode;

    private String receivedepartmentid;

    private String receiveemployeeid;

    private String createemployeeid;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updateTime;

    private String codeabstract;

    private Integer isDelate;

    private TableDepartment  receiveDepartment;

    private TableEmployee receiveEmployee;

    private TableEmployee createEmployee;

    public TableEmployee getCreateEmployee() {
        return createEmployee;
    }

    public void setCreateEmployee(TableEmployee createEmployee) {
        this.createEmployee = createEmployee;
    }

    public TableEmployee getReceiveEmployee() {
        return receiveEmployee;
    }

    public void setReceiveEmployee(TableEmployee receiveEmployee) {
        this.receiveEmployee = receiveEmployee;
    }

    public TableDepartment getReceiveDepartment() {
        return receiveDepartment;
    }

    public void setReceiveDepartment(TableDepartment receiveDepartment) {
        this.receiveDepartment = receiveDepartment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepertoryoutbills() {
        return repertoryoutbills;
    }

    public void setRepertoryoutbills(String repertoryoutbills) {
        this.repertoryoutbills = repertoryoutbills == null ? null : repertoryoutbills.trim();
    }

    public String getEquipmentcode() {
        return equipmentcode;
    }

    public void setEquipmentcode(String equipmentcode) {
        this.equipmentcode = equipmentcode == null ? null : equipmentcode.trim();
    }

    public String getReceivedepartmentid() {
        return receivedepartmentid;
    }

    public void setReceivedepartmentid(String receivedepartmentid) {
        this.receivedepartmentid = receivedepartmentid == null ? null : receivedepartmentid.trim();
    }

    public String getReceiveemployeeid() {
        return receiveemployeeid;
    }

    public void setReceiveemployeeid(String receiveemployeeid) {
        this.receiveemployeeid = receiveemployeeid == null ? null : receiveemployeeid.trim();
    }

    public String getCreateemployeeid() {
        return createemployeeid;
    }

    public void setCreateemployeeid(String createemployeeid) {
        this.createemployeeid = createemployeeid == null ? null : createemployeeid.trim();
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

    public String getCodeabstract() {
        return codeabstract;
    }

    public void setCodeabstract(String codeabstract) {
        this.codeabstract = codeabstract == null ? null : codeabstract.trim();
    }

    public Integer getIsDelate() {
        return isDelate;
    }

    public void setIsDelate(Integer isDelate) {
        this.isDelate = isDelate;
    }

    @Override
    public String toString() {
        return "TableRepertoryOut{" +
                "id=" + id +
                ", repertoryoutbills='" + repertoryoutbills + '\'' +
                ", equipmentcode='" + equipmentcode + '\'' +
                ", receivedepartmentid='" + receivedepartmentid + '\'' +
                ", receiveemployeeid='" + receiveemployeeid + '\'' +
                ", createemployeeid='" + createemployeeid + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", codeabstract='" + codeabstract + '\'' +
                ", isDelate=" + isDelate +
                '}';
    }
}