package by.academy.lesson5;

public class Product {

	public String productName;
	public double price;
	public String productDescription;
	
	public Product() {
		super();
	}
	public Product(String productName, double price) {
		super();
		this.productName=productName;
		this.price=price;
	}
	
	public Product(String productName, double price, String productDescription) {
		super();
		this.productName=productName;
		this.price=price;
		this.productDescription=productDescription;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public String getProductName() {
		return productName;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription=productDescription;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public double getProductPrice() {
		return price;
	}	
	
	
	
}
class Food extends Product{

	public Food(String productName, double price, String productDescription) {
		super();
		this.productName=productName;
		this.price=price;
		this.productDescription=productDescription;
	}};
class Medicine extends Product{};
class Weapon extends Product{};


