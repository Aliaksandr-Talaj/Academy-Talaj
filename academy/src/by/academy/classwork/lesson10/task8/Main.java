package by.academy.classwork.lesson10.task8;

public class Main {

	public static void main(String[] args) {
		Integer [] arr1 = { 1, 2, 3, 4, 5 };
		Double [] arr2 = { 1.1, 2.2, 3.3, 4.4, 5.0 };
		
		MinMax <Integer> mm1 = new MinMax<Integer>(arr1);
		MinMax <Double> mm2 = new MinMax<Double>(arr2);
		
		System.out.println("Минимум массива 1: "+mm1.min());
		System.out.println("Минимум массива 2: "+mm2.min());
		System.out.println("Максимум массива 1: "+mm1.max());
		System.out.println("Максимум массива 2: "+mm2.max());
		mm1.bigger(mm2);
		
	}

}
