/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
public class Program71 {

	/**
	 * a program with a custom method that takes an array of 24 random 
	 * integers as its only argument. The method should print the array 
	 * elements in six columns, each six characters wide and return the 
	 * mean (average) of the array. The main method should create the array, 
	 * pass it to the method, and display the mean accurate to one decimal place. 
	 * The random integers must be between 40 and 60, inclusive
	 */
	public static void main(String[] args) {
		// The main method should create the array, pass it to the 
		// method, and display the mean accurate to one decimal place
		
		// create array
		// ** made array length 29 to get 24 element output **
		int[] mList = new int [24];
		
		// print out table header
		System.out.printf("Here's your random array ....");
		
		// populate array
		for (int i = 0; i < mList.length; i++) {
			mList[i] = (int) (40 + ( Math.random() *  ( 60-40 )));
		}
		// call custom method 
		int mean = custo(mList);
		
		// display average 
		System.out.printf("\nAverage: %5.1f", mean);

	}
	
	public static int custo(int[] array) {
		// method that takes an array of 24 random integers as its 
		// only argument. The method should print the array elements 
		// in six columns, each six characters wide
		int mean = 0;
		
		// create a for loop to process the array
		for (int i = 0; i < array.length; i++) {
			
			
			// use an if construct to structure table printing 6 lines 
			// and then a new line feed
			if ( i % 7 == 0 ) {
				
				// if we've already printed six #'s print a new line
				// character
				System.out.printf("\n");
				
				//increment mean by value of arrays current repetition
				mean += array[i];
				
			} else {
				
				System.out.printf("%5.0d", array[i]);
				
				//increment mean by value of arrays current repetition
				mean += array[i];
			}
		}
		
		// divide by array.length to get our average/ mean
		mean /= array.length;
		
		// return the average to the functions caller
		return mean;
	}
	// ** I don't know why it's only printing out 20 #'s **

}
