package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class MultiplCalTest extends BaseTest {

  @Test(dataProvider = "valuesForMultiplication")
  public void multiplicationTest(long a, long b, long expectedValue){
    long result = calculator.mult(a, b);
    Assert.assertEquals(result, expectedValue, "Multiplication result invalid!");
  }


  @DataProvider (name = "valuesForMultiplication")
  public Object [][] valuesForMultiplication(){
    return new Object[][] {
              {10, 1, 10},
              {10, -1, -10},
              {5, 0, 0},
              {2, 2, 4}
      };
  }


}
