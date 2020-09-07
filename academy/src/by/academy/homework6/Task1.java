package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Не использовать циклы (for/while/do-while).
//Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
//Каждое число умножить на PI и отнять 20.
//Отфильтровать, оставив числа меньшие 100.
//Отсортировать по возрастанию.
//Пропустив первые 3 числа произвести следующие операции:
//Преобразовать лист чисел в Map (операция collect),
//где ключем является само число а значением строка: ("Number: " + value).

public class Task1 {

	public static void main(String[] args) {

		File dir = new File("./src/by/academy/homework6/results");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		try (BufferedWriter bWriter = new BufferedWriter(
				new FileWriter("./src/by/academy/homework6/results/Task1.txt"))) {

			// Основная часть решения задачи
			Map<Long, String> longMap = Stream.generate(() -> new Random().nextInt(100)).distinct().limit(100)
					.map(i -> (long) (i * Math.PI - 20)).filter(l -> l < 100).sorted().skip(3)
					.collect(Collectors.toMap(l -> l, l -> "Number: " + l));

			// Вывод + запись в файл в папке result
			longMap.keySet().stream().forEach(l -> {
				System.out.println(l + " " + longMap.get(l));

				try {
					bWriter.append((l + " " + longMap.get(l)));
					bWriter.newLine();
				} catch (IOException e) {
					System.out.println("Something is going wrong O_o");
					e.printStackTrace();
				}
			});
			bWriter.flush();

		} catch (IOException e) {
			System.out.println("Something is going wrong O_o");
			e.printStackTrace();
		}
	}

}
