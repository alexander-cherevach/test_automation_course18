package alex;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class DivLongTest {
	Calculator testCalc = new Calculator();
	
    @Test (testName = "div long test")
    
    @Parameters({"x","y", "res"})
    public void divTest(long x, long y, long res) {
    	Assert.assertEquals(testCalc.div(x, y), res);
    }
    
  
}