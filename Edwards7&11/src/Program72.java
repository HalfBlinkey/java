/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */

public class Program72 {

	/**
	 * a program that takes three integer command line arguments that 
	 * represent the dimensions of a crate. The program should then 
	 * report the volume and surface area of the crate as integers.
	 */
	public static void main(String[] args) {
		// check the # of strings passed
		if (args.length != 3) {
			System.out.println("Usage of the class requires 3 arguemnts");
			System.exit(1);
		}
		
		// if 3 string arguments were entered parse them 
		// into integers for calculations 
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		// calculate the surface area
		int surfArea = ((num1 * num2) * 2) + ((num1 * num3) * 2) + ((num2 * num3) * 2);
		
		// calculate area
		int area = num1 * num2 * num3;
		
		// display data 
		System.out.println("Surface Area: " + surfArea);
		System.out.println("Area: " + area);
	}

}
