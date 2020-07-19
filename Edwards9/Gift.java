/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
public class Gift {
	
	private String recipient;
	private String description;
	private double price;
	private int qty;
	public static int recipients = 0;
	
	Gift (String recipient, String description, double price, int qty) {
		this.recipient = recipient;
		this.description = description;
		this.price = price;
		recipients++;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setRecipient( String recipient) {
		this.recipient = recipient;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription( String description ) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice( double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty( int qty ) {
		this.qty = qty;
	}
	
	public void giftsVal() {
		double val = price * qty;
		System.out.printf("$%5.2f", val);
	}
	
	public String toString() {
		String sPrice = String.valueOf(price);
		String tstring =  recipient + " " + description + " " + sPrice;
		return tstring;
	}
}
