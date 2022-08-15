package com.atyyx.springmvc.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecondInterceptor implements HandlerInterceptor {
    /**
     * 在控制器执行之前执行的拦截器
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        //1061行，用来执行preHanle
//        if (!mappedHandler.applyPreHandle(processedRequest, response)) {
//            return;
//        }

        System.out.println("SecondInterceptor----->preHandle");
        // 返回true就是放行
        return true;
    }

    /**
     * 在控制器方法执行之后执行的
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {

        System.out.println("SecondInterceptor----->postHandle");
    }

    /**
     * 在我们渲染完视图之后才执行的   //在render之后执行的
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("SecondInterceptor----->afterCompletion");
    }
}
