package by.academy.lesson5;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Deal deal1 = new Deal();
		double totalPrice=0;
		User sidor = new User("Sidorovich");
		deal1.setSeller(sidor);
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя покупателя");
		User stalker = new User (sc.nextLine());
		deal1.setBuyer(stalker);
		System.out.println("Список товаров:\n");
		System.out.println("Наименование\t\t\tЦена, руб\tСкидка, %\tОписание товара");
				
		for (Product p:Pricelist.pricelist) {
			System.out.print("\n"+p.getProductName()+"\t\t\t");
			int i=p.getProductName().length();
			while (i<8) {
				System.out.print("\t");
				i+=4;
			};
			System.out.print(p.getProductPrice()+"\t\t\t"+p.getDiscountPercent()+"\t"+p.getProductDescription());
		}; 
		System.out.println("\nЖелаете совершить покупку? (да/нет)");
		String wannaBuy=sc.nextLine();
		wannaBuy=wannaBuy.toLowerCase();
		if (wannaBuy.contentEquals("да")) {
			ArrayList<Product> productsList = new ArrayList<Product>();
			ArrayList <Integer> quantityList = new ArrayList<Integer>();
			ArrayList <Double> stackPrice = new ArrayList<Double>();
			boolean buyMore=true;
			int counter=0;
			while (buyMore) {
				System.out.println("Введите наименование необходимого товара");
				String good=sc.next();
				good = good.toLowerCase();
				for (Product p:Pricelist.pricelist) {
					if (p.getProductName().toLowerCase().contentEquals(good)){
					
						System.out.println("Введите необходимое количество данного товара");
						int q=sc.nextInt();
						productsList.add(counter, p);
						quantityList.add(counter,q);
						stackPrice.add(counter,q*p.getDiscountPrice());
						totalPrice+=q*p.getDiscountPrice();
						counter++;
					}
				}
			System.out.println("Желаете совершить ещё покупку? (да/нет)");
			wannaBuy = sc.next();
			wannaBuy = wannaBuy.toLowerCase();
			buyMore = false;
				if (wannaBuy.contentEquals("да")) {
					buyMore=true;
					
				}
			}
		deal1.setDealProduct(productsList.toArray(new Product[productsList.size()]));
		deal1.setQuantity(quantityList.toArray(new Integer [productsList.size()]));
		deal1.setStackPrice(stackPrice.toArray(new Double[productsList.size()]));
		}
		System.out.println();
		System.out.println("Продавец: "+deal1.getSeller().getUserName());
		System.out.println("Покупатель: "+deal1.getBuyer().getUserName() );
		int counter=0;
		for (Product p:deal1.getDealProduct()) {
			System.out.println(p.getProductName()+"\t\t"+deal1.getQuantity()[counter]+
					" шт.\t\t"+ deal1.getStackPrice()[counter]+" руб.");
			counter++;
		}
		System.out.println("Сумма к оплате: "+ totalPrice+" руб.");
		sc.close();
				
		
	}
}
