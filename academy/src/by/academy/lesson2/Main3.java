package by.academy.lesson2;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int myInt=sc.nextInt();
		sc.close();
		if (myInt%2==0) {
			System.out.println("Число "+ myInt +" является четным");
		} else { System.out.println("Число "+ myInt +" является нечетным");
	}
}
}