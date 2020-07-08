package by.academy.lesson4;

public class Product {

	double price;
	private double discount;
	String name;
	int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public double getPrice() {
		return price/100*(100-getDiscount());
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	public double getDiscount() {
		return discount;
	}
	
	protected void setDiscount(double discount){
		this.discount=discount;
	}	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
}
