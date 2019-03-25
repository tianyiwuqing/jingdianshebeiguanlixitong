package com.lynu.controller;

import com.lynu.bean.*;
import com.lynu.service.EquipmentAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 天意无情
 * @date 2019-03-13 8:41
 */
@Controller
@RequestMapping("equipmentAddController")
public class EquipmentAddController {

    @Autowired
    private EquipmentAddService equipmentAddService;

    @RequestMapping(value = "addEquipment", method= RequestMethod.POST)
    public void   addEquipment(TableAddequipmentbills addequipmentbills,TableEquipment equipment,TableEquipmentDetalis equipmentDetalis,String count) {
        System.out.println("ok");
        System.out.println(addequipmentbills);
        System.out.println(equipment);
        System.out.println(equipmentDetalis);
        equipment.setEquipmentDetalis(equipmentDetalis);
        addequipmentbills.setEquipment(equipment);
        System.out.println(count);
//        boolean b = equipmentAddService.addEquipment(addequipmentbills, count);
    }

    /**
     * 测试接口
     */
    @RequestMapping("test")
    public void test(TableAddequipmentbills tableAddequipmentbills) {
        System.out.println("No");
        System.out.println(tableAddequipmentbills);
    }

    @RequestMapping("chaAllDepartment")
    @ResponseBody
    private List<TableDepartment> chaAllDepartment() {
        return equipmentAddService.chaAllDepartment();
    }
    @RequestMapping("departmentOfEmployee")
    @ResponseBody
    private List<TableEmployee> departmentOfEmployee(String did){
        return equipmentAddService.departmentOfEmployee(did);

    }
    @RequestMapping("chaCheckingperson")
    @ResponseBody
    List<TableEmployee> chaCheckingperson(){
        return equipmentAddService.chaCheckingperson();
    }

    @RequestMapping("chaStorage")
    @ResponseBody
    public List<TableStorage> chaStorage(){
        return equipmentAddService.chaStorage();
    }

    @RequestMapping("chaOperatorpersonAddBillsperson")
    @ResponseBody
    public List<TableEmployee> chaOperatorpersonAddBillsperson(){
        return equipmentAddService.chaOperatorpersonAddBillsperson();
    }

    @RequestMapping("chaFurnish")
    @ResponseBody
    public List<TableFurnish> chaFurnish(){
        return  equipmentAddService.chaFurnish();
    }

    @RequestMapping("chaAllManufacturer")
    @ResponseBody
    List<TableManufacturer> chaAllManufacturer(){
        return  equipmentAddService.chaAllManufacturer();
    }

    @RequestMapping("chaEquipmentType")
    @ResponseBody
    List<TableEquipmentType> chaEquipmentType(){
        return equipmentAddService.chaEquipmentType();
    }

}
