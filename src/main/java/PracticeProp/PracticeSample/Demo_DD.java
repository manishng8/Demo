package PracticeProp.PracticeSample;

import java.util.Scanner;

public class Demo_DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide String:");

		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		StringBuffer sb2 = sb.reverse();
		
		String st2 = new String(sb2);
		
		
		if(str.equalsIgnoreCase(st2))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}

	}

}
