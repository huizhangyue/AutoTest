package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4444");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("在服务端组之前运行");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("在服务端组之后运行");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("在服务端组之前运行");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("在服务端组之后运行");
    }
}
