package by.academy.homework2.strings;

/* �������� ���������, ������� ������� �����
 * �� 1 �� 25 � ���� ������� 5x5
 * ����� ������� � ������ ����.*/

public class Task12 {

	public static void main(String[] args) {
		int x=1;
		for (int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf(" %2d", x++);
			}
			System.out.println();
		}
	}

}
