package by.academy.classwork.lesson6.task4;

public class Base {

	static Reader petrov = new Reader("Петров В.В.", 12345, "ФТК", "12.11.1991", "2020327");
	static Reader ivanov = new Reader("Иванов П.Д.", 12346, "ФТК", "15.01.1991", "2022344");
	static Reader sidorov = new Reader("Сидоров Е.С.", 12348, "ФТК", "24.05.1991", "2027583");

	private static Reader[] readers = { petrov, ivanov, sidorov };

	static Book slovar = new Book("Словарь", "В.И. Даль");
	static Book prikl = new Book("Приключения Тома Сойера", "М. Твен");
	static Book ency = new Book("Классическая энциклопедия бодибилдера", "А. Шварценеггер");

	private static Book[] books = { slovar, prikl, ency };

	public static Book[] getBooks() {
		return books;
	}

	public static Reader[] getReaders() {
		return readers;
	}

}
