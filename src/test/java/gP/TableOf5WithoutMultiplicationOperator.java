package gP;

public class TableOf5WithoutMultiplicationOperator {

	
	public static void main(String[] args) {
	
		int result = multiply(4,8);
		System.out.println(result);

	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		
		int k=1;
		int sum = 0;
		while(k<=j)
		{
			
			sum = sum + i;
			k++;
		}
		
		return sum;
				
	}
	
	
	
}
