package com.lynu.controller;

import com.lynu.bean.*;
import com.lynu.service.EquipmentAddService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-03-13 8:41
 */
@Controller
@RequestMapping("equipmentAddController")
public class EquipmentAddController {

    @Resource
    private EquipmentAddService equipmentAddService;

    @RequestMapping(value = "addEquipment", method = RequestMethod.POST)
    public String addEquipment(TableAddequipmentbills addequipmentbills, TableEquipment equipment, TableEquipmentDetalis equipmentDetalis ) {
        boolean b = equipmentAddService.addEquipment(addequipmentbills, equipment,equipmentDetalis);
        if (b){
            return "member-list";
        }else {
            return "error";
        }
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
    private List<TableEmployee> departmentOfEmployee(String did) {
        return equipmentAddService.departmentOfEmployee(did);

    }

    @RequestMapping("chaCheckingperson")
    @ResponseBody
    List<TableEmployee> chaCheckingperson() {
        return equipmentAddService.chaCheckingperson();
    }

    @RequestMapping("chaStorage")
    @ResponseBody
    public List<TableStorage> chaStorage() {
        return equipmentAddService.chaStorage();
    }

    @RequestMapping("chaOperatorpersonAddBillsperson")
    @ResponseBody
    public List<TableEmployee> chaOperatorpersonAddBillsperson() {
        return equipmentAddService.chaOperatorpersonAddBillsperson();
    }

    @RequestMapping("chaFurnish")
    @ResponseBody
    public List<TableFurnish> chaFurnish() {
        return equipmentAddService.chaFurnish();
    }

    @RequestMapping("chaAllManufacturer")
    @ResponseBody
    List<TableManufacturer> chaAllManufacturer() {
        return equipmentAddService.chaAllManufacturer();
    }

    @RequestMapping("chaEquipmentType")
    @ResponseBody
    List<TableEquipmentType> chaEquipmentType() {
        return equipmentAddService.chaEquipmentType();
    }

    @RequestMapping("chaAddequipmentbills")
    @ResponseBody
    public List<TableAddequipmentbills> chaAddequipmentbills(){
        return equipmentAddService.chaAddequipmentbills();
    }

    @RequestMapping("delAddquipmentbills")
    @ResponseBody
    public boolean delAddquipmentbills(String aid){
        System.out.println("controller come on "+aid);
       return equipmentAddService.delAddquipmentbills(aid);
    }
    @RequestMapping("delAllAddquipmentbills")
    @ResponseBody
    public boolean delAllAddquipmentbills(){
        return equipmentAddService.delAllAddquipmentbills();
    }
    @RequestMapping("chaDateAddEquipmentbills")
    @ResponseBody
    public List<TableAddequipmentbills> chaDateAddEquipmentbills(String startTime, String endTime){
        System.out.println(startTime+":"+endTime);
        List<TableAddequipmentbills> tableAddequipmentbills = equipmentAddService.chaDateAddEquipmentbills(startTime, endTime);
        for (TableAddequipmentbills tableAddequipmentbill : tableAddequipmentbills) {
            System.out.println(tableAddequipmentbill);
        }
        return  equipmentAddService.chaDateAddEquipmentbills(startTime,endTime);
    }

    @RequestMapping("chaKeyAddEquipment")
    public String  chaKeyAddEquipment(String aid, ModelMap modelMap){
        System.out.println(aid+"chakeyaddEquipment ok");
        TableAddequipmentbills addequipmentbills = equipmentAddService.chaKeyAddEquipment(aid);
        System.out.println(addequipmentbills);
        modelMap.addAttribute("addequipmentbills",addequipmentbills);
        return "equipment-edit";
    }
}
