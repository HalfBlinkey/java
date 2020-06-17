/**
 * 
 */

/**
 * @author hambricedwards
 * @#23180290000
 */

//import scanner object
import java.util.Scanner;

public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //create scanner object
        Scanner input = new Scanner(System.in);
        
        //promt the user for the 2 numbers will be using to make the calculation 
        System.out.println("Enter two numbers that contain decimals: ");
        
        //collect the user data
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        //perform calculations
        double num3 = num1 / num2;
        num3 -= 2.5; 
        
        //display the new number
        System.out.println("Your new number is: " + num3);

	}

}
