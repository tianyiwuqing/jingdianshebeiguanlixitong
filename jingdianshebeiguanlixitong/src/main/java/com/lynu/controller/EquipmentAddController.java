package com.lynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 天意无情
 * @date 2019-03-13 8:41
 */
@Controller("equipmentAddController")
public class EquipmentAddController {


    @RequestMapping("addEquipment")
    public void addEquipment() {

        System.out.println("ok");

    }


}
