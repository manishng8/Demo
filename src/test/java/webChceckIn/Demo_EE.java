package webChceckIn;

public class Demo_EE {

	    StringBuilder output = new StringBuilder();
	    String inputstring;
	    
	    Demo_EE(String str){
	    	
	    	inputstring = str;
	    	System.out.println("The input string is:" + inputstring);
	    }
	    
	    public static void main (String args[])
	    {
	    	Demo_EE combobj= new Demo_EE("wxyz");
	    	
	        System.out.println("");
	        System.out.println("");
	        System.out.println("All possible combinations are :  ");
	        System.out.println("");
	        System.out.println("");
	        
	        combobj.combine(0);

	    	
	    }
	    
	    public void combine(int start) 
	    {
	        for( int i = start; i < inputstring.length(); ++i ){		
	            output.append( inputstring.charAt(i) );					
	            System.out.println( output );							
	            if ( i < inputstring.length() )							
	            {
	            	combine( i + 1);											
	            }
	            
	            output.setLength( output.length() - 1 );	

	        }
	    }

	    
}
