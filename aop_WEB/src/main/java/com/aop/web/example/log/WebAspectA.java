package com.aop.web.example.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class WebAspectA {

    public void webLogAfterMethodA() {
        System.out.println("Web Aspect After web method A");
    }

    @Before("execution(*  com.aop.web.example.WebClassA.webMethodForCTW())")
    public void webLogBeforeCTWMethod() {
        System.out.println("Web Aspect Before for MethodCTW");
    }
}
