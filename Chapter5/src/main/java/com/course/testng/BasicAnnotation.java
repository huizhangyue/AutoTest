package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void  testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println(("beforeMethod这是在测试方法之前运行的"));
    }
    @AfterMethod
    public  void afterMethod() {
        System.out.println("afterMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass这是在测试方法之前执行的");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在测试方法后执行的");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite这是在测试方法之前执行的");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite这是在测试方法之后执行");
    }
}