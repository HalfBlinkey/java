/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318019
 */
public class Program91 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create  Gift instances for at least six people, giving 
		// some people multiple gifts at the same price.
		// Use the "array initializer" syntax to make an array 
		// with these six Gifts.
		
		Gift[] gifts = new Gift[6];
		Gift gift1 = new Gift("John","Blowgun", 64.26, 2);
		gifts[0] = gift1;
		
		Gift gift2 = new Gift("Jax","Tatto", 35.93, 1);
		gifts[1] = gift2;
		
		Gift gift3 = new Gift("Penelope","Chocolates", 14.86, 4);
		gifts[2] = gift3;
		
		Gift gift4 = new Gift("Poe","Book", 34.47, 3);
		gifts[3] = gift4;
		
		Gift gift5 = new Gift("FatherTime","Chair", 24.98, 6);
		gifts[4] = gift5;
		
		Gift gift6 = new Gift("TigerKing","Tiger", 32.96, 5);
		gifts[5] = gift6;
		
		Gift highVal = null;
		
		for (int i = 0; i < gifts.length; i++) {
			
			// print the values of the attributes in each Gift element 
			// using the toString method.
			System.out.println(gifts[i].toString());
			
			// print how much was spent on each person.
		    gifts[i].giftsVal();
		    
		    // identify the recipient of the most expensive Gift and 
		    //the amount spent for same.
		    if ( gifts[i].getPrice() > highVal.getPrice()) {
		    	highVal = gifts[i];
		    }
			
		}
		
		System.out.println(highVal.getRecipient() + "Recieved my most expensive gift.");
		System.out.println("It cost$: ");
		highVal.giftsVal();
	
	}
	
}


