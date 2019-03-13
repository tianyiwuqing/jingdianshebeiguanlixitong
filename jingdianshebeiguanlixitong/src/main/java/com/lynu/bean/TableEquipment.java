package com.lynu.bean;

public class TableEquipment {
    private String id;

    private String equipmentName;

    private String equipmentStandard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getEquipmentStandard() {
        return equipmentStandard;
    }

    public void setEquipmentStandard(String equipmentStandard) {
        this.equipmentStandard = equipmentStandard == null ? null : equipmentStandard.trim();
    }
}