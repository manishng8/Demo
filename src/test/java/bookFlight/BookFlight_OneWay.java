package bookFlight;

import org.testng.annotations.Test;

public class BookFlight_OneWay {

	
	@Test (groups = {"Regression","Smoke"})
	public void bookFlight_OneWay_TC01()
	{
		
		System.out.println("Book Flight One Way TC 1");
	}
	
	@Test
	public void bookFlight_OneWay_TC02()
	{
		
		System.out.println("Book Flight One Way TC 2");
	}
	
	@Test (groups = {"Smoke"})
	public void bookFlight_OneWay_TC03()
	{
		
		System.out.println("Book Flight One Way TC 23");
	}
}
