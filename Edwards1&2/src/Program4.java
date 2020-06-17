/**
 * 
 */

/**
 * @author hambricedwards
 * 
 */

//import Scanner
import java.util.Scanner;

public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create new scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user for the rectangles dimensions
        System.out.println("Enter the rectangles length and width in that order: ");
        double length = input.nextDouble();
        double width = input.nextDouble();
        
        //calculate area and perimeter
        double perimeter = (length * 2) + (width * 2);
        double area = length * width;
        
        //display results to user
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

	}

}
