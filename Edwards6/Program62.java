/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
// import Scanner
import java.util.Scanner;

public class Program62 {

	/**
	 * Write a class that has a main method and two more methods for 
	 * performing calculations on a circle. One void method calculates 
	 * and prints the area of the circle and the other method returns the 
	 * circumference of the circle. The main method should prompt the user 
	 * to enter the radius of the circle (as  a  double) and call the other 
	 * methods with the radius as argument. Both the circumference  and area 
	 * should be displayed accurate to four decimal places.
	 */
	public static void main(String[] args) {
		// create scanner and 
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.printf("Enter the radius of a circle: ");
		double rad = input.nextDouble();
		
		// call area() it will do the calculations and print them out
		area(rad);
		
		// put circumference into a variable and print it out
		double circumference = circ(rad);
		System.out.printf("\n The circles circumference is: %,7.3f", circumference);
	}
	
	public static void area(double rad) {
		// One void method calculates and prints the area of the circle
		double area = Math.PI * Math.pow(rad, 2); 
		
		// print the results of the computation  
		System.out.printf("\n The area of the circle is: %,7.3f", area);
	}
	
	public static double circ(double rad) {
		// compute the cirlces circumference
		double cumf = 2 * Math.PI * rad;
		
		// return computation 
		return cumf;
	}
}
