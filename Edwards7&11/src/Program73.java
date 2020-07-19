import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author hambricedwards
 *
 */
import java.util.ArrayList;
public class Program73 {

	/**
	 * Write a program with a main method that generates an array of fourteen 
	 * random "temperatures", all between 10F and 50F, inclusive. 
	 * Pass the array to a second method that displays the temperatures all 
	 * on one line and returns an ArrayList of all temperatures that are below 
	 * freezing. The main method should use a loop to display these cold 
	 * temperatures.
	 */
	public static void main(String[] args) {
		// print header
		System.out.printf("Temperatures in the last 2 weeks...");
		
		// main method that generates an array of fourteen 
		// random "temperatures", all between 10F and 50F, inclusive.
		int [] temps = new int [14];
		
		// populate temps array with randoms from 10-50
		for (int i = 0; i < temps.length; i++) {
			temps[i] = (int) (10 + ( Math.random() *  ( 50-10 )));
		}
		
		// Pass the array to a second method that displays the temperatures all 
		// on one line and returns an ArrayList of all temperatures that are below 
		// freezing.
		ArrayList<Integer> freezing = new ArrayList<>(meth(temps));
		
		System.out.println("Your freezing temperatures where.....");
		System.out.println(freezing);

	}
	//second method that displays the temperatures all 
	// on one line and returns an ArrayList of all temperatures that are below 
	// freezing.
	public static ArrayList<Integer> meth(int [] array) {
		
		//create empty array list to return 
		ArrayList<Integer> freeze = new ArrayList<>();
		
		// use a for loop to process temp array printing the values and
		// apending them to ArrayList
		for(int i = 0; i < array.length; i++) {
			// print the value
			System.out.print(array[i]);
			
			//cast value into Interger
			Integer num1 = array[i];
			
			// set new value in ArrayList if the temp 
			//is below freezing
			if (num1 < 32) {
				freeze.set(array[i], num1);
			}
			
		}
		
		// return arrayList
		return freeze;
	}

}
