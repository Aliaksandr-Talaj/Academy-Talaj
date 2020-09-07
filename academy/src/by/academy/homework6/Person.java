package by.academy.homework6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	public static SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");
	private Integer age;
	private Date dateOfBirth;
	private String firstName;
	private String lastName;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, Integer age, Date dateOfBirth) {
		super();

		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Integer getAge() {
		return age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setDateOfBirth(String dateOfBirth) throws ParseException {
		this.dateOfBirth = format.parse(dateOfBirth);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
