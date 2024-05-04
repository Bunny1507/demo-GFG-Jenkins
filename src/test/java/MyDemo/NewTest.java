package MyDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import demo.MyCalculator;
public class NewTest {
  @Test
  public void test() {
	  
	  MyCalculator calc = new MyCalculator();
	  
	  	assertEquals(50,calc.mul(10,5));
  }
}
