package com.company;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JUnitNewClass
{
    @Test
    public void Test1()
    {
        Assert.fail();
    }
    @Test
    public void Test2()
    {
        int a = 10;
        int b = 6;
        int expectedResult = 15;
        Assert.assertEquals("Expected Result Didn't match:", expectedResult, a + b);
  //      Assert.assertTrue(expectedResult = (a + b));
    }
}

