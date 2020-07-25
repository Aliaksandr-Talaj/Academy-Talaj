package by.academy.deal;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Deal deal1 = new Deal();
		User sidor = new User("Sidorovich", "+375292020327", "kordon@slepaya.tam");
		deal1.setSeller(sidor);

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя покупателя");

		User stalker = new User(sc.next());
		deal1.setBuyer(stalker);
		Validator eVal = new EmailValidator();
		Validator telVal = new TelephoneValidator();
		DateValidator dateVal = new DateValidator();
		String uInput;
		do {
			System.out.println("Введите email");
			uInput = sc.next();
		} while (eVal.isntValid(uInput));
		deal1.getBuyer().setEmail(uInput);
		do {
			System.out.println("Введите номер телефона в формате \"+375(--)-------\"");
			uInput = sc.next();

		} while (telVal.isntValid(uInput));
		deal1.getBuyer().setTelNumber(uInput);
		do {
			System.out.println("Введите дату рождения в формате dd-mm-yyyy или dd/mm/yyyy");
			uInput = sc.next();

		} while (dateVal.isntValid(uInput));

		deal1.getBuyer().setDateOfBirth(uInput, dateVal.isFirstFormat(uInput));

		Pricelist.print();

		System.out.println();
		String wannaBuy;
		do {
			System.out.println("Желаете совершить покупку? (да/нет)");
			wannaBuy = sc.next();
			wannaBuy = wannaBuy.toLowerCase();
		} while (!((wannaBuy.contentEquals("да") || (wannaBuy.contentEquals("нет")))));
		if (wannaBuy.contentEquals("да")) {
			deal1.vending();
			do {
				System.out.println(deal1.toString());
				System.out.println();
				do {
					System.out.println("Завершить сделку? (да/нет)");
					uInput = sc.next();
				} while (!((uInput.contentEquals("да") || (uInput.contentEquals("нет")))));
				if (uInput.contentEquals("да")) {
					deal1.finishDeal();
				} else {

					System.out.println(
							"Хотите добавить(1) или удалить(2) товар? Введите (3), чтобы завершить сделку или (4), чтобы увидеть список товаров и счет");
					int i = sc.nextInt();
					switch (i) {
					case 1:
						deal1.continueVending(deal1.getDealProduct(), deal1.getQuantity(), deal1.getStackPrice());
						break;
					case 2:
						if (deal1.getDealProduct().length == 0) {
							System.out.println("Список товаров пуст!");
							break;
						}
						deal1.deleteProduct(deal1.getDealProduct(), deal1.getQuantity(), deal1.getStackPrice());
						break;
					case 3:
						deal1.finishDeal();
						break;
					default:
						Pricelist.print();
					}

				}
			} while (deal1.getStatus() != DealStatus.DONE);
		}
		System.out.println("Ну, удачной охоты!)");

		sc.close();

	}
}
