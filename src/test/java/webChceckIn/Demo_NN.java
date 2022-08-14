package webChceckIn;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_NN {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		
		Scanner sc = new Scanner(System.in);
				
		String str = sc.nextLine();
		
		genericClick(str);
	}

	public static void genericClick(String str)
	{
		
			List<WebElement> el = driver.findElements(By.xpath("//tr[@class='odd' or @class='even']/td"));
			for(int i=0;i<el.size();i++)
			{
				String s = el.get(i).getText();
				if(s.equals(str))
				{
					System.out.println(el.get(i).getText());
					
				}
				else
				{
					continue;
				}
				
			}
			

		
	}
}
