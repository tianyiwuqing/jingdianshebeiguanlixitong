package com.lynu.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lynu.tools.MyDateFormat;

import java.util.Date;

public class TableEquipmentDetalis {
    private Integer id;

    private String equipmentId;

    private Integer equipmentType;

    private Integer equipmentFurnish;

    private String equipmentBrand;

    private Integer manufacturer;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date productdate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date usedate;

    private String fixType;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date fixenddate;

    private String fixtime;

    private String equipmentDetails;

    private Integer departmentId;

    private Integer employee;

    private Integer storage;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private Integer depreciationtype;

    private TableManufacturer tableManufacturer;

    public TableManufacturer getTableManufacturer() {
        return tableManufacturer;
    }

    public void setTableManufacturer(TableManufacturer tableManufacturer) {
        this.tableManufacturer = tableManufacturer;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public Integer getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Integer getEquipmentFurnish() {
        return equipmentFurnish;
    }

    public void setEquipmentFurnish(Integer equipmentFurnish) {
        this.equipmentFurnish = equipmentFurnish;
    }

    public String getEquipmentBrand() {
        return equipmentBrand;
    }

    public void setEquipmentBrand(String equipmentBrand) {
        this.equipmentBrand = equipmentBrand == null ? null : equipmentBrand.trim();
    }

    public Integer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Integer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getProductdate() {
        return productdate;
    }

    public void setProductdate(String productdate) {
        this.productdate = MyDateFormat.dateFormat(productdate);
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(String usedate) {
        this.usedate = MyDateFormat.dateFormat(usedate);
    }

    public String getFixType() {
        return fixType;
    }

    public void setFixType(String fixType) {
        this.fixType = fixType;
    }

    public Date getFixenddate() {
        return fixenddate;
    }

    public void setFixenddate(String fixenddate) {
        this.fixenddate = MyDateFormat.dateFormat(fixenddate);
    }

    public String getFixtime() {
        return fixtime;
    }

    public void setFixtime(String fixtime) {
        this.fixtime = fixtime == null ? null : fixtime.trim();
    }

    public String getEquipmentDetails() {
        return equipmentDetails;
    }

    public void setEquipmentDetails(String equipmentDetails) {
        this.equipmentDetails = equipmentDetails == null ? null : equipmentDetails.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String  createTime) {
        this.createTime = MyDateFormat.dateFormat(createTime);
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDepreciationtype() {
        return depreciationtype;
    }

    public void setDepreciationtype(Integer depreciationtype) {
        this.depreciationtype = depreciationtype;
    }

    @Override
    public String toString() {
        return "TableEquipmentDetalis{" +
                "id=" + id +
                ", equipmentId='" + equipmentId + '\'' +
                ", equipmentType=" + equipmentType +
                ", equipmentFurnish=" + equipmentFurnish +
                ", equipmentBrand='" + equipmentBrand + '\'' +
                ", manufacturer=" + manufacturer +
                ", productdate=" + productdate +
                ", usedate=" + usedate +
                ", fixType='" + fixType + '\'' +
                ", fixenddate=" + fixenddate +
                ", fixtime='" + fixtime + '\'' +
                ", equipmentDetails='" + equipmentDetails + '\'' +
                ", departmentId=" + departmentId +
                ", employee=" + employee +
                ", storage=" + storage +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", depreciationtype=" + depreciationtype +
                '}';
    }
}