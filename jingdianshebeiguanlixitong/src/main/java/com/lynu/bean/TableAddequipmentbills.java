package com.lynu.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lynu.tools.MyDateFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 天意无情
 */
public class TableAddequipmentbills implements Serializable {
    private Integer id;

    private String billsnumber;

    private Integer equipmentId;

    private String departmentId;

    private String shopdepartmentId;

    private String receptionperson;

    private TableEmployee receptionEmployee;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date purchaseTime;

    private String abstractdetails;

    private String equipmentFurnish;

    private String operatorperson;

    private Integer isDelate;

    private String billsperson;

    private String money;

    private String usedir;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private String checkingperson;

    private String address;

    private Integer count;

    private TableFurnish furnish;

    private TableEmployee billsEmployee;

    private TableDepartment department;

    private TableEmployee checkingpersonEmployee;

    private TableEmployee operatorpersonEmployee;

    private TableStorage storage;

    private TableDepartment shopdepartment;

    private TableEquipment equipment;

    private TableEquipmentType tableEquipmentType;

    private TableManufacturer tableManufacturer;

    public TableManufacturer getTableManufacturer() {
        return tableManufacturer;
    }

    public void setTableManufacturer(TableManufacturer tableManufacturer) {
        this.tableManufacturer = tableManufacturer;
    }

    public TableEquipmentType getTableEquipmentType() {
        return tableEquipmentType;
    }

    public void setTableEquipmentType(TableEquipmentType tableEquipmentType) {
        this.tableEquipmentType = tableEquipmentType;
    }

    public TableEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(TableEquipment equipment) {
        this.equipment = equipment;
    }

    public TableDepartment getShopdepartment() {
        return shopdepartment;
    }

    public void setShopdepartment(TableDepartment shopdepartment) {
        this.shopdepartment = shopdepartment;
    }

    public TableEmployee getOperatorpersonEmployee() {
        return operatorpersonEmployee;
    }

    public void setOperatorpersonEmployee(TableEmployee operatorpersonEmployee) {
        this.operatorpersonEmployee = operatorpersonEmployee;
    }

    public TableStorage getStorage() {
        return storage;
    }

    public void setStorage(TableStorage storage) {
        this.storage = storage;
    }

    public TableEmployee getCheckingpersonEmployee() {
        return checkingpersonEmployee;
    }

    public void setCheckingpersonEmployee(TableEmployee checkingpersonEmployee) {
        this.checkingpersonEmployee = checkingpersonEmployee;
    }

    public TableEmployee getReceptionEmployee() {
        return receptionEmployee;
    }

    public void setReceptionEmployee(TableEmployee receptionEmployee) {
        this.receptionEmployee = receptionEmployee;
    }

    public TableDepartment getDepartment() {
        return department;
    }

    public void setDepartment(TableDepartment department) {
        this.department = department;
    }

    public TableEmployee getBillsEmployee() {
        return billsEmployee;
    }

    public void setBillsEmployee(TableEmployee billsEmployee) {
        this.billsEmployee = billsEmployee;
    }

    public TableFurnish getFurnish() {
        return furnish;
    }

    public void setFurnish(TableFurnish furnish) {
        this.furnish = furnish;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

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

    public String getShopdepartmentId() {
        return shopdepartmentId;
    }

    public void setShopdepartmentId(String shopdepartmentId) {
        this.shopdepartmentId = shopdepartmentId == null ? null : shopdepartmentId.trim();
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


    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = MyDateFormat.dateFormat(purchaseTime);
    }

    public String getAbstractdetails() {
        return abstractdetails;
    }

    public void setAbstractdetails(String abstractdetails) {
        this.abstractdetails = abstractdetails == null ? null : abstractdetails.trim();
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

    public void setCreateTime(String createTime) {
        this.createTime = MyDateFormat.dateFormat(createTime);
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCheckingperson() {
        return checkingperson;
    }

    public void setCheckingperson(String checkingperson) {
        this.checkingperson = checkingperson == null ? null : checkingperson.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "TableAddequipmentbills{" +
                "id=" + id +
                ", billsnumber='" + billsnumber + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", shopdepartmentId='" + shopdepartmentId + '\'' +
                ", receptionperson='" + receptionperson + '\'' +
                ", purchaseTime=" + purchaseTime +
                ", abstractdetails='" + abstractdetails + '\'' +
                ", equipmentFurnish='" + equipmentFurnish + '\'' +
                ", operatorperson='" + operatorperson + '\'' +
                ", isDelate=" + isDelate +
                ", billsperson='" + billsperson + '\'' +
                ", money='" + money + '\'' +
                ", usedir='" + usedir + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", checkingperson='" + checkingperson + '\'' +
                ", address='" + address + '\'' +
                ", count=" + count +
                '}';
    }
}