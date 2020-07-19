/**
 * 
 */

/**
e * @author hambricedwards
 * @00002318029
 */

// import scanner object
import java.util.Scanner;

public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a new scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt the user for input
		System.out.println( "Enter a three word phrase: " );
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		
		//store quote in a single string 
		String s4 = s1 + " " + s2 + " " + s3;
		
		//Display the number of characters (including spaces) in the phrase
		int num1 = s4.length();
		System.out.println("# of characters in phrase: " + num1 );
		
		//Display the number of characters in the middle word
		int num2 = s2.length();
		System.out.println( "# of characters in middle word: " + num2 );
		
		//Display the final word in all upper case.
		String s5 = s3.toUpperCase();
		System.out.println( "Final word in all uppercase: " + s5);

	}

}
