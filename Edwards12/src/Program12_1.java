/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program12_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// prompt the user to enter a positive value of type byte.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive byte value: ");
		
		try {
			byte num1 = input.nextByte();
			
			// cast this input first to type int and then to type char.
			int num2 = (int) num1;
			
			if(num2 > 32 && num2 < 123) {
			
				char ch = (char) num2;
			
				System.out.println("Your number is ASCII is: " + ch);
			}else {
				System.out.println("Bad input run the program again");
			}
		}
		catch (InputMismatchException ex){
			System.out.println("Bad input run the program again");
		}
	}

}
