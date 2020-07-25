package by.academy.classwork.lesson6.task3;

public class Main {

	public static void main(String[] args) {
		double[][] m1 = { { 1, 6, 5, 8 }, { 7, 4, 9, 2 }, { 6, 3, 2, 3 }, { 4, 5, 7, 1 } };
		Матрица matrix1 = new Матрица(m1, 4, 4);
		double[][] m2 = { { 4, 55, 6, 31 }, { 34, 5, 6, -7 }, { 5, 4, 8, 0 }, { 3, 4, 9, 2 } };
		Матрица matrix2 = new Матрица(m2, 4, 4);
		System.out.println("Матица 1:");
		matrix1.printMatrix();
		System.out.println("\nМатрица 2:");
		matrix2.printMatrix();
		System.out.println("\nУмножение матрицы 1 на 4:");

		matrix1.multiplying(4);
		matrix1.printMatrix();
		System.out.println("\nСложение результата и матрицы 2:");

		matrix1.summing(m2);
		matrix1.printMatrix();

	}

}
