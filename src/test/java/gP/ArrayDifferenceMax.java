package gP;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDifferenceMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,7,9,16}; //Diff 5,3 
		
		int maxDiff = arrayDifference(a);  //arrayDifference2
		
		System.out.println(maxDiff);
		
	}

	private static int arrayDifference(int[] a) {
		// TODO Auto-generated method stub
		int diff=0;
		ArrayList<Integer> difflist = new ArrayList<Integer>();
		for(int i=1;i<a.length;i++)
		{
			
			diff = a[i]-a[i-1];
			difflist.add(diff);
		}
		
		int k = Collections.max(difflist);

		return k;
	}
	
	private static int arrayDifference2(int[] a) {
	
		int diff = 0;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]-a[i-1]>diff)
			{
				diff = a[i]-a[i-1];
			}
			
		}
		return diff;
	}
	
}
