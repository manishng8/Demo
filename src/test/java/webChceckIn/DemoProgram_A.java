package webChceckIn;

public class DemoProgram_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		0#0#0#0#
//		#0#0#0#0
//		0#0#0#0#
//		#0#0#0#0
//		0#0#0#0#

		
		for(int i=0; i<=4; i++)
		{
//			if(i%2==0)
//			{
//				System.out.println("0#0#0#0#");
//				
//			}
//			else if(i%2!=0)
//			{
//				System.out.println("#0#0#0#0");
//				
//			}
			
			for(int j=0;j<=7;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("0");
					}
					else if(j%2!=0)
					{
						System.out.print("#");
					}
				}
				else if(i%2!=0)
				{
					if(j%2==0)
					{
						System.out.print("#");
					}
					else if(j%2!=0)
					{
						System.out.print("0");
					}					
					
				}
				
			}
			System.out.println();
			
			
		}
		
		
	}

}
