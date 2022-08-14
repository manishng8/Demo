package constructors;

public class C_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B_Class b = new B_Class(40);

	}
/* 
 * Constructors are not allowed in interfaces
 * Abstract class also have compulsory constructors
 * Overloading is allowed in constructors
 * Inheritance Overriding are not allowed in constructors
 * A class can contain multiple constructors
 * you can not define return type void, int, string etc for a constructor
 * If no constructor is defined JVM automatically define default constructor
 * Default constructor will be public if class is public, it's private if class is private
 * First line of code inside constructor should be either super(); or this();
 * If you define constructor empty or not defined first line super(); or this();, JVM provide first line of code as super();
 * You can have constructor and methods with same name but it is not recommended.
 * Recursive method call is run time exception StackOver flow , but recursive constructor is compile time error.
 */	
}
