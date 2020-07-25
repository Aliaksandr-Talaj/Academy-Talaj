package by.academy.deal;

@ProducerInfo(company="\"��������� � ��.\"", name = "", number = 14585, productType = {"�����������","�������� ���������"})
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