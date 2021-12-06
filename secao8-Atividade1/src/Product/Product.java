package Product;

public class Product {
	public String name;
	public double price;
	public int quantily;
	
	public  double totalValueInStock() {
		
		return quantily * price;
	}
	
	public  void addProducts(int quantily) {
		this.quantily += quantily;
	}
	
	public  void removeProducts(int qt) {
		quantily -= qt;
	}
	
	public String toString() {
		return "Product data: "
			   + name 
			   + ", $ "
			   + String.format("%.2f", price)
			   + ", "
			   + quantily
			   + " units, Total: $"
			   + String.format("%.2f", totalValueInStock());
				
				
	}
	
}
