package entities;

public class Orderitem {
	
	private Integer quantity;
	private double price;
	
	private Product product;
	
	public Orderitem() {
		
	}
	
	public Orderitem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		return product.getName()+ ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", SubTotal: $" + String.format("%.2f", subTotal());
	}
}
