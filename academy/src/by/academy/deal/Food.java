package by.academy.deal;

@ProducerInfo(company="������ \"���\"", name = "", number = 2020317, productType = {"������� �������","��������"})
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
