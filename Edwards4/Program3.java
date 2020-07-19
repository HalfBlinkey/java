/**
 * 
 */

/**
 * @author hambricedwards
 * @0002318029
 *
 */
public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instantiate variables
		String name = "Keisha";
		int age = 23;
		double pay = 32.50;
		char office = 'C';
		
		//Keisha is 23 years old
		System.out.print( name + " is " + age + " years old\n");
		
		//She is in office C
		System.out.print( "She is in Office " + office + "\n");
		
		//In a 40-hour week, her pay is $1,300.00
		System.out.printf( "In a 40 hour week, her pay is $%,5.2f", pay * 40);


	}

}
