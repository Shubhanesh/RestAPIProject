package org.example.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg001 {
    @Test
    public void test1(){
        Assert.assertEquals(true,true);

    }
    @Test
    public void test2(){
        Assert.assertEquals(true,false);

    }
}
