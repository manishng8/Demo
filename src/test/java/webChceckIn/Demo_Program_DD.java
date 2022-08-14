package webChceckIn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Program_DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//			A subarray is a continuous part of an array.
//			
//			Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//			Output: 6
//			Explanation: [4,-1,2,1] has the largest sum = 6.
//			
//			Input: nums = [1]
//			Output: 1
//			
//			
//			Input: nums = [5,4,-1,7,8]
//			Output: 23
//				*/
//			
//			int num[] = {-2,1,-3,4,-1,2,1,-5,4};
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Please provide start and end position of array");
//			int start = sc.nextInt();
//			int end = sc.nextInt();
//			
//			ArrayList<Integer> arr1 = new ArrayList<Integer>();
//			
//			for(int i=start;i<=end;i++)
//			{
//				arr1.add(num[i]);
//			}
//			
//			int count =0;
//			for(int j=0;j<arr1.size();j++)
//			{
//				count = count + arr1.get(j);	
//			}
//			
//			System.out.println(count);
		
		/*
					 * Input: strs = ["flower","flow","flight"]
			Output: "fl"
			
			
			Input: strs = ["dog","racecar","car"]
			Output: ""
		 */
		
		
//		String[] st = {"flower","flow","flight"};
//		ArrayList<Character> ch = new ArrayList<Character>();
//		
//		for(int i=0; i<st.length;i++)
//		{
//			if(st[i].length()<st[i+1].length())
//			{
//				continue;
//				
//			}
//			else
//			{
//				st[i
//			}
//			
//		}
//		
//		
//		System.out.println(ch);
//		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mnagle\\Documents\\manishng8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		driver.findElement(By.xpath("//button[text()=\"No thanks\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shirt");
		
		List<WebElement> ls = driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
		String st = "";
		int count =0;
		for(int i=0; i<ls.size()-1;i++)
		{
			st = ls.get(i).getText();
			if(st.contains("shirt"))
			{
				System.out.println(ls.get(i).getText());
				continue;
			}
			else
			{
				System.out.println(ls.get(i).getText());
				count = count+1;
				break;
			}	
		}
		
		
		if(count>0)
		{
			System.out.println("shirt keyword is not present in all the search results.");
			System.out.println(count);
		}
		else
		{
			System.out.println("Shirt keywortd is present in all the keywords.");
		}
		
	}

}
