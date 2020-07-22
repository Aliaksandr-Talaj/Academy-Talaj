package by.academy.deal;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Deal {

	private User seller;
	private User buyer;
	private Product[] products;
	private Integer[] quantity;
	private Double[] stackPrice;
	private Date deadlineDate;
	private double totalPrice;

	public Deal() {
		super();
		init();
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		init();
	}

	public User getBuyer() {
		return buyer;
	}

	public Date getDeadlineDate() {
		return deadlineDate;
	}

	public Product[] getDealProduct() {
		return products;
	}

	public Integer[] getQuantity() {
		return quantity;
	}

	public User getSeller() {
		return seller;
	}

	public Double[] getStackPrice() {
		return stackPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	private void init() {
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, 10);
		this.deadlineDate = c.getTime();
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public void setDealProduct(Product[] products) {
		this.products = products;
	}

	public void setQuantity(Integer[] quantity) {
		this.quantity = quantity;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public void setStackPrice(Double[] stackPrice) {
		this.stackPrice = stackPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("");
		builder.append("\nПродавец: " + getSeller().getUserName());
		builder.append("\nПокупатель: " + getBuyer().getUserName());
		int counter = 0;
		for (Product p : getDealProduct()) {
			builder.append("\n");
			builder.append(p.getProductName());
			builder.append("\t\t");
			builder.append(getQuantity()[counter]);
			builder.append(" шт.\t\t");
			builder.append(getStackPrice()[counter]);
			builder.append(" руб.");
			counter++;
		}

		builder.append("\nСумма к оплате: ");
	//	builder.append(Main.totalPrice);
		builder.append(" руб.");
		builder.append("\n");
		builder.append("Срок оплаты - не позднее ");
		builder.append(getDeadlineDate());

		return builder.toString();
	}
}
