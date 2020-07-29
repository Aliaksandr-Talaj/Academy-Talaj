package by.academy.classwork.lesson6.task3;

import java.util.Arrays;

public class Матрица {

	private double[][] matrix;
	private int rows;
	private int columns;

	public Матрица() {
		super();
	}

	public Матрица(double[][] matrix, int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = Arrays.copyOf(matrix, matrix.length);
	}

	public double[][] getMatrix() {
		return this.matrix;
	}

	public double[][] multiplying(int multiplyer) {
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				this.matrix[i][j] = multiplyer * this.matrix[i][j];
			}
		}
		return this.matrix;
	}

	public void printMatrix() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(this.matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void setMatrix(double[][] matrix, int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = Arrays.copyOf(matrix, matrix.length);
	}

	public double[][] summing(Матрица matr) {
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				this.matrix[i][j] = this.matrix[i][j] + matr.matrix[i][j];
			}
		}
		return this.matrix;
	}

}
