import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void firstMethod() {
		
		System.out.println(" first method ");
		
		
	}
	
	@Test
	public void secondMethod()
	{
		
		System.out.println("second method");
	}
	
	@BeforeMethod
	public void thirdMethod()
	{
		
		
		System.out.println(" third method");
	}
	
	@AfterMethod
	public void fourthMethod()
	{
		
		System.out.println("fourth method");
		
	}
	
	@BeforeClass
	public void fithMethod()
	{
		
		System.out.println(" fith method");
		
	}
	
	@AfterClass
	public void sixthMethod()
	{
		
		
		System.out.println(" sixth Method");
	}
	
}
