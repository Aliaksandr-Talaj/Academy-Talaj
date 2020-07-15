package by.academy.classwork.lesson6.task4;

public class Reader {
	private String fio;
	private int ticketNumber;
	private String faculty;
	private String dateOfBirth;
	private String telNumber;
	
	public Reader() {
		super();
	}
	public Reader(String fio, int ticketNumber,
			String faculty,String dateOfBirth, String telNumber) {
		this.fio = fio;
		this.ticketNumber = ticketNumber;
		this.faculty = faculty;
		this.telNumber = telNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	public void takeBook(int quantity) {
		System.out.println(this.fio+" взял "+quantity+" книг");
	}
	public void takeBook(String ...strings ) {
		System.out.println(this.fio+" взял книги: ");
		for (int i=0; i<strings.length;i++) {
			System.out.print(strings[i]+" ");
		}
	}
	public void takeBook(Book ...books ) {
		System.out.println(this.fio+" взял книги: ");
		for (int i=0; i<books.length;i++) {
			System.out.print(books[i].getBookName()+" ");
		}
	}
	public void takeBook() {
		
	}
	public void returnBook(int quantity) {
		System.out.println(this.fio+" вернул "+quantity+" книг");
	}
	public void returnBook(String ...strings ) {
		System.out.println(this.fio+" вернул книги: ");
		for (int i=0; i<strings.length;i++) {
			System.out.print(strings[i]+" ");
		}
	}
	public void returnBook(Book ...books ) {
		System.out.println(this.fio+" вернул книги: ");
		for (int i=0; i<books.length;i++) {
			System.out.print(books[i].getBookName()+"\n");
		}
	}
	
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
