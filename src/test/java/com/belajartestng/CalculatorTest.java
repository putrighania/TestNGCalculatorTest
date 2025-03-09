package com.belajartestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void addTest() {
        int actualResult = Calculator.add(10, 20);
        int expectedResult = 30;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtractTest() {
        int actualResult = Calculator.subtract(20, 10);
        int expectedResult = 10;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplyTest() {
        int actualResult = Calculator.multiply(20, 10);
        int expectedResult = 200;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divideTest() {
        double actualResult = Calculator.divide(20, 10);
        double expectedResult = 2.0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void modulusTest() {
        int actualResult = Calculator.modulus(20, 10);
        int expectedResult = 0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void bodyMassIndexTest() {
        double actualResult = Calculator.bodyMassIndex(66, 175);
        double expectedResult = 21.55;
        Assert.assertEquals(actualResult, expectedResult, 0.01);
    }

    @Test
    public void bodyMassIndexStatusTest() {
        String actualResult = Calculator.bodyMassIndexStatus(35);
        String expectedResult = "Overweight";
        Assert.assertEquals(actualResult, expectedResult);
    }
}