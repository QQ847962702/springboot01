package com.pw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Date 2022/8/23 8:23
 * @Author pengwei
 **/
@Controller
public class HelloController {
    /**
     * springboot 的可直接 访问的目录
     * resources/public
     * resources/static
     * 其他目录 无法直接访问 可通过视图解析器访问
     */

    @RequestMapping("/hello")
    @ResponseBody
    public  String hello(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","SprinBoot!");
        return "hello";
    }
}
