package webChceckIn;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DemoProgram_2 {

	public static void main(String[] args) {
		// i/p : Naman
		// o/p: {N: "2", a: "2", m: "1"} 
		
		String str = "BACXKAFXJDD";
		HashMap<Integer,Character> hs = new HashMap<Integer,Character>();
		HashMap<Character,Integer> sorted = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			hs.put(i, str.charAt(i));
			
		}
		 System.out.println(hs);
		
		int counter =0; 
		for(int m=0;m<str.length();m++)
		{
		
			for(int j=0;j<hs.size();j++)
			{
				if(hs.get(j).equals(str.charAt(m))) 
				{
					counter++;
					
				}
				else {
					continue;
				}
			}
			sorted.put(hs.get(m), counter);
			counter =0;
		}	

		System.out.println(sorted);
	}

}
