/**
 * 
 */

/**
 * @author hambricedwards
 * @#23180290000
 */
//import scanner
import java.util.Scanner;

public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter unit_price & qauntitiy
        System.out.print("Enter the items unit price and qauntity:");
        double unit_price = input.nextDouble();
        double qauntity = input.nextDouble();
        
        //compute the sub_total
        double sub_total = unit_price * qauntity;
        
        //display sub_total
        System.out.println("Your subtotal is: " + sub_total);
        
	}

}
