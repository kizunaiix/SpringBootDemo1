package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//    @ResponseBody
    /**这个方法只会去templates文件夹里找html文件，文件名是这个方法返回的String*/
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


    @RequestMapping("/testing")
    public String testing(){
        return "testing";
    }


}
