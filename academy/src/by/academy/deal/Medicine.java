package by.academy.deal;

@ProducerInfo(company="\"Пилюлькин и Ко.\"", name = "", number = 14585, productType = {"Медикаменты","средства перевязки"})
class Medicine extends Product {

	public Medicine(String productName, double price, String productDescription) {
		super();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
	}

	public Medicine(String productName, double price, String productDescription, int discountPercent) {
		super();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.discountPercent = discountPercent;
	}
}