package by.academy.classwork.lesson6.task4;

public class Base {
	
	

	static Reader petrov = new Reader("������ �.�.", 12345,
			"���","12.11.1991", "2020327");
	static Reader ivanov = new Reader("������ �.�.", 12346,
			"���","15.01.1991", "2022344");
	static Reader sidorov = new Reader("������� �.�.", 12348,
			"���","24.05.1991", "2027583");
	
	private static Reader [] readers= {petrov, ivanov, sidorov};
	
	
	public static Reader[] getReaders() {
		return readers;
	}

	public static Book [] getBooks() {
		return books;
	}

	static Book slovar = new Book("�������","�.�. ����");
	static Book prikl = new Book("����������� ���� ������","�. ����");
	static Book ency = new Book("������������ ������������ �����������",
			"�. ������������"); 
	private static Book [] books = {slovar,prikl,ency};
	
}
