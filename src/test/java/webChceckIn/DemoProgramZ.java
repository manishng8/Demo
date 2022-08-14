package webChceckIn;

import java.util.HashMap;

public class DemoProgramZ {

	public static void main(String[] args) {
		
		
		String str ="NAMAN";
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
