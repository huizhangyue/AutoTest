package com.course.testng;

import org.testng.annotations.Test;
//如果test1执行失败，test2就会被忽略，不会执行test2
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
