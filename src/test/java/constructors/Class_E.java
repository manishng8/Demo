package constructors;

import java.io.IOException;

public class Class_E extends Class_D{

	Class_E() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

}


/* If parent class ( E ) constructor contains line throws
 * then we have to explicitly define child class constructor with throws exception on throws IOException
 * 
 * We can not use try catch block since first line of the child constructor or any constructor should be super(); not try
 */

