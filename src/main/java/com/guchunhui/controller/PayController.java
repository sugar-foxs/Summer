package com.guchunhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gch on 16-11-27.
 */
@Controller
public class PayController {
    @RequestMapping("/gopay")
    public String gotopay(){
        return "pay";
    }
}
