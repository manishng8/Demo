package webChceckIn;

public class Demo_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = “test[80]"
//				test[]
		
		
		String str = "test[1000]";
		
		int x =  str.indexOf(']');

		str = str.substring(5,x);
		
		System.out.println(str);
		
	}

}
