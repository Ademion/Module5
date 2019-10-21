package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalTest extends BaseTest{

  @Test (dataProvider = "valuesForDiv")
  public void divTest (long a, long b, long expectedValue) {
    long result = calculator.div(a, b);
    Assert.assertEquals(result, expectedValue, "Div result invalid ");
  }

  @DataProvider (name = "valuesForDiv")
  public Object [][] valuesForDiv(){
    return new Object[][] {
            {10, 1, 10},
            {10, -1, -10},
            {8, 2, 4},
            {2, 2, 1}
    };
  }

}
