import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318019
 */
public class Program12_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates a small (6-10) array of ints
		int[] list = {6,5,4,3,2,1};
		
		// Display your array elements, all on one line,
		// using a foreach loop
		for( double i: list) {
			System.out.print(i + " ");
		}
		System.out.printf("\n");
		
		// In a try block, prompt the user to enter an 
		// index for the array and attempt to print the 
		// element with that index
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter any index of your array: ");
			int nDex = input.nextInt();
			System.out.println(list[nDex]);
			
		}
		// one that detects an index out of bounds
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Error. Array index was out of bounds.");
		}
		// and another that catches other bad inputs
		catch (InputMismatchException ex) {
			System.out.println("Bad input. Try again");
		}
	}

}
