/**
 * 
 */

/**
 * @author hambricedwards
 *
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// generate random int
		int num1 = (int) (48 + ( Math.random() *  ( 123-48 )));
		
		// explicitly cast our int into a char data type
		char ch = (char) num1;
		
		System.out.println( "The interger is: " + (num1) );
		System.out.println("The ASCII character for that is: " + ch );
		
		// determine character type
		if ( !Character.isLetterOrDigit(ch) ) {
			System.out.println("That is punctuation or a special character.");
		} else if ( Character.isLetter(ch) && Character.isUpperCase(ch) ) {
			System.out.println( "thats an uppercase letter." );
		} else if ( Character.isDigit(ch) ) {
			System.out.println("thats a digit.");
		} else {
			System.out.println("Thats a lowercase letter.");
		}
	}

}
