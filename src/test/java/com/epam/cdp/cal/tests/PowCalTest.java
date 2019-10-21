package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest{

  @Test (dataProvider = "valuesForPow")
  public void testPow(double a, double b, double expectedValue){
    double result = calculator.pow(a, b);
    Assert.assertEquals(result, expectedValue, "Pow result invalid!");
    }

  @DataProvider (name = "valuesForPow")
  public  Object [][] valuesForPow(){
    return new Object[][]{
      {10, 1, 10},
      {10, 0, 1},
      {2, 3, 8},
      {10, -1, 0.1},
    };
  }
}
