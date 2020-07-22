package by.academy.lesson4;

public class Main {
	public static void main(String[] args) {
		Product product = new Product("PC", 1000, 3);

		System.out.println("product name: " + product.getName());
		System.out.println("price: " + product.getPrice());
		System.out.println("quantuty: " + product.getQuantity());
		System.out.println("Total price: " + product.getPrice() * product.getQuantity());
	}
}
