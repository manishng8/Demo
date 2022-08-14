package webChceckIn;

import java.util.HashMap;
import java.util.Scanner;

public class Demo_Programming {

	public static void main(String[] args) {
		// i/p : Naman
		// o/p: {N: "2", a: "2", m: "1"} --- conter , already key present over maps .contains

		
//		String str = "Naman";
//		HashMap<String, Integer> hs = new HashMap<String, Integer>();
//		
//		for(int i=0; i<str.length();i++)
//		{
//				hs.put(str, i);			
//		}
//		
//		System.out.println(hs);
		
		
		HashMap<Integer,String> hs = new HashMap<Integer, String>();
		
		
		String[] str = {"a", "b", "c"};
		
		for(int i=0;i<str.length;i++)
		{
			
			hs.put(i+1, str[i]);
		}
		
				
//		hs.put(1, "a");
//		hs.put(2, "b");
//		hs.put(3, "c");

		for(int i=1;i<=3;i++)
		{
			
			System.out.println(i+":"+hs.get(i));
			
		}
//		Scanner sc = new Scanner(System.in);
//		
//		String revString = sc.nextLine();
//		String revString2 = "";
//		for(int i=(revString.length()-1); i>=0;i--)
//		{
//			revString2 = revString2 + revString.charAt(i);
//		}
//		
//		System.out.println(revString2);
	}

}
