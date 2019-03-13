package com.lynu.bean;

public class TableEquipmentFixtype {
    private Integer id;

    private String name;

    private String typeDetails;

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

    public String getTypeDetails() {
        return typeDetails;
    }

    public void setTypeDetails(String typeDetails) {
        this.typeDetails = typeDetails == null ? null : typeDetails.trim();
    }
}