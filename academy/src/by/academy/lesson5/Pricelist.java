package by.academy.lesson5;

public final class Pricelist {
			
	
	public static Food 		kolbasa =  new Food 	("�������", 	70,	"�� ��������");
	public static Food 		baton  	= new Food 		("�����", 		10,	"�� ��������");
	public static Food		vodka 	= new Food 		("�����", 		40, "���������������� ���������� �����");
	public static Food		tushenka = new Food 	("�������", 	40, "\"������� �������\" ����� �� 250, �� 300");
	public static Food 		energetik= new Food		("���������",	50, "������ ��� ������� � ������� ������ ���������� ��������-����������");	
	public static Medicine 	bint 	= new Medicine	("����", 		80, "\"������\", ���������� ");
	public static Medicine 	aptechka = new Medicine	("�������", 	250,"��������� � ���������, ��������� �� ��������� ��� ���������");
	public static Medicine 	antirad = new Medicine	("�������", 	300,"��� ����� ���� �� ���, ��� ����� �������");
	public static Weapon 	obrez 	= new Weapon 	("�����", 		400,"������ ������ ����");
	public static Weapon 	drob 	= new Weapon 	("�������", 	10, "������ - �� ����...");
	
	
	public static Product[] pricelist = {	
			kolbasa, baton,	vodka, tushenka, energetik, bint, aptechka, antirad, obrez, drob
	};
	public Product [] getProduct() {
		return pricelist;
	}
	
	
}
