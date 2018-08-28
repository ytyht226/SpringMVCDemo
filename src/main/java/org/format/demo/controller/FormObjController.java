package org.format.demo.controller;

import org.format.demo.model.Dept;
import org.format.demo.model.Employee;
import org.format.demo.resolver.FormObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanghuitao on 2018/8/27.
 */
@Controller
@RequestMapping(value = "/foc")
public class FormObjController {
    @RequestMapping("/test1")
    public String test1(@FormObj Dept dept, @FormObj Employee emp) {
        return "index";
    }

    @RequestMapping("/test2")
    public String test2(@FormObj("d") Dept dept, @FormObj("e") Employee emp) {
        return "index";
    }

    @RequestMapping("/test3")
    public String test3(@FormObj(value = "d", show = false) Dept dept, @FormObj("e") Employee emp) {
        return "index";
    }
}