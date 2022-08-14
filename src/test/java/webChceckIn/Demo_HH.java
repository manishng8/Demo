package webChceckIn;

import java.util.HashMap;

public class Demo_HH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hi, How are you";
		char[] chstr = str.toCharArray();
		
		HashMap<Character,Integer> charmap = new HashMap<Character,Integer>();
		
		for(char c: chstr)
		{
			if(!String.valueOf(c).isBlank()) {
					if(charmap.containsKey(c))
					{
						charmap.put(c, charmap.get(c)+1);
					}
					else
					{
						charmap.put(c, 1);
					}
			}
			
		}
		
		System.out.println(str+":"+charmap);
			
		}
	}

