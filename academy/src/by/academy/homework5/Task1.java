package by.academy.homework5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Прочесть информацию введеную из клавиатуры и записать
//в созданный вами txt файл, если введена "stop" строка
//тогда закончить запись в файл.

public class Task1 {
	public static void main(String[] args) {
		File dir = new File("./src/by/academy/homework5/txt/Task1");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		Scanner sc = new Scanner(System.in);

		try (BufferedWriter bos = new BufferedWriter(new FileWriter("./src/by/academy/homework5/txt/Task1.txt"))) {

			String s;
			while (true) {
				System.out.println("Enter your data in line or print \"stop\" to stop input");
				s = sc.nextLine();
				if (!s.equals("stop")) {
					bos.append(s);
					bos.newLine();
				} else {
					break;
				}

			}
			bos.flush();

		} catch (IOException e) {
			System.out.println("Something is going wrong O_o");
			sc.close();
		}

		sc.close();

	}
}
