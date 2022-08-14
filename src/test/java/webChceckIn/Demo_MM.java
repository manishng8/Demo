package webChceckIn;

public class Demo_MM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {2,4,1,6};

		int[] y = {2,9,5,1};


		for(int i=0; i<=x.length-1;i++)
		{
			
			y[i] = y[i] + x[i];
			System.out.println(y[i]);
		}
	}

}
