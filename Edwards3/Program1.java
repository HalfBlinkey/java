/**
 * 
 */

/**
 * @author hambricedwards
 * @23810290000
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// generate 2 random #'s
		int num3;
		int num1 = (int) ((int)20 + (Math.random() *  ( 50-20 )));
		int num2 = (int) ((int)20 + (Math.random() *  ( 50-20 )));
		//print out the numbers
		System.out.println( "Your #'s are: " + num1 + " " + num2);
		
		//find the positive difference of the 2 numbers
		if( num1 > num2 ) {
			 num3 = num1 - num2;
		} else {
			num3 = num2 - num1;
		}
		System.out.println("the positive differenece of these #'s is: " + num3);
	}

}
