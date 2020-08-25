package by.academy.homework5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Создать руками текстовый файл, закинуть текст
//Создать новый файл result.txt.
//Программно считать файл с текстом, 
//удалить все пробелы и записать полученный текст в result.txt.

public class Task2 {
	public static void main(String[] args) {

		File dir = new File("./src/by/academy/homework5/txt/Task2");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		try (FileReader fileR = new FileReader("./src/by/academy/homework5/txt/Task2/source.txt");
				FileWriter fileW = new FileWriter("./src/by/academy/homework5/txt/Task2/result.txt")) {

			int a;
			while ((a = fileR.read()) != -1) {
				if (a != 32) {
					fileW.write(a);
				} else {
					continue;
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return;
		}

	}
}