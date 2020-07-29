package by.academy.classwork.lesson10.task7;

import java.util.Arrays;

public class Матрица<T extends Number> {

	private T[][] matrix;
	Double[][] result;
	private int rows;
	private int columns;

	public Матрица() {
		super();
	}

	public Матрица(T[][] matrix, int rows, int columns) {
		Double[][] result = new Double[rows][columns];
		this.rows = rows;
		this.columns = columns;
		this.matrix = Arrays.copyOf(matrix, matrix.length);
		this.result = result;  
	}

	public T[][] getMatrix() {
		return this.matrix;
	}

	public Double[][] multiplying(int multiplyer) {
		
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				result[i][j] = multiplyer * this.matrix[i][j].doubleValue();
			}
		}
		return result;
	}

	public void printMatrix() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(this.matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void printResult() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(this.result[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void setMatrix(T[][] matrix, int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = Arrays.copyOf(matrix, matrix.length);
	}

	 public Double [][] summing(Матрица <?> matr) {
		
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				result[i][j] = this.matrix[i][j].doubleValue() + matr.matrix[i][j].doubleValue();
			}
		}
		return result;
	}

}
