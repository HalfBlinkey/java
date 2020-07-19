/**
 * 
 */

/**
 * @author hambricedwards
 * @23810290000
 */
//import Scanner class
import java.util.Scanner;

public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user for number 
		System.out.println("Enter an an even multiple of 23 that is under 500: ");
		int num = input.nextInt();
		
		//check the users input for accuracy
		if ( num < 500 && num % 23 == 0 && num % 2 == 0) {
			System.out.println("You've really made the grade.");
		} else {
			System.out.println("Thats not it.");
		}

	}

}
