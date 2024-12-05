package org.qafellas.tests;

import org.testng.annotations.Test;

public class ExampleTests {

    @Test(description = "set up step",priority = 1)
    public void setUp(){
        System.out.println("This is a set up step");
    }

    @Test
    public void test1(){
        System.out.println("This is a test 1");
    }

    @Test
    public void test2(){
        System.out.println("This is a test 2");
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("This is a test 3");
    }

    @Test(priority = 2)
    public void tearDown(){
        System.out.println("This is tear down step");
    }

}
