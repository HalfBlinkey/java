/**
 * @author hambricedwards
 * @23180290000
 */
//import scanner
import java.util.Scanner;

public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for info
		System.out.println("Enter a # for the day of the week 0 being Sunday: ");
		int day = input.nextInt();
		
		//create a switch statement to work w/ user input
		switch (day) {
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		default: System.out.println("Error: Invalid #");
				 System.exit(1);
		}
	}

}
