package gP;

import java.io.InputStream;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter String");
		String s = sc.nextLine();
		
		int i;

		for(i=0;i<=(s.length()-1);i++)
		{
			for(int j=((s.length()-1)-i);j>=0;j--)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
					break;
				}
				else {
					
					System.out.println("String is not Pallindrome");
					System.out.println("i="+i+" j="+j);
				}
				
			}
			
		}
		System.out.println("You have entered a pallindrome string");
	}

}
