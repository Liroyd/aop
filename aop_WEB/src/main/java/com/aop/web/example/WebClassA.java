package com.aop.web.example;

public class WebClassA {

    public void webMethodA() {
        System.out.println("--webMethodA-- method");

        webMethodForCTW();
    }

    public void webMethodForCTW() {
        System.out.println("--webMethodForCTW-- method");
    }
}
