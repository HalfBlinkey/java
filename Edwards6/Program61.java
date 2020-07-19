/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
// import Scanner class
import java.util.Scanner;

public class Program61 {

	/**
	 * a program that contains a main method and another void method that 
	 * takes two integer arguments representing the numerator and 
	 * denominator of an improper fraction. The method should determine and 
	 * print the equivalent value as a mixed number. Prompt the user to enter 
	 * the integers from the keyboard and then call the method.NOTE: improper 
	 * fraction 12 / 7 = 1 and 5/7 as a mixed number.
	 */
	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Enter an improper fraction like so 6 / 5: ");
		
		int num1 = input.nextInt();
		String tr = input.next();
		int num2 = input.nextInt();
		
		//call mix to do calculations and print result
		int num3 = num1 / num2;
		int num4 = mix(num1, num2);
		
		//display the results of the calculation
		System.out.println( "Your new mixed # is: " + num3 + " " + num4 + "/" + num2);
	}
	
	public static int mix(int num1, int num2) {
		int num3;
		
		// calculate the part of the number that remain a fraction 
		num3 = num1 % num2;
		
		//return that number
		return num3;
	}

}
