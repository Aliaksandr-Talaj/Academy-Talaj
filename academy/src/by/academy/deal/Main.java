package by.academy.deal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Deal deal1 = new Deal();
		User sidor = new User("Sidorovich");
		deal1.setSeller(sidor);

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ����������");
		
		
		User stalker = new User(sc.nextLine());
		
		
		deal1.setBuyer(stalker);
		System.out.println("������ �������:\n");
		System.out.println("������������\t\t\t����, ���\t������, %\t�������� ������");

		for (Product p : Pricelist.getProduct()) {
			System.out.print("\n" + p.getProductName() + "\t\t\t");
			int i = p.getProductName().length();
			while (i < 8) {
				System.out.print("\t");
				i += 4;
			}
			System.out
					.print(p.getProductPrice() + "\t\t\t" + p.getDiscountPercent() + "\t" + p.getProductDescription());
		}
		System.out.println("\n������� ��������� �������? (��/���)");
		String wannaBuy = sc.nextLine();
		wannaBuy = wannaBuy.toLowerCase();
			
		System.out.println(deal1.toString());
		
		sc.close();

	}
}
