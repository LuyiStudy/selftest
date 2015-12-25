package luyi.selfTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	private App m;
   @BeforeMethod
   public void init(){
	  m = new App();
   }
    
   @Test   
   public void testSayHello(){
	   Assert.assertEquals(m.sayHello(),"Hello World");
   }
    
}
