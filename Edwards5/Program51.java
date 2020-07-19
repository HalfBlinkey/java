/**
 * 
 */

/**
 * @author hambricedwards
 * @0002318029
 */
public class Program51 {

	/**
	 *  a program that uses a while loop to detect and print multiples 
	 *  of 13 or 17, but not both. Use the exclusive or operator as on 
	 *  page 93. The program should start examining integers at 200, and 
	 *  examine successively larger integers until 16 multiples have been 
	 *  detected. Correct multiples should be printed right aligned in fields 
	 *  that are 9 characters wide, but with only four multiples per line. 
	 *  The total of all correct multiples should be reported after all 16 
	 *  multiples have been printed.
	 */
	public static void main(String[] args) {
		
		// assign values to variables a start value that will be incremented
		// and tested each repition multiple value to hold the amount of 
		// times we find a match and sum to add all the matches together
		int start = 200;
		int multiples = 0;
		int sum = 0;
		
		//create a while loop to test start until we find 16 values
		while ( multiples < 16 ) {
			
			// if a # is a multiple of 13 and not 17 
			if ( start % 13 == 0 ^ start % 17 == 0 ) {
				
				// if we've already printed 4 values start a new line
				if( multiples % 4 == 0 ) {
					System.out.printf("\n");
				}
			
				//increment our values 
				System.out.printf( "%9d", start );
				sum += start;
				multiples++;
				start++;
		
			} else {
				
				// if the # doesn't match either scenario only increment 
				// start 
				start++;
			}
		}
		
		// once the loop has finished it processing print out the sum
		// of the multiples
		System.out.printf("\n");
		System.out.println( "for a total of: " + sum );
	}

}
