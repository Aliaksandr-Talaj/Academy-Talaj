package by.academy.lesson5;

public class Product {

	public String productName;
	public double price;
	
	public Product() {
		super();
	}
	public Product(String productName, double price) {
		super();
		this.productName=productName;
		this.price=price;
	}
	
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public Sting getProductName() {
		return productName;
	}
	
	
}


