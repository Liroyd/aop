package com.aop.example.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectA {

    public void logA() {
        System.out.println("Aspect After for method A");
    }

    @Before("execution(*  com.aop.example.ClassA.methodCTW())")
    public void logCTW() {
        System.out.println("Aspect Before for methodCTW");
    }
}
