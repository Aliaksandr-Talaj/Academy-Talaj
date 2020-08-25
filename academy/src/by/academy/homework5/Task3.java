package by.academy.homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Создайте класс User с полями Имя, Фамилия, Возраст
//и конструктором(Имя, Фамилия, Возраст).
//В классе Main создайте ArrayList<User>,
//добавьте 10 пользователей в коллекцию.
//Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//Назовите файл Имя_Фамилия.txt.
//Сериализуйте информацию о пользователе и положите в файл пользователя.
//Не забываем закрывать потоки. 
//В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class Task3 {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<>();

		users.add(new User("Jean-Claude", "Van Damme", 59));
		users.add(new User("Sylvester", "Stallone", 74));
		users.add(new User("Jason", "Statham", 53));
		users.add(new User("Dolph", "Lundgren", 62));
		users.add(new User("Chuck", "Norris", 80));
		users.add(new User("Bruce", "Willis", 65));
		users.add(new User("Arnold", "Schwarzenegger", 73));
		users.add(new User("Jackie", "Chan", 66));
		users.add(new User("Pierre", "Richard", 86));
		users.add(new User("Alain", "Delon", 84));

		File dir = new File("./src/by/academy/homework5/txt/Task3/users");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (User user : users) {

			File userFile = new File(
					"./src/by/academy/homework5/txt/Task3/users/" + user.getName() + "_" + user.getSurname() + ".txt");

			if (!userFile.exists()) {
				try {
					userFile.createNewFile();
				} catch (IOException e) {
					System.err.println("This program must have been broken by Chuck Norris!");
					System.err.println(e.getMessage());
					e.printStackTrace();
					return;
				}
			}

			try (FileOutputStream fos = new FileOutputStream(userFile);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {

				oos.writeObject(user);

			} catch (IOException e) {
				System.err.println("This program must have been broken by Chuck Norris!");
				System.err.println(e.getMessage());
				e.printStackTrace();
				return;
			}

		}
		System.out.println("Operation completed, ave Chuk!");
	}
}
