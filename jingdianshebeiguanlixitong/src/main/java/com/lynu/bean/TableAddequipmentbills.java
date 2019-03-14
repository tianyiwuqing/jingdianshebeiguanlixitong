package com.lynu.bean;

import java.util.Date;

public class TableAddequipmentbills {
    private Integer id;

    private String billsnumber;

    private String departmentId;

    private String receptionperson;

    private Date purchaseTime;

    private String abstarct;

    private String equipmentFurnish;

    private String operatorperson;

    private Integer isDelate;

    private String billsperson;

    private String money;

    private String usedir;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillsnumber() {
        return billsnumber;
    }

    public void setBillsnumber(String billsnumber) {
        this.billsnumber = billsnumber == null ? null : billsnumber.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getReceptionperson() {
        return receptionperson;
    }

    public void setReceptionperson(String receptionperson) {
        this.receptionperson = receptionperson == null ? null : receptionperson.trim();
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getAbstract() {
        return abstarct;
    }

    public void setAbstract(String abstarct) {
        this.abstarct = abstarct == null ? null : abstarct.trim();
    }

    public String getEquipmentFurnish() {
        return equipmentFurnish;
    }

    public void setEquipmentFurnish(String equipmentFurnish) {
        this.equipmentFurnish = equipmentFurnish == null ? null : equipmentFurnish.trim();
    }

    public String getOperatorperson() {
        return operatorperson;
    }

    public void setOperatorperson(String operatorperson) {
        this.operatorperson = operatorperson == null ? null : operatorperson.trim();
    }

    public Integer getIsDelate() {
        return isDelate;
    }

    public void setIsDelate(Integer isDelate) {
        this.isDelate = isDelate;
    }

    public String getBillsperson() {
        return billsperson;
    }

    public void setBillsperson(String billsperson) {
        this.billsperson = billsperson == null ? null : billsperson.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getUsedir() {
        return usedir;
    }

    public void setUsedir(String usedir) {
        this.usedir = usedir == null ? null : usedir.trim();
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
}