package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.ParseException;

public class User extends Person {

	private String email;
	private String login;
	private String password;

	public User() {
		super();
	}

	public User(String login, String password, String email) {
		super();
		this.email = email;
		this.login = login;
		this.password = password;
	}

	public User(String login, String password, String email, int age, String dateOfBirth, String firstName,
			String lastName) throws ParseException {
		super();
		this.email = email;
		this.login = login;
		this.password = password;
		setAge(age);
		setDateOfBirth(dateOfBirth);
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getEmail() {
		return email;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public void printUserInfo() {
		System.out.println("Login: " + login);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
		System.out.println("Age: " + getAge());
		System.out.println("Date of birth: " + getDateOfBirth());
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last name: " + getLastName());
	}

	public void appendUserInfoToFile(BufferedWriter bWriter) throws IOException {
		bWriter.append("Login: " + login);
		bWriter.newLine();
		bWriter.append("Password: " + password);
		bWriter.newLine();
		bWriter.append("Email: " + email);
		bWriter.newLine();
		bWriter.append("Age: " + getAge());
		bWriter.newLine();
		bWriter.append("Date of birth: " + getDateOfBirth());
		bWriter.newLine();
		bWriter.append("First Name: " + getFirstName());
		bWriter.newLine();
		bWriter.append("Last name: " + getLastName());
		bWriter.newLine();

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}