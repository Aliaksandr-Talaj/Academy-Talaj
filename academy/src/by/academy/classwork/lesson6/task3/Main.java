package by.academy.classwork.lesson6.task3;

public class Main {

	public static void main(String[] args) {
		double [][] m1 = {{1,6,5,8}, {7,4,9,2},{6,3,2,3},{4,5,7,1}};
		������� matrix1 = new �������( m1, 4, 4);
		double [][] m2 = {{4,55,6,31}, {34,5,6,-7},{5,4,8,0},{3,4,9,2}};
		������� matrix2 = new �������( m2, 4, 4);
		System.out.println("������ 1:");
		matrix1.printMatrix();
		System.out.println("\n������� 2:");
		matrix2.printMatrix();
		System.out.println("\n��������� ������� 1 �� 4:");
		
		matrix1.multiplying(4);
		matrix1.printMatrix();
		System.out.println("\n�������� ���������� � ������� 2:");
		
		matrix1.summing(m2);
		matrix1.printMatrix();

	}

}
