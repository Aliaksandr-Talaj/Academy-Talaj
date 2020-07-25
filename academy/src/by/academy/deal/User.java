package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

	private String userName;
	private String telNumber;
	private String email;
	private Date dateOfBirth;

	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");

	public User() {
		super();
	}

	public User(String userName) {
		super();
		this.userName = userName;
	}

	public User(String userName, Date dateOfBirth) {
		super();
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
	}

	public User(String userName, Date dateOfBirth, String telNumber) {
		super();
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.telNumber = telNumber;
	}

	public User(String userName, String telNumber, String email) {
		super();
		this.userName = userName;
		this.telNumber = telNumber;
		this.email = email;
	}
	
	public User(String userName, Date dateOfBirth, String telNumber, String email) {
		super();
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.telNumber = telNumber;
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth, boolean firstFormat) throws ParseException {
		if (firstFormat) {
			this.dateOfBirth = format1.parse(dateOfBirth);
		} else {
			this.dateOfBirth = format2.parse(dateOfBirth);
		}
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
