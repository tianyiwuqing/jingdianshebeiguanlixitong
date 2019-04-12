package com.lynu.bean;

import java.util.Date;

public class TableRepertory {
    private Integer id;

    private String equipmentuniquecode;

    private Integer equipmentId;

    private Integer addressStongId;

    private Date createIntime;

    private Date createOuttime;

    private Date shopTime;

    private Date updateTime;

    private Integer departmentOutId;

    private Integer employeeOutId;

    private String telephone;

    private Integer state;

    private String startstr;

    private Integer owndepartment;

    private Integer functionary;

    private Integer isDeleter;

    private String isDeleterStr;

    private Integer isDamage;

    private String isDamageStr;

    private TableEquipment equipment;

    private TableStorage storage;

    private TableDepartment department;

    private TableFurnish furnish;

    private TableEmployee functionaryEmployee;


    public String getIsDeleterStr() {
        return isDeleterStr;
    }

    public void setIsDeleterStr(String isDeleterStr) {
        this.isDeleterStr = isDeleterStr;
    }

    public String getStartstr() {
        return startstr;
    }

    public void setStartstr(String startstr) {
        this.startstr = startstr;
    }

    public Integer getIsDamage() {
        return isDamage;
    }

    public void setIsDamage(Integer isDamage) {
        this.isDamage = isDamage;
    }

    public String getIsDamageStr() {
        return isDamageStr;
    }

    public void setIsDamageStr(String isDamageStr) {
        this.isDamageStr = isDamageStr;
    }

    public TableEmployee getFunctionaryEmployee() {
        return functionaryEmployee;
    }

    public void setFunctionaryEmployee(TableEmployee functionaryEmployee) {
        this.functionaryEmployee = functionaryEmployee;
    }

    public TableFurnish getFurnish() {
        return furnish;
    }

    public void setFurnish(TableFurnish furnish) {
        this.furnish = furnish;
    }

    public TableDepartment getDepartment() {
        return department;
    }

    public void setDepartment(TableDepartment department) {
        this.department = department;
    }

    public TableStorage getStorage() {
        return storage;
    }

    public void setStorage(TableStorage storage) {
        this.storage = storage;
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

    public String getEquipmentuniquecode() {
        return equipmentuniquecode;
    }

    public void setEquipmentuniquecode(String equipmentuniquecode) {
        this.equipmentuniquecode = equipmentuniquecode == null ? null : equipmentuniquecode.trim();
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getAddressStongId() {
        return addressStongId;
    }

    public void setAddressStongId(Integer addressStongId) {
        this.addressStongId = addressStongId;
    }

    public Date getCreateIntime() {
        return createIntime;
    }

    public void setCreateIntime(Date createIntime) {
        this.createIntime = createIntime;
    }

    public Date getCreateOuttime() {
        return createOuttime;
    }

    public void setCreateOuttime(Date createOuttime) {
        this.createOuttime = createOuttime;
    }

    public Date getShopTime() {
        return shopTime;
    }

    public void setShopTime(Date shopTime) {
        this.shopTime = shopTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDepartmentOutId() {
        return departmentOutId;
    }

    public void setDepartmentOutId(Integer departmentOutId) {
        this.departmentOutId = departmentOutId;
    }

    public Integer getEmployeeOutId() {
        return employeeOutId;
    }

    public void setEmployeeOutId(Integer employeeOutId) {
        this.employeeOutId = employeeOutId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOwndepartment() {
        return owndepartment;
    }

    public void setOwndepartment(Integer owndepartment) {
        this.owndepartment = owndepartment;
    }

    public Integer getFunctionary() {
        return functionary;
    }

    public void setFunctionary(Integer functionary) {
        this.functionary = functionary;
    }

    public Integer getIsDeleter() {
        return isDeleter;
    }

    public void setIsDeleter(Integer isDeleter) {
        this.isDeleter = isDeleter;
    }

    @Override
    public String toString() {
        return "TableRepertory{" +
                "id=" + id +
                ", equipmentuniquecode='" + equipmentuniquecode + '\'' +
                ", equipmentId=" + equipmentId +
                ", addressStongId=" + addressStongId +
                ", createIntime=" + createIntime +
                ", createOuttime=" + createOuttime +
                ", shopTime=" + shopTime +
                ", updateTime=" + updateTime +
                ", departmentOutId=" + departmentOutId +
                ", employeeOutId=" + employeeOutId +
                ", telephone='" + telephone + '\'' +
                ", state=" + state +
                ", startstr='" + startstr + '\'' +
                ", owndepartment=" + owndepartment +
                ", functionary=" + functionary +
                ", isDeleter=" + isDeleter +
                ", isDeleterStr='" + isDeleterStr + '\'' +
                ", isDamage=" + isDamage +
                ", isDamageStr='" + isDamageStr + '\'' +
                ", equipment=" + equipment +
                ", storage=" + storage +
                ", department=" + department +
                ", furnish=" + furnish +
                ", functionaryEmployee=" + functionaryEmployee +
                '}';
    }
}