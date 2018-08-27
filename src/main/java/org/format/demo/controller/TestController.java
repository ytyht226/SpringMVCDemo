package org.format.demo.controller;

import org.format.demo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanghuitao on 2018/8/24.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping("/testRb")
    @ResponseBody
    public Employee testRb(@RequestBody Employee e) {
        return e;
    }

    @RequestMapping("/testCustomObj")
    @ResponseBody
    public Employee testCustomObj(Employee e) {
        return e;
    }

    @RequestMapping("/testCustomObjWithRp")
    @ResponseBody
    public Employee testCustomObjWithRp(@RequestParam Employee e) {
        return e;
    }

    @RequestMapping("/testDate")
    @ResponseBody
    public Date testDate(Date date) {
        return date;
    }

    public static void main(String[] args) {
        Map map = new HashMap<>();
        System.out.println(String.class.isAssignableFrom(map.getClass()));
    }
}