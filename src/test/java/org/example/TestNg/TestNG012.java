package org.example.TestNg;

import org.testng.annotations.Test;

public class TestNG012 {
    @Test(priority=1)
    void demo1(){
        System.out.println("a");

    }
    @Test(priority=2)
    void demo2(){
        System.out.println("b");

    }
    @Test
   void demo3(){
       System.out.println("c");
   }
}
