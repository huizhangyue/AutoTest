package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforsuite(){
        System.out.println("beforesuite 运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite 运行啦！");
    }
}
