package com.lynu.bean;

public class TableEquipment {
    private String id;

    private String equipmentName;

    private String equipmentStandard;

    private TableEquipmentDetalis equipmentDetalis;


    public TableEquipmentDetalis getEquipmentDetalis() {
        return equipmentDetalis;
    }

    public void setEquipmentDetalis(TableEquipmentDetalis equipmentDetalis) {
        this.equipmentDetalis = equipmentDetalis;
    }

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

    @Override
    public String toString() {
        return "TableEquipment{" +
                "id='" + id + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentStandard='" + equipmentStandard + '\'' +
                ", equipmentDetalis=" + equipmentDetalis +
                '}';
    }
}