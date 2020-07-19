/**
 * 
 */

/**
 * @author hambricedwards
 *
 */
public class Program53 {

	/**
	 *  a Java program that generates a table of square roots and cube 
	 *  roots for numbers from 5 to 100 in steps of 5. See Sample output.
	 *  The table should show columns 10 characters wide with headings
	 *  and decimals as shown.
	 */
	public static void main(String[] args) {
		// generate table headers
		System.out.printf("NUMBER     SQ.ROOT     CB.ROOT");
		System.out.printf("\n-------------------------------\n");
		
		// variable to control our while loop 
		double num1 = 5;
		
		// while loop increments by 5 calculating the numbers 
		// sqaure and cube root each rep 
		while (num1 <= 100) {
			//calculate #'s
			double num2 = Math.sqrt(num1);
			double num3 = Math.cbrt(num1);
			
			// output the data
			System.out.printf("%5.1f%10.3f%10.3f\n", num1, num2 , num3);
			
			// increment our control variable by 5 
			num1 += 5;
		}

	}

}
