package webChceckIn;

public class Demo_OO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 432;
		String s = Integer.toString(x);
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.reverse();
		s = sb.toString();
		int y = Integer.parseInt(s);
		
		
		System.out.println(y);
		
		
	}

}
