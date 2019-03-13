package com.lynu.bean;

public class TableStorage {
    private Integer id;

    private String name;

    private String address;

    private String telephone;

    private String relationperson;

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

    public String getRelationperson() {
        return relationperson;
    }

    public void setRelationperson(String relationperson) {
        this.relationperson = relationperson == null ? null : relationperson.trim();
    }
}