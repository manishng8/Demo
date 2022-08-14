package webChceckIn;

import java.util.Scanner;

public class DemoCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide String:");
		
		String str = sc.nextLine();
		int x=0;
		int y=0;
		
		
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt((str.length()-1)-i)) 
 			{
				x=1;
			}
			else
			{
				y=1;
				
			}		
		}
		
		if(x==1 && y==0)
		{
			System.out.println("Pallindorme");
		}
		else if(x==0 || y==1)
		{
			
			System.out.println("Not a Pallindrome");			
		}
	}

}
