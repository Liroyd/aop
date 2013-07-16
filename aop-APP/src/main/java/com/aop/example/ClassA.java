package com.aop.example;

public class ClassA {

    public void methodA() {
        System.out.println("--methodA-- method");
        methodCTW();
    }

    public void methodCTW() {
        System.out.println("--methodCTW-- method");
    }
}
