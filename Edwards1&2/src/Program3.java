/**
 * 
 */

/**
 * @author hambricedwards
 * 
 */

//impot scanner
import java.util.Scanner;


public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create scanner object
	     Scanner input = new Scanner(System.in);
	     
	     //prompt the user for the degrees in fahrenheit 
	     System.out.print("Enter the degrees in fahrenheit: ");
	     double fahr = input.nextDouble();
	     
	     //compute celcius
	     double celcius = (fahr-32) * 5 / 9;
	     
	     //display results
	     System.out.print("That temperature in degress Celcius is: " + celcius);
	}

}
