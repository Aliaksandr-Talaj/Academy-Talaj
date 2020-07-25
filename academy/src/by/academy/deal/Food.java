package by.academy.deal;

@ProducerInfo(company = "Колхоз \"Ник\"", name = "", number = 2020317, productType = { "продукт питания", "алкоголь" })
class Food extends Product {

	public Food(String productName, double price, String productDescription) {
		super();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
	}

	public Food(String productName, double price, String productDescription, int discountPercent) {
		super();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.discountPercent = discountPercent;

	}
}
