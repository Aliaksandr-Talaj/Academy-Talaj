package by.academy.homework5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Создайте каталог(папку). Создайте в папке 100 txt файлов 
//(Например, 1.txt, 2.txt ... 100.txt).
//Считываем текст из 2-ого задания, получаем его длинну (576 символов).
//Для каждого файла генерируем рандомное число от 0 до 576,
//достаем из текста (из 2 задания) такое-же количество символов (string.substring())
//и сохраняем в наш файл. 
//Создайте файл result.txt и запишите туда список всех файлов и их размеры.

public class Task4 {

	public static void main(String[] args) {

		File dir = new File("./src/by/academy/homework5/txt/Task4/files");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		// Переводим текст из исходого файла в объект StringBuilder,
		// чтобы минимизировать количество обращений к исходному файлу

		StringBuilder text = new StringBuilder();
		try (FileReader fileR = new FileReader("./src/by/academy/homework5/txt/Task2/source.txt")) {

			int a;
			while ((a = fileR.read()) != -1) {
				text.append((char) a);

			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return;
		}

		for (int i = 1; i <= 100; i++) {

			File file = new File("./src/by/academy/homework5/txt/Task4/files/" + i + ".txt");

			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
					return;
				}
			}

			int sub = (int) (Math.random() * text.length());

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

				bw.append(text.substring(0, sub));
				bw.flush();

			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
				return;
			}

		}

		File result = new File("./src/by/academy/homework5/txt/Task4/result.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(result))) {
			File[] filesList = dir.listFiles();
			for (File f : filesList) {
				bw.append(f.getName());
				bw.append(" \t");
				bw.append(Long.toString(f.length()));
				bw.append("\tbytes");
				bw.newLine();
			}

			bw.flush();

		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("Everything seems to be OK");

	}
}
