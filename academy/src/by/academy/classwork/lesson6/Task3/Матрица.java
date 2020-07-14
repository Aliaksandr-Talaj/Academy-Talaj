package by.academy.classwork.lesson6.Task3;

public class Матрица {
	
	double [][] matrix;
	int rows;
	int columns;
	
	public Матрица() {
		super();
	}
	public Матрица(double [][] matrix, int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.matrix = matrix;
	}
	
	public double[][] summing(double [][] matrix){
		for (int i=0; i<this.rows;i++) {
			for (int j=0; j<this.columns; j++) {
				this.matrix[i][j]=this.matrix[i][j]+matrix[i][j];
			}
		}
		return this.matrix;
	}
	public double[][] multiplying(int multiplyer){
		for (int i=0; i<this.rows;i++) {
			for (int j=0; j<this.columns; j++) {
				this.matrix[i][j]=multiplyer*this.matrix[i][j];
			}
		}
		return this.matrix;
	}
	public void printMatrix(){
		for (int i=0; i<rows;i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(this.matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void setMatrix(double [][] matrix, int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.matrix = matrix;
	}
	public double[][] getMatrix(){
		return this.matrix;
	}
	
}
