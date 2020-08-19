package by.academy.classwork.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {

		File dir = new File ("./src/io");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		try (OutputStream output = new FileOutputStream("./src/io/file.txt");
				InputStream input = new FileInputStream("./src/io/file.txt");) {
			char[] symbols = { 'a', 'b', 'c' };

			for (char i : symbols) {
				// Запись каждого символа в текстовый файл
				output.write(i);
			}

			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}

		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}