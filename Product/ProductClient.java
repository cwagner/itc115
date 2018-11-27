//Client class to test the Product class
public class ProductClient {

	public static void main(String[] args) {
		Product a = new Product("A1465", "MacBook Air (11-inch, Early 2015)", 600.00);
		Product b = new Product("A1370", "MacBook Air (11-inch, Mid 2011)", 500.00);
		
		System.out.println(a.toString());
		System.out.println();
		System.out.println(b.toString());
		System.out.println();
		
		int count = Product.getProductCount();
		
		System.out.println("Product count: " + count);

	}

}
