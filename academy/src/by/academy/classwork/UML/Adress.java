package by.academy.classwork.UML;

public class Adress {
	private int doorNo;
	private String street;
	private String city;
	private	String zip;
	private Customer customer;
	
	public Adress() {
		super();
	}
	
	public Adress(int doorNo, String street, String city, String zip, Customer customer) {
		super();
		this.city = city;
		this.customer = customer;
		this.doorNo = doorNo;
		this.street = street;
		this.zip = zip;		
	}
	public Adress(Customer customer) {
		super();
		this.customer = customer;
	}
	
}
