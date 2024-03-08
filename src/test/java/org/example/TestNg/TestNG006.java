package org.example.TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG006 {
    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("2");
    }
    @Test
    public void t3(){
        // token and BookingID
        System.out.println("3");
    }

}
