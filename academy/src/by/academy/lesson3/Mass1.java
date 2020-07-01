package by.academy.lesson3;

import java.util.Random;

public class Mass1 {
	public static void main(String [] args) {
		Random rand = new Random();
		int arr[] = new int[10];
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
			sum+=arr[i];	
		}
		float sa=(float)(sum)/arr.length;	
		for (int i:arr)
			if (i<sa) {
				System.out.print(i+" ");
			}
			
	}
}
