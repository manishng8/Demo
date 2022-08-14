package webChceckIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_FF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Find the number of times 1234 comes in abcd123467122341234556
		 * 
		 */
		
		String str = "abcd123467122341234556";
		String strcheck= "1234";
		
		String temp ="";
		int count = 0;
		for(int i=0; i<str.length();i++)
		{
				
				temp = temp+ str.charAt(i);

				if(temp.contains(strcheck))
				{
					count = count +1;
					temp="";
				}
	
		}
		
		System.out.println(count);
		
	}

}
