import java.util.ArrayList;

/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
public class Program74 {

	/**
	 * Declare an array capable of holding six Strings.
	   Populate the array by entering six first names all on one one line 
	   separated by spaces (see sample output but use different names).
	   Use a foreach loop (see page 253) to process the array and display
	   the names on one line separated by spaces. Pass the array to a void method.
	 */
	public static void main(String[] args) {
		// Declare an array capable of holding six Strings.
		// Populate the array by entering six first names all on one one line
		String[] names = { "Steve", "Eve", "Jack", "Jill", "Joe", "Zep" };
		
		// Use a foreach loop (see page 253) to process the array and display
		// the names on one line separated by spaces
		for(int i = 0; i < names.length; i++) {
			System.out.printf(names[i]);
			System.out.printf(" ");
		}
		
		System.out.printf("\n");
		
		// Pass the array to a void method
		map(names);
		
		
		}
		
	 public static void map(String[] array) {
		// Create an arraylist of Strings
		ArrayList<String> nList = new ArrayList<>();
		 
		// Use a loop to populate the arraylist with the Strings in the array that 
		// was passed it
		for(int i = 0; i < array.length; i++) {
			nList.add(i, array[i]);
		}
		
		// Insert another name (you choose it) at the start of the 
		// arraylist.
		nList.add( 0, "The Dude Lebowski" );
		
		//Remove the name at the end of the arraylist.
		nList.remove(6);
		
		// Use a foreach loop to process the arraylist and display the names on 
		// one one line separated by spaces
		for(int i = 0; i < nList.size(); i++) {
			System.out.printf(nList.get(i));
			System.out.printf(" ");
		}
	}	
}