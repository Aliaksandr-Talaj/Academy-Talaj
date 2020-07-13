package by.academy.lesson5;

public class Deal {

	private User seller;
	private User buyer;
	private Product[] products;
	private Integer [] quantity;
	private Double [] stackPrice;
	public Deal(){
		super();
	}
	
	public Deal(User seller, User buyer, Product[] products){
		super();
		this.seller=seller;
		this.buyer=buyer;
		this.products=products;
	}
	
	public void setSeller(User seller) {
		this.seller=seller;
	}
	public User getSeller() {
		return seller;
	}
	public void setBuyer(User buyer) {
		this.buyer=buyer;
	}
	public User getBuyer() {
		return buyer;
	}
	public void setDealProduct(Product[] products) {
		this.products=products;
	}
	
	public Product[] getDealProduct() {
		return products;
	}
	public void setQuantity(Integer[] quantity) {
		this.quantity=quantity;
	}
	
	public Integer[] getQuantity() {
		return quantity;
	}

	public Double [] getStackPrice() {
		return stackPrice;
	}

	public void setStackPrice(Double [] stackPrice) {
		this.stackPrice = stackPrice;
	}


}
