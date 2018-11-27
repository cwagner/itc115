import java.text.NumberFormat;

//generic model of a product
public class Product {
	
	//fields
	private String productCode;
	private String description;
	private double price;
	private static int productCount;
	
	//constructor method
	public Product(String productCode, String description, double price) {
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		//increment the product count with each product created
		productCount++;
	}
	
	//getter and setter methods
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//static method, belongs to the class instead of a specific object
	public static int getProductCount() {
		return productCount;
	}
	
	//other methods
	public String toString() {
		return "Product code: " + productCode + "\nDescription: " + description + 
				"\nPrice: " + this.getPriceFormatted();
	}
	
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }

	
}
