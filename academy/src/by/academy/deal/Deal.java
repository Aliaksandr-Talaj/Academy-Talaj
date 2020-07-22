package by.academy.deal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Deal {

	private User seller;
	private User buyer;
	private Product[] products;
	private Integer[] quantity;
	private Double[] stackPrice;
	private Date deadlineDate;
	private double totalPrice;
	private DealStatus status;

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
		this.status = DealStatus.NEW;
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

	@Override
	public String toString() {
		this.status = DealStatus.DONE;

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
		builder.append(totalPrice);
		builder.append(" руб.");
		builder.append("\n");
		builder.append("Срок оплаты - не позднее ");
		builder.append(getDeadlineDate());

		return builder.toString();
	}

	public void vending() {

		this.status = DealStatus.IN_PROGRESS;
		Scanner sc = new Scanner(System.in);
		String wannaBuy;
		ArrayList<Product> productsList = new ArrayList<Product>();
		ArrayList<Integer> quantitiesList = new ArrayList<Integer>();
		ArrayList<Double> stackPrices = new ArrayList<Double>();
		boolean buyMore = true;
		int counter = 0;
		while (buyMore) {
			System.out.println("Введите наименование необходимого товара");
			String good = sc.next();
			good = good.toLowerCase();
			for (Product p : Pricelist.getProduct()) {
				if (p.getProductName().toLowerCase().contentEquals(good)) {

					System.out.println("Введите необходимое количество данного товара");
					int q = sc.nextInt();
					productsList.add(counter, p);
					quantitiesList.add(counter, q);
					stackPrices.add(counter, q * p.getDiscountPrice());
					totalPrice += q * p.getDiscountPrice();
					counter++;
				}
			}
			System.out.println("Желаете совершить ещё покупку? (да/нет)");
			wannaBuy = sc.next();
			wannaBuy = wannaBuy.toLowerCase();
			buyMore = false;
			if (wannaBuy.contentEquals("да")) {
				buyMore = true;
			}
		}
		setDealProduct(productsList.toArray(new Product[productsList.size()]));
		setQuantity(quantitiesList.toArray(new Integer[productsList.size()]));
		setStackPrice(stackPrices.toArray(new Double[productsList.size()]));
		sc.close();
	}

	public DealStatus getStatus() {
		return status;
	}
}
