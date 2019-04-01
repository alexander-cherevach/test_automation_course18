package alex;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class divTest {
	Calculator testCalc = new Calculator();
	
    @Test (testName = "div test")
    
    @Parameters({"x","y", "res"})
    public void divTest(double x, double y, double res) {
    	Assert.assertEquals(testCalc.div(x, y), res);
    }
    
  
}