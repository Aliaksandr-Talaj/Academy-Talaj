package by.academy.homework1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¬ведите первую строку");
	String str1 = sc.nextLine();
	System.out.println("введите вторую строку");
	String str2 = sc.nextLine();
	sc.close();
	int matchCount=0;
	int doublesCount=0;
	if (str1.length()==str2.length()) {
		for (int i=0; i<str1.length(); i++) {
			for (int j=0; j<str2.length(); j++) {
				if ((i!=j)&&(str1.charAt(i)==str1.charAt(j))){
					doublesCount++;
				}
				if (str1.charAt(i)==str2.charAt(j)) {
					matchCount++;
				}
			}
		}
		
		System.out.println(matchCount-doublesCount==str1.length());
		
	} else {
		System.out.println("false");
	}
	
	}
} 
