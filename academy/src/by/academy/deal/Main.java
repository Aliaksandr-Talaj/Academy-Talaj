package by.academy.deal;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Deal deal1 = new Deal();
		User sidor = new User("Sidorovich", "+375292020327", "kordon@slepaya.tam");
		deal1.setSeller(sidor);

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ����������");

		User stalker = new User(sc.next());
		deal1.setBuyer(stalker);
		Validator eVal = new EmailValidator();
		Validator telVal = new TelephoneValidator();
		DateValidator dateVal = new DateValidator();
		String uInput;
		do {
			System.out.println("������� email");
			uInput = sc.next();
		} while (eVal.isntValid(uInput));
		deal1.getBuyer().setEmail(uInput);
		do {
			System.out.println("������� ����� �������� � ������� \"+375(--)-------\"");
			uInput = sc.next();

		} while (telVal.isntValid(uInput));
		deal1.getBuyer().setTelNumber(uInput);
		do {
			System.out.println("������� ���� �������� � ������� dd-mm-yyyy ��� dd/mm/yyyy");
			uInput = sc.next();

		} while (dateVal.isntValid(uInput));

		deal1.getBuyer().setDateOfBirth(uInput, dateVal.isFirstFormat(uInput));

		Pricelist.print();

		System.out.println();
		String wannaBuy;
		do {
			System.out.println("������� ��������� �������? (��/���)");
			wannaBuy = sc.next();
			wannaBuy = wannaBuy.toLowerCase();
		} while (!((wannaBuy.contentEquals("��") || (wannaBuy.contentEquals("���")))));
		if (wannaBuy.contentEquals("��")) {
			deal1.vending();
			do {
				System.out.println(deal1.toString());
				System.out.println();
				do {
				System.out.println("��������� ������? (��/���)");
				uInput = sc.next();
				} while (!((uInput.contentEquals("��") || (uInput.contentEquals("���")))));
				if (uInput.contentEquals("��")) {
					deal1.finishDeal();
				} else {

					System.out.println(
							"������ ��������(1) ��� �������(2) �����? ������� (3), ����� ��������� ������ ��� (4), ����� ������� ������ ������� � ����");
					int i = sc.nextInt();
					switch (i) {
					case 1:
						deal1.continueVending(deal1.getDealProduct(), deal1.getQuantity(), deal1.getStackPrice());
						break;
					case 2:
						if (deal1.getDealProduct().length == 0) {
							System.out.println("������ ������� ����!");
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
		System.out.println("��, ������� �����!)");

		sc.close();

	}
}
