package webChceckIn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class commonString {

	   public static void main(String[] args) {
		   		String[] str = {"flower","fly","flow","float"};
		   		int len = str.length;
		   		String temp ="";
		   		for(int i=0;i< len;i++)
		   		{
		   			for(int j=i+1; j<len;j++)
		   			{
		   				if(str[j].length() < str[i].length())
		   				{
		   					temp = str[j];
		   					str[j] = str[i];
		   					str[i] = temp;
		   				}
		   				
		   			}
		   		}

			   	System.out.println(Arrays.toString(str));	
			   	int k=str[0].length();
				   		while(!str[1].contains(str[0]))
			  				{
				   				str[0] = str[0].substring(0, k);
				   				k--;
			  				}
					   	System.out.println(str[0]);		  				

		   }
	   

}
