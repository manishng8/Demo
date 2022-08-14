package webChceckIn;

import java.util.Scanner;

public class DemoProgram_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I/P: NAMAN , O/p: Yes Pallindrome
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide String:");
		
		String str = sc.nextLine();
		
		
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(str.length()-i))
			{
				System.out.println("Pallindorme");
				
			}
			else
			{
				System.out.println("Not a Pallindrome");
			}
			
		}
		
	}

}
