package bookFlight;

import java.util.Collections;
import java.util.LinkedList;

public class demoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted = {1,23,33,0,22,0,34,0,55};
		
		LinkedList<Integer> sortList = new LinkedList<Integer>();
		LinkedList<Integer> zeroList = new LinkedList<Integer>();
		for(int i=0; i<unsorted.length-1; i++)
		{
			sortList.add(unsorted[i]);
		}		
		
		for(int j=0;j<sortList.size();j++)
		{
			if(sortList.get(j)==0)
			{
				zeroList.add(sortList.get(j));
				sortList.remove(sortList.get(j));
			
			}
		}
//		
////		for(int k: sortList)
////		{
////			
////			System.out.println(k);
////		}
////		for(int l: zeroList)
////		{
////			
////			System.out.println(l);
////		}		
//		
//		for(int m=0; m<zeroList.size();m++)
//		{
//			sortList.addLast(zeroList.get(m));
//			
//		}
//		
//		for(int k: sortList)
//		{
//			
//			System.out.print(k+",");
//		}
//		

		
	}

}
