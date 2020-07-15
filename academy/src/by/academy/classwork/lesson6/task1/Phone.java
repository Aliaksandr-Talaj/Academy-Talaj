package by.academy.classwork.lesson6.task1;

public class Phone {
	private String number;
	private String model;
	private double weight;
	private String name;
	
	public Phone() {
		super();
	}
	public Phone(String number, String model) {
		this.number=number;
		this.model=model;
	}
	public Phone(String number, String model, double weight) {
		this(number, model);
		this.weight=weight;
	}
		
	public void receiveCall(String name) {
		System.out.println("Звонит "+name);
	}
	public void receiveCall(String name, String number) {
		System.out.println("Звонит "+name+", номер: "+ number);
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String ...strings ) {
		for (String i: strings) {
			System.out.println(i);
		}
	}
}


