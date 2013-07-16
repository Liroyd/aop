package com.aop;

import com.aop.example.ClassA;

import com.aop.web.example.WebClassA;
import com.configurablefactory.ConfigurableFactory;

public class Executor {

    WebClassA webClassA;

    public void execute() {
        ClassA classA = ConfigurableFactory.getInstance().getBeanFactory().getBean("classA", ClassA.class);
        classA.methodA();

        System.out.println("\n\n");

        webClassA.webMethodA();
    }

    public void setWebClassA(WebClassA webClassA) {
        this.webClassA = webClassA;
    }
}
