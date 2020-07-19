/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
// import scanner class
import java.util.Scanner;

public class Program63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate scanner class
		Scanner input = new Scanner(System.in);
		double grandTotal = 0;

		
		// prompt for the number of different items being purchased.
		System.out.println("How many different items are you purchasing?: ");
		int items = input.nextInt();
		
		for ( int i = 0; i < items; i++ ) {
			System.out.printf("\n");
			double total = 0;
			// use a loop to process each item by prompting for the unit price, 
			// quantity and taxable status
			System.out.printf("\n enter items unit price: " );
			double price = input.nextDouble();
			
			// retrieve qauntity
			System.out.printf("\n enter item qauntity: " );
			double qaunt = input.nextDouble(); 
			
			// retrieve taxable status
			System.out.printf("\n enter item taxable status a y/n: ");
			String sTax = input.next();
			Boolean tax = true;
			if (sTax.charAt(0) != 'y') {
				tax = false;
			}
			
			// call item to process the data we've retrieved
			// keep track of total w/ variable total
			total += item(price, qaunt, tax);
			
			grandTotal += total;
			//  if we're processing last item print out total
			if (i == items - 1 ) {
				System.out.printf("\n Pay: $%,5.2f", total);
				System.out.printf("\n");
			}
		}
		
		//print grand total
		System.out.printf("\n Your Grand Total is: $%,5.2f", grandTotal);
		
	}
	
	public static double item (double price, double qaunt, Boolean tax) {
		//compute pretax total
		double pretax = price * qaunt;
		System.out.printf("\n Subtotal: $%,5.2f", pretax);
		
		// 2 processing routes for wether or not taxable status was
		// selected
		if (!tax) {
			
			// if no taxes 
			double total = pretax;
			System.out.printf("\n Total: $%,5.2f", total);
			
			return total;
			
		} else {
			
			//if the item is taxable calculate sales tax and add it
			// to the total 
			double num1 = pretax * .07;
			System.out.printf("\n Sales tax: $%,5.2f", num1);
			
			double total = pretax + num1;
			System.out.printf("\n Total: $%,5.2f", total);
			
			return total;
	
		}
		
	}
	
}
