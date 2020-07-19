/**
 * 
 */

/**
 * @author hambricedwards
 *
 */
// import Scanner class
import java.util.Scanner;

public class Program54 {

	/**
	 * a program that simulates a cashier terminal. Assume that a customer
	 *  is purchasing an unknown number of different merchandise items, 
	 *  possibly with multiple quantities of each item. Use a while loop 
	 *  to prompt for the unit price and quantity. The loop should continue 
	 *  until the unit price is zero. Display a subtotal for each item. After 
	 *  the loop display the total amount due. Use currency format where 
	 *  appropriate
	 */
	public static void main(String[] args) {
		// instantiate scanner class object
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		//prompt user for input
		System.out.println("\n Enter the items price or enter 0 to quit: ");
		double price = input.nextDouble();
		
		while ( price != 0 ) {
			System.out.printf("\n Enter the items quantity: ");
			double qaunt = input.nextDouble();
			double ip = qaunt * price;
			System.out.printf("\n Item price is $%3.2f", ip);
			total += ip;
			System.out.printf("\n Enter the items price: ");
			price = input.nextDouble();
		}
		
		//** why wont this print if while loop is used**
		System.out.printf("\n Your Total comes to $%3.2f", total);
	}

}
