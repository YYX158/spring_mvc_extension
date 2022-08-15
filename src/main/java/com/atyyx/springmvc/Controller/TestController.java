package com.atyyx.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController
{
    @GetMapping("/test/hello")
    public String testHello()
    {
        System.out.println(1/0);
        return "success";
    }
}
