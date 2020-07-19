/**
 * 
 */

/**
 * @author hambricedwards
 * @00002318029
 */
public class CartItem {
	private String item;
	private double price;
	private int qty;
	
	CartItem(String item, double price, int qty) {
		this.item = item;
		this.price = price;
		this.qty = qty;
	}
	
	public String getItem() {
		return item;
	}
	
	public void setItem( String item ) {
		this.item = item;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice( double price ) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	// defines a subtotal method that returns the item price * 
	// quantity.
	public double subtotal() {
		double subtotal = (double) price * qty;
		return subtotal;
	}
	
	public String tooString() {
		return;
	}
}
