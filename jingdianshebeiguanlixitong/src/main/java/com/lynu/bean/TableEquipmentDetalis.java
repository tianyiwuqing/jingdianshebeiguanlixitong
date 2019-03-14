package com.lynu.bean;

import java.util.Date;

public class TableEquipmentDetalis {
    private Integer id;

    private String equipmentId;

    private Integer equipmentType;

    private Integer equipmentFurnish;

    private String equipmentBrand;

    private Date productdate;

    private Date usedate;

    private Integer fixType;

    private Date fixenddate;

    private Date fixtime;

    private String equipmentDetails;

    private Integer departmentId;

    private Integer employee;

    private Integer storage;

    private Date createTime;

    private Date updateTime;

    private String depreciationtype;

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

    public Date getProductdate() {
        return productdate;
    }

    public void setProductdate(Date productdate) {
        this.productdate = productdate;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public Integer getFixType() {
        return fixType;
    }

    public void setFixType(Integer fixType) {
        this.fixType = fixType;
    }

    public Date getFixenddate() {
        return fixenddate;
    }

    public void setFixenddate(Date fixenddate) {
        this.fixenddate = fixenddate;
    }

    public Date getFixtime() {
        return fixtime;
    }

    public void setFixtime(Date fixtime) {
        this.fixtime = fixtime;
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

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDepreciationtype() {
        return depreciationtype;
    }

    public void setDepreciationtype(String depreciationtype) {
        this.depreciationtype = depreciationtype == null ? null : depreciationtype.trim();
    }
}