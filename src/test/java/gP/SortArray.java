package gP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class SortArray {

		public static void main(String[] args) {
			int[] num = {27,12,4,-7,-13};
			//			int[] num = {27,-7,12 ,4,-13};
/*
 * 
 * 27 -7 4 12 -13
 */
			LinkedList<Integer> sortedArray = new LinkedList<Integer>();

				for(int j=0; j<num.length;j++)
				{
					sortedArray.add(num[j]);
					
				}
				
				Collections.swap(sortedArray, 1, 3);
				Collections.swap(sortedArray, 2, 3);				

				System.out.println(sortedArray);

			

		}	
}
