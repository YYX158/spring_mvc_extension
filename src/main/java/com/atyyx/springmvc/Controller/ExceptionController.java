package com.atyyx.springmvc.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice  // 将当前类标识为异常处理的组件
public class ExceptionController
{
    // 设置要处理的异常信息
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView hanleException(Throwable ex)
    {
        ModelAndView modelAndView = new ModelAndView();
        // 设置视图的名称
        modelAndView.setViewName("error");
        // 添加共享域中的数据信息
        modelAndView.addObject("ex",ex);
        return modelAndView;
    }
}
