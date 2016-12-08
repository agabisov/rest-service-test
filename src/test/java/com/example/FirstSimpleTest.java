package com.example;

import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by agab on 12/7/2016.
 */
public class FirstSimpleTest {
    @Test
    public void simpleTest() {
        int res = 8;
        int sum = 3 + 5;
        Assert.assertEquals(sum, res);

        //       Assert.assertTrue();

        //       Assert.assertFalse();
    }
    @Test
    public void simpleFalseTest() {
        int res = 8;
        int sum = 1 + 5;
        Assert.assertEquals(sum, res, "Sum not equals");

        //       Assert.assertTrue();

        //       Assert.assertFalse();
    }
    @Test
    public void simpleAssertTrue()
    {
        Assert.assertTrue(5>2);
    }
    @Test
    public void simpleAssertNotTrue()
    {
        Assert.assertTrue(2>5,"5<2 not true");
    }
    @Test
    public void simpleAssertFalse()
    {
        Assert.assertFalse(2>5,"5<2 not true");
    }
}
