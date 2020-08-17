package by.academy.homework4;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

//	Создать список оценок учеников с помощью ArryList,
//	заполнить случайными оценками. 
//	Найти самую высокую оценку с использованием итератора.

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			marks.add((int) (Math.random() * 100));
		}

		Iterator<Integer> iterator = marks.iterator();
		Integer maxMark = 0;
		int temp = 0;
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (temp > maxMark) {
				maxMark = temp;
			}
		}
		System.out.println("Самая высокая оценка: " + maxMark);
	}

}
