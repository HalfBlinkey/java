/**
 * 
 */

/**
 * @author hambricedwards
 * @0002318029
 */
//import scanner
import java.util.Scanner;
public class program64 {

	/**
	 * an original class with at least two methods that demonstrate 
	 * method overloading. Full points will not be awarded for examples 
	 * cloned from the textbook or other sources. Execute all of the 
	 * overloaded methods in the main method. In comments clearly show 
	 * that you understand overloading and how your methods illustrate 
	 * overloading
	 */
	public static void main(String[] args) {
		
		// use 1st form of our method 
		System.out.println(add(1,2,3));
		
		//use 2nd form
		System.out.println(add(1.09,2.98,3.87));
		
		// use 3rd form of our method 
		System.out.println(add(1,2));
		
		//use 4th form
		System.out.println(add(1.09,2.98));
		
		// below are 4 different forms of the method add accepting
		// different data types as arguements
		
	}
	public static int add(int num1, int num2, int num3) {
		int dda = num1 + num2 + num3;
		return dda;
	}
	
	public static double add(double num1, double num2, double num3) {
		double dda = num1 + num2 + num3;
		return dda;
	}
	
	public static int add(int num1, int num2) {
		int dda = num1 + num2;
		return dda;
	}
	
	public static double add(double num1, double num2) {
		double dda = num1 + num2;
		return dda;
	}
}
