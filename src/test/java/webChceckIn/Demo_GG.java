package webChceckIn;

import java.util.HashMap;

public class Demo_GG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// abcdba 
		
		
		String str ="abcdba";
		String str2 = "";
		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<str.length();i++)
		{
			str2 = str2 + str.charAt(i);
			str = str.substring(i+1, str.length());
			if(str.contains(str2))
			{
				str.indexOf(str2.charAt(i));
				hash.put(str2.charAt(i),str.indexOf(str2.charAt(i)) );
			}
	
		}
		
		System.out.println(hash);
		
		
	}

}
