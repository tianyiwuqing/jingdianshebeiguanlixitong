package com.lynu.controller;

import com.lynu.bean.TableAddequipmentbills;
import com.lynu.bean.TableEquipment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 天意无情
 * @date 2019-03-13 8:41
 */
@Controller
@RequestMapping("equipmentAddController")
public class EquipmentAddController {


    @RequestMapping("addEquipment" )
    public void addEquipment() {

        System.out.println("ok");
//        System.out.println(departmentId+":"+receptionperson);
//        System.out.println(addequipmentbills);
//        System.out.println(equipment);

    }
    @RequestMapping("test" )
    public void test(@RequestParam("name") String name,@RequestParam("passwords") String passwords) {

        System.out.println("No");
        System.out.println(name+":"+passwords);


    }


}
