package alex;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class MyFirstTest {
	Calculator testCalc = new Calculator();
	
    @Test (testName = "cos test")
    
    @Parameters({"x", "res"})
    public void cosTest(double x, double res) {
    	Assert.assertEquals(testCalc.cos(x), res);
    }
    
  
}