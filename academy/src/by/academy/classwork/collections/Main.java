package by.academy.classwork.collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Task1 t1 = new Task1();
		ArrayList arList = new ArrayList<Integer>();
		for (int i = 0; i < 16; i++) {

			arList.add(i % 3);
		}

		System.out.println(arList.toString());
		
		System.out.println(t1.removeDoubles(arList));
		
		
	}

}
