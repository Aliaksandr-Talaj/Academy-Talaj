package by.academy.deal;

public final class Pricelist {

	public static Food 		kolbasa = 	new Food	("�������", 70, "�� ��������", 4);
	public static Food 		baton = 	new Food	("�����", 10, "�� ��������", 5);
	public static Food 		vodka = 	new Food	("�����", 40, "���������������� ���������� �����", 3);
	public static Food 		tushenka = 	new Food	("�������", 40, "\"������� �������\" ����� �� 250, �� 300", 5);
	public static Food 		energetik = new Food	("���������", 50,
			"������ ��� ������� � ������� ������ ���������� ��������-����������", 2);
	public static Medicine 	bint = 		new Medicine("����", 80, "\"������\", ���������� ", 7);
	public static Medicine 	aptechka = 	new Medicine("�������", 250,
			"��������� � ���������, ��������� �� ��������� ��� ���������", 8);
	public static Medicine 	antirad = 	new Medicine("�������", 300, "��� ����� ���� �� ���, ��� ����� �������", 12);
	public static Weapon 	obrez = 	new Weapon	("�����", 400, "������ ������ ����", 4);
	public static Weapon 	drob = 		new Weapon	("�������", 10, "������ - �� ����...", 5);

	private static Product[] pricelist = { kolbasa, baton, vodka, tushenka, energetik, bint, aptechka, antirad, obrez,
			drob };

	public static Product[] getProduct() {
		return pricelist;
	}

	public static void print() {
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
	}
	
}
