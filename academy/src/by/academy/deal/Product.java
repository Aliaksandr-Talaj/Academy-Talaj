package by.academy.deal;


public class Product {

	protected String productName;
	protected double price;
	protected String productDescription;
	protected int discountPercent;

	public Product() {
		super();
	}

	public Product(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public Product(String productName, double price, String productDescription) {
		super();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
	}

	public Product(String productName, double price, String productDescription, int discountPercent) {
		super();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.discountPercent = discountPercent;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public double getProductPrice() {
		return price;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public double getDiscountPrice() {
		return this.price * (100 - discountPercent) / 100;
	}

}

	

	
	
