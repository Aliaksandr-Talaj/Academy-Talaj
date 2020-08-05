package by.academy.classwork.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Double> arrayList = new ArrayList<Double>();

		LinkedList<Double> linkedList = new LinkedList<Double>();

		long start = System.currentTimeMillis();
		
		for (int i=0;i<100_000;i++) {
			arrayList.add(0,Math.random()*10);
		}
		System.out.println("Время добавления в ArrayList, мс: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		for (int i=0;i<100_000;i++) {
			linkedList.add(0,Math.random()*10);
		}
		System.out.println("Время добавления в LinkedList, мс: " + (System.currentTimeMillis() - start));
	
		
		start = System.currentTimeMillis();
		
		for (int i=0;i<100_000;i++) {
			arrayList.get(i);
		}
		System.out.println("Время взятия из ArrayList, мс: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
	
		start = System.currentTimeMillis();
		for (int i=0;i<100_000;i++) {
			linkedList.get(i);
		}
		System.out.println("Время взятия из LinkedList, мс: " + (System.currentTimeMillis() - start));
		
	}
}
