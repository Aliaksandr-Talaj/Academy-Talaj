package by.academy.classwork.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task12 {

	public static void main(String[] args) {

		ArrayList<Double> arrayList = new ArrayList<Double>();

		LinkedList<Double> linkedList = new LinkedList<Double>();

		long start = System.currentTimeMillis();
		
		for (int i=0;i<100_000;i++) {
			arrayList.add(0,Math.random()*10);
		}
		System.out.println("Время выполнения ArrayList, мс: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		for (int i=0;i<100_000;i++) {
			linkedList.add(0,Math.random()*10);
		}
		System.out.println("Время выполнения LinkedList, мс: " + (System.currentTimeMillis() - start));
	}
}
