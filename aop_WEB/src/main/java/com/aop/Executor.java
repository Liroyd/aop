package com.aop;

import com.aop.example.ClassA;
import com.aop.web.example.WebClassA;

public class Executor {

    WebClassA webClassA;
    ClassA classA;

    public void execute() {
        classA.methodA();

        System.out.println("\n\n");

        webClassA.webMethodA();
    }

    public void setWebClassA(WebClassA webClassA) {
        this.webClassA = webClassA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
