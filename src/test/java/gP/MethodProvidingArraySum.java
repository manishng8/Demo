package gP;

public class MethodProvidingArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5}; 


		int sum = sumArray(a);
		
		System.out.println(sum);
	}

	private static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			
			s= s + a[i];  
		}
		return s;
	}

}
