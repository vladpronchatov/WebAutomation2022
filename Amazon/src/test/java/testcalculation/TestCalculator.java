package testcalculation;

import calculation.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testAddition(){
        Calculator cal = new Calculator();
        int expectedAdditionResult = cal.addition(100,50);
        Assert.assertEquals(expectedAdditionResult, 150);
    }

    @Test
    public void testSubtraction(){
        Calculator cal = new Calculator();
        int expectedSubtractionResult = cal.subtraction(100,50);
        Assert.assertEquals(expectedSubtractionResult, 50);
    }
}
