package webChceckIn;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_JJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {8,5,2,3};
		
		Demo_JJ j = new Demo_JJ();
		
		j.missingNum(num);
		
	}

	
	public void missingNum(int[] missing)
	{
		// i/p: 8,5,2,3
		// o/p: 4,6,7

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		for(int l : missing)
		{
			ar.add(l);
		}
		Collections.sort(ar);
		
		for(int n=ar.get(0);n<ar.get(ar.size()-1);n++)
		{
			
			if(!(ar.contains(n)))
			{
				ar2.add(n);
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(ar2);
		
	}
}
