/**
 * @author hambricedwards
 * @23180290000
 */
//

//import scanner object
import java.util.Scanner;

//
public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create scanner request users age
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		
		//create variables
		int age = input.nextInt();
		int price;
		
		//Create an else if statement to calculate price of admission 
		if ( age < 4 ) {
			price = 0;
		}else if ( age < 12 ) {
			price = 65;
		} else if ( age < 19 ){ 
			price = 100;
		} else {
			price = 125;
		}
		
		//if else statement to display price/ or message if to young
		if (price > 64) {
		System.out.println("Admission will be: $" + price);
		} else {
			System.out.println("try again next year");
		}
	}

}
