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

	public void finishDeal() {
		this.status = DealStatus.DONE;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("СЧЕТ");
		builder.append("\nПродавец: " + getSeller().getUserName());
		builder.append("\nТелефон: " + getSeller().getTelNumber());
		builder.append("\nEmail: " + getSeller().getEmail() + "\n");
		builder.append("\nПокупатель: " + getBuyer().getUserName());
		builder.append("\nТелефон: " + getBuyer().getTelNumber());
		builder.append("\nEmail: " + getBuyer().getEmail() + "\n");
		int counter = 0;
		builder.append("_______________________________________________________");
		builder.append("\nНаименование\t|Количество\t|Сумма по данной позиции");
		builder.append("\n-------------------------------------------------------");
		for (Product p : getDealProduct()) {
			builder.append("\n");
			builder.append(p.getProductName());
			builder.append("\t");
			int i = p.getProductName().length();
			while (i < 8) {
				builder.append("\t");
				i += 4;
			}
			builder.append("|");
			builder.append(getQuantity()[counter]);
			builder.append(" шт.\t\t");
			builder.append("|");
			builder.append(getStackPrice()[counter]);
			builder.append(" руб.");
			counter++;
		}
		builder.append("\n-------------------------------------------------------");
		builder.append("\nИтого к оплате: \t\t|");
		builder.append(totalPrice);
		builder.append(" руб.");
		builder.append("\n_______________________________________________________");
		builder.append("\nСрок оплаты - не позднее ");
		builder.append(getDeadlineDate());

		return builder.toString();
	}

	@SuppressWarnings("resource")
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

			do {
				System.out.println("Желаете совершить ещё покупку? (да/нет)");
				wannaBuy = sc.next();
				wannaBuy = wannaBuy.toLowerCase();
				buyMore = false;
			} while (!((wannaBuy.contentEquals("да") || (wannaBuy.contentEquals("нет")))));
			if (wannaBuy.contentEquals("да")) {
				buyMore = true;
			}
		}
		setDealProduct(productsList.toArray(new Product[productsList.size()]));
		setQuantity(quantitiesList.toArray(new Integer[productsList.size()]));
		setStackPrice(stackPrices.toArray(new Double[productsList.size()]));
//		sc.close(); не используется, т.к. крашит программу. Scanner закроется при её завершении.
	}

	@SuppressWarnings("resource")
	public void continueVending(Product[] dealProducts, Integer[] quantities, Double[] stackPrices) {
		Scanner sc = new Scanner(System.in);
		String wannaBuy;
		ArrayList<Product> productsList1 = new ArrayList<Product>();
		ArrayList<Integer> quantitiesList1 = new ArrayList<Integer>();
		ArrayList<Double> stackPrices1 = new ArrayList<Double>();
		for (Product p : getDealProduct()) {
			productsList1.add(p);
		}
		for (int q : getQuantity()) {
			quantitiesList1.add(q);
		}
		for (double p : getStackPrice()) {
			stackPrices1.add(p);
		}
		int counter = getDealProduct().length;
		boolean buyMore = true;
		boolean inList;
		while (buyMore) {
			System.out.println("Введите наименование необходимого товара");
			String good = sc.next();
			good = good.toLowerCase();
			inList = false;
			int i = getDealProduct().length;
			int itemQ = 0;

			for (Product p : dealProducts) {
				if (p.getProductName().toLowerCase().contentEquals(good)) {
					i = productsList1.indexOf(p);
					totalPrice -= stackPrices1.get(i);
					productsList1.remove(i);
					itemQ = quantitiesList1.get(i);
					quantitiesList1.remove(i);
					stackPrices1.remove(i);
					inList = true;
				}
			}

			for (Product p : Pricelist.getProduct()) {
				if (p.getProductName().toLowerCase().contentEquals(good)) {
					System.out.println("Введите необходимое количество данного товара");
					int q = sc.nextInt();

					if (inList) {
						productsList1.add(i, p);
						quantitiesList1.add(i, q + itemQ);
						stackPrices1.add(i, (q + itemQ) * p.getDiscountPrice());
						totalPrice += (q + itemQ) * p.getDiscountPrice();
						counter++;

					} else {

						productsList1.add(counter, p);
						quantitiesList1.add(counter, q);
						stackPrices1.add(counter, q * p.getDiscountPrice());
						totalPrice += q * p.getDiscountPrice();
						counter++;
					}
				}
			}
			do {
				System.out.println("Желаете совершить ещё покупку? (да/нет)");
				wannaBuy = sc.next();
				wannaBuy = wannaBuy.toLowerCase();
				buyMore = false;
			} while (!((wannaBuy.contentEquals("да") || (wannaBuy.contentEquals("нет")))));
			if (wannaBuy.contentEquals("да")) {
				buyMore = true;
			}
		}
		setDealProduct(productsList1.toArray(new Product[productsList1.size()]));
		setQuantity(quantitiesList1.toArray(new Integer[productsList1.size()]));
		setStackPrice(stackPrices1.toArray(new Double[productsList1.size()]));
//		sc.close(); не используется, т.к. крашит программу. Scanner закроется при её завершении.
	}

	@SuppressWarnings("resource")
	public void deleteProduct(Product[] dealProducts, Integer[] quantities, Double[] stackPrices) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> productsList1 = new ArrayList<Product>();
		ArrayList<Integer> quantitiesList1 = new ArrayList<Integer>();
		ArrayList<Double> stackPrices1 = new ArrayList<Double>();

		for (Product p : getDealProduct()) {
			productsList1.add(p);
		}
		for (int q : getQuantity()) {
			quantitiesList1.add(q);
		}
		for (double p : getStackPrice()) {
			stackPrices1.add(p);
		}
		System.out.println("Введите наименование необходимого товара");
		String good = sc.next();
		good = good.toLowerCase();
		for (Product p : dealProducts) {
			if (p.getProductName().toLowerCase().contentEquals(good)) {
				int i = productsList1.indexOf(p);
				totalPrice -= stackPrices1.get(i);
				productsList1.remove(i);
				quantitiesList1.remove(i);
				stackPrices1.remove(i);
			}
		}
		setDealProduct(productsList1.toArray(new Product[productsList1.size()]));
		setQuantity(quantitiesList1.toArray(new Integer[productsList1.size()]));
		setStackPrice(stackPrices1.toArray(new Double[productsList1.size()]));
//		sc.close(); не используется, т.к. крашит программу. Scanner закроется при её завершении.
	}

	public DealStatus getStatus() {
		return status;
	}
}
