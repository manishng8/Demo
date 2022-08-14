package webChceckIn;

import java.util.ArrayList;

public class Demo_KK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		String s = "This is Fynd interview" ;
		String[] str = s.split(" ");
		
		ArrayList<Character> ch = new ArrayList<Character>();
		
		System.out.println(str[1]);

		
		for(int i=0;i<str.length;i++)
		{
			
			for(int j=str[i].length()-1;j>=0;j--)
			{
				
				ch.add(str[i].charAt(j));
				
			}

			ch.add(' ');
			
		}
		

		for(char ch2: ch)
		{
			System.out.print(ch2);
			
		}

	}

}
