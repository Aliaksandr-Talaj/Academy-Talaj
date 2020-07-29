package by.academy.classwork.lesson10.task7;

public class Main {

	public static void main(String[] args) {
		Integer[][] m1 = { { 1, 6, 5, 8 }, { 7, 4, 9, 2 }, { 6, 3, 2, 3 }, { 4, 5, 7, 1 } };
		Матрица <Integer>matr1 = new Матрица<Integer>(m1, 4, 4);
		Double[][] m2 = { { 4., 55., 6., 31. }, { 34., 5., 6., -7. }, { 5., 4., 8., 0. }, { 3., 4., 9., 2. } };
		Матрица <Double> matr2 = new Матрица<Double>(m2, 4, 4);
		System.out.println("Матица 1:");
		matr1.printMatrix();
		System.out.println("\nМатрица 2:");
		matr2.printMatrix();
		System.out.println("\nУмножение матрицы 1 на 4:");

		matr1.multiplying(4);
		matr1.printResult();
		System.out.println("\nСложение матрицы 1 и матрицы 2:");

		matr1.summing(matr2);
		matr1.printResult();

	}

}
