/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
//import Scanner class
import java.util.Scanner;

public class Program52 {

	/**
	 * a program that prompts the user for a binary number (8 bits or less) 
	 * as a String and converts it to base-10 decimal. Assume the user 
	 * complies and does enter a valid binary number and proceed by using
	 *  a for loop to perform the conversion.
	 */
	public static void main(String[] args) {
		// Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt the user for a binary number (8 bits or less) 
		// as a String
		System.out.println("Enter a binary # 8 bits or less: ");
		String binum = input.nextLine();
		
		// establish variables for loop
		// bit is going to keep track of which power 2 should be multiplied
		// by if a 1 is picked out of the loop sequence and we need its
		// value
		double sum = 0;
		int bit = binum.length()-1;
	
		
		// traverse through our string testing wether each 
		// char is 1 or 0
		for ( int i = 0; i < binum.length(); i++ ) {
			char single = binum.charAt(i);
			
			//action if char is a 1
			if ( single != 0 ) {
				
				// find its value 
				double xy = Math.pow(2, bit);
				
				// add it to the sum
				sum += xy;
				
			} else {
				
				continue;
			}
			
			// decrement bit so it'll be in the proper state for next 
			// calculation 
			bit--;
			
		}
		
		// Show the results of the calculation
		System.out.println( "Your # converted to base 10 decimal is: " + sum );
	}
	

}
