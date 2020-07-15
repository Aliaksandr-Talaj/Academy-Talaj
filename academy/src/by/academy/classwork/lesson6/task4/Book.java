package by.academy.classwork.lesson6.task4;

public class Book {
	private String bookName;
	private String bookAuthor;

	public Book() {
		super();
	}

	public Book(String bookName, String bookAuthor) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;

	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
