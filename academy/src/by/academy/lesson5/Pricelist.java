package by.academy.lesson5;

public final class Pricelist {
			
	
	public static Food kolbasa 	=  new Food ("�������", 			70,	 "�� ��������");
	public static Product baton  	= new Product ("�����", 			10,  "�� ��������");
	public static Product vodka 	= new Product ("�����", 			40,  "���������������� ���������� �����");
	public static Product tushenka 	= new Product ("�������", 			40,  "\"������� �������\" ����� �� 250, �� 300");
	public static Product energetik = new Product ("���������",			50,  "������ ��� ������� � ������� ������ ���������� ��������-����������");	
	public static Product bint 		= new Product ("����", 				80,  "\"������\", ���������� ");
	public static Product aptechka 	= new Product ("�������", 			250, "��������� � ���������, ��������� �� ��������� ��� ���������");
	public static Product antirad 	= new Product ("�������", 			300,  "��� ����� ���� �� ���, ��� ����� �������");
	public static Product obrez 	= new Product ("�����", 			400,  "������ ������ ����");
	public static Product drob 		= new Product ("�������", 			10,  "������ - �� ����...");
	
	
	public static Product[] pricelist = {	
			kolbasa, baton,	vodka, tushenka, energetik, bint, aptechka, antirad, obrez, drob
	};
	public Product [] getProduct() {
		return pricelist;
	}
	
	
}
