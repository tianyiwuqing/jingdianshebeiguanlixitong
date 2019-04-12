package com.lynu.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lynu.tools.MyDateFormat;

import java.util.Date;

public class TableScrap {
    private Integer id;

    private String scrapbills;

    private String equipmentcode;

    private String equipmentid;

    private TableEquipment equipment;

    private String scrapAbstract;

    private String responsible;

    private TableEmployee responsibleEmployee;

    private String departmentId;

    private TableDepartment department;

    private String auditor;

    private TableEmployee auditorEmployee;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date auditTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date scrapTime;

    private Integer isDelate;

    private String isDelateStr;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private String createbillsemployeeid;

    private TableEmployee createEmployee;

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid;
    }

    public TableEmployee getCreateEmployee() {
        return createEmployee;
    }

    public void setCreateEmployee(TableEmployee createEmployee) {
        this.createEmployee = createEmployee;
    }

    public TableEmployee getResponsibleEmployee() {
        return responsibleEmployee;
    }

    public void setResponsibleEmployee(TableEmployee responsibleEmployee) {
        this.responsibleEmployee = responsibleEmployee;
    }

    public TableDepartment getDepartment() {
        return department;
    }

    public void setDepartment(TableDepartment department) {
        this.department = department;
    }

    public TableEmployee getAuditorEmployee() {
        return auditorEmployee;
    }

    public void setAuditorEmployee(TableEmployee auditorEmployee) {
        this.auditorEmployee = auditorEmployee;
    }

    public String getIsDelateStr() {
        return isDelateStr;
    }

    public void setIsDelateStr(String isDelateStr) {
        this.isDelateStr = isDelateStr;
    }

    public TableEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(TableEquipment equipment) {
        this.equipment = equipment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScrapbills() {
        return scrapbills;
    }

    public void setScrapbills(String scrapbills) {
        this.scrapbills = scrapbills == null ? null : scrapbills.trim();
    }

    public String getEquipmentcode() {
        return equipmentcode;
    }

    public void setEquipmentcode(String equipmentcode) {
        this.equipmentcode = equipmentcode == null ? null : equipmentcode.trim();
    }

    public String getScrapAbstract() {
        return scrapAbstract;
    }

    public void setScrapAbstract(String scrapAbstract) {
        this.scrapAbstract = scrapAbstract == null ? null : scrapAbstract.trim();
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible == null ? null : responsible.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = MyDateFormat.dateFormat(auditTime);
    }

    public Date getScrapTime() {
        return scrapTime;
    }

    public void setScrapTime(String scrapTime) {
        this.scrapTime = MyDateFormat.dateFormat(scrapTime);
    }

    public Integer getIsDelate() {
        return isDelate;
    }

    public void setIsDelate(Integer isDelate) {
        this.isDelate = isDelate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = MyDateFormat.dateFormat(createTime);
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatebillsemployeeid() {
        return createbillsemployeeid;
    }

    @Override
    public String toString() {
        return "TableScrap{" +
                "id=" + id +
                ", scrapbills='" + scrapbills + '\'' +
                ", equipmentcode='" + equipmentcode + '\'' +
                ", scrapAbstract='" + scrapAbstract + '\'' +
                ", responsible='" + responsible + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", auditor='" + auditor + '\'' +
                ", auditTime=" + auditTime +
                ", scrapTime=" + scrapTime +
                ", isDelate=" + isDelate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createbillsemployeeid='" + createbillsemployeeid + '\'' +
                '}';
    }

    public void setCreatebillsemployeeid(String createbillsemployeeid) {
        this.createbillsemployeeid = createbillsemployeeid == null ? null : createbillsemployeeid.trim();

    }
}