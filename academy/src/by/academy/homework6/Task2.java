package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;

//	a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
//	b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
//	c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User.
//	Вывести с помощью рефлексии все поля и методы, сначала через 
//	getMethod("name")
//	getMethods()
//	getField("name")
//	getFields()
//	а затем через 
//	getDeclaredMethod("name")
//	getDeclaredMethods()
//	getDeclaredField("name")
//	getDeclaredFields()
//	Посмотреть разницу. Просетать все значения через Reflection.(set метод класса Field).
//	Вывести значения полей через Reflection. (get метод класса Field).
//	Вызвать printUserInfo через invoke.

public class Task2 {

	public static void main(String[] args) throws ParseException {

		File dir = new File("./src/by/academy/homework6/results");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		User user1 = new User("NineDeaths", "FerroIsHot", "DontWriteToMe@soap.com", 35, "01/02/2006", "Logen",
				"NineFingers");

		Class<? extends User> userClass = user1.getClass();

		try (BufferedWriter bWriter = new BufferedWriter(
				new FileWriter("./src/by/academy/homework6/results/Task2.txt"))) {

			PrintableToConsoleAndFile now = (s) -> {
				System.out.println(s);
				try {
					bWriter.append((String) s);
					bWriter.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			};

			now.print("Методы через getMethod(\"name\"): ");
			now.print(userClass.getMethod("printUserInfo").toString());
			now.print(userClass.getMethod("appendUserInfoToFile", BufferedWriter.class).toString());
			now.print(userClass.getMethod("getEmail").toString());
			now.print(userClass.getMethod("getLogin").toString());
			now.print(userClass.getMethod("getPassword").toString());
			now.print(userClass.getMethod("getAge").toString());
			now.print(userClass.getMethod("getDateOfBirth").toString());
			now.print(userClass.getMethod("getFirstName").toString());
			now.print(userClass.getMethod("getLastName").toString());
			now.print(userClass.getMethod("setEmail", String.class).toString());
			now.print(userClass.getMethod("setLogin", String.class).toString());
			now.print(userClass.getMethod("setPassword", String.class).toString());
			now.print(userClass.getMethod("setAge", Integer.class).toString());
			now.print(userClass.getMethod("setDateOfBirth", String.class).toString());
			now.print(userClass.getMethod("setFirstName", String.class).toString());
			now.print(userClass.getMethod("setLastName", String.class).toString());
			now.print("");

			now.print("Методы через getMethods(): ");
			Method[] methods1 = userClass.getMethods();
			for (Method m : methods1) {
				now.print(m.toString());
			}
			now.print("");

			now.print("Поля через getField(\"name\"): ");
			now.print(userClass.getField("format").toString());
			now.print("");

			now.print("Поля через getFields(): ");
			Field[] fields1 = userClass.getFields();
			for (Field f : fields1) {
				now.print(f.toString());
			}
			now.print("");

			now.print("Методы через getDeclaredMethod(\"name\"): ");
			now.print(userClass.getDeclaredMethod("printUserInfo").toString());
			now.print(userClass.getDeclaredMethod("getEmail").toString());
			now.print(userClass.getDeclaredMethod("getLogin").toString());
			now.print(userClass.getDeclaredMethod("getPassword").toString());
			now.print(userClass.getDeclaredMethod("setEmail", String.class).toString());
			now.print(userClass.getDeclaredMethod("setLogin", String.class).toString());
			now.print(userClass.getDeclaredMethod("setPassword", String.class).toString());
			now.print("");

			now.print("Методы через getDeclaredMethods(): ");
			Method[] methods2 = userClass.getDeclaredMethods();
			for (Method m : methods2) {
				now.print(m.toString());
			}
			now.print("");

			now.print("Поля через getDeclaredField(\"name\"): ");
			now.print(userClass.getDeclaredField("email").toString());
			now.print(userClass.getDeclaredField("login").toString());
			now.print(userClass.getDeclaredField("password").toString());
			now.print(Person.class.getDeclaredField("age").toString());
			now.print(Person.class.getDeclaredField("dateOfBirth").toString());
			now.print(Person.class.getDeclaredField("firstName").toString());
			now.print(Person.class.getDeclaredField("lastName").toString());
			now.print("");

			now.print("Поля через getDeclaredFields(): ");

			Field[] fields2 = userClass.getDeclaredFields();
			for (Field f : fields2) {
				now.print(f.toString());
			}
			Field[] fields3 = Person.class.getDeclaredFields();
			for (Field f : fields3) {
				now.print(f.toString());
			}
			now.print("");

			now.print("Вывод текущих значений с помощью invoke метода printUserInfo:");
			userClass.getMethod("printUserInfo").invoke(user1);
			userClass.getMethod("appendUserInfoToFile", BufferedWriter.class).invoke(user1, bWriter);
			now.print("");

			Field emailField = userClass.getDeclaredField("email");
			Field loginField = userClass.getDeclaredField("login");
			Field passwordField = userClass.getDeclaredField("password");
			Field ageField = Person.class.getDeclaredField("age");
			Field dateOfBirthField = Person.class.getDeclaredField("dateOfBirth");
			Field firstNameField = Person.class.getDeclaredField("firstName");
			Field lastNameField = Person.class.getDeclaredField("lastName");

			emailField.setAccessible(true);
			loginField.setAccessible(true);
			passwordField.setAccessible(true);
			ageField.setAccessible(true);
			dateOfBirthField.setAccessible(true);
			firstNameField.setAccessible(true);
			lastNameField.setAccessible(true);

			emailField.set(user1, "DontWriteToMeAnyway@soap.com");
			loginField.set(user1, "Nine_Deaths");
			passwordField.set(user1, "BethodIsToad");
			ageField.set(user1, 33);
			dateOfBirthField.set(user1, Person.format.parse("02/01/2006"));
			firstNameField.set(user1, "LOGEN");
			lastNameField.set(user1, "NINEDEATHS");

			now.print("Вывод изменённых значения полей через get метод класса Field:");
			now.print("Login: " + loginField.get(user1));
			now.print("Password: " + passwordField.get(user1));
			now.print("Email: " + emailField.get(user1));
			now.print("Age: " + ageField.get(user1));
			now.print("Date of birth: " + dateOfBirthField.get(user1));
			now.print("First name: " + firstNameField.get(user1));
			now.print("Last name: " + lastNameField.get(user1));

			now.print("");

			bWriter.flush();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
