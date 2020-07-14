package by.academy.classwork.lesson6.task1;

public class Main {
		public static void main(String[] args) {
			Phone phone1 = new Phone();
			Phone phone2 = new Phone();
			Phone phone3 = new Phone();
			
			phone1.setNumber("8292300");
			phone1.setModel("Nokia 3310");
			phone1.setWeight(133);
			phone2.setNumber("2020327");
			phone2.setModel("Siemens C35");
			phone2.setWeight(116);
			phone3.setNumber("3100500");
			phone3.setModel("Sony Ericsson K750i");;
			phone3.setWeight(99);
			phone1.setName("Mr. Rod");
			phone2.setName("Mr. Pups");
			phone3.setName("Mr. Max");
			
			System.out.println("\nНомер телефона:\t\t"+phone1.getNumber()
			+"\nМодель телефона:\t"+phone1.getModel()
			+"\nВес телефона, г:\t"+phone1.getWeight());
			
			System.out.println("\nНомер телефона:\t\t"+phone2.getNumber()
			+"\nМодель телефона:\t"+phone2.getModel()
			+"\nВес телефона, г:\t"+phone2.getWeight());
			
			System.out.println("\nНомер телефона:\t\t"+phone3.getNumber()
			+"\nМодель телефона:\t"+phone3.getModel()
			+"\nВес телефона, г:\t"+phone3.getWeight());
			
			phone1.receiveCall(phone2.getName());
			phone1.getNumber();
			phone2.receiveCall(phone3.getName());
			phone2.getNumber();
			phone3.receiveCall(phone1.getName());
			phone3.getNumber();
			
			phone1.receiveCall(phone3.getName(), phone3.getNumber());
			
			phone1.sendMessage("1234567","2345678","3456789");
		
			Person person1 = new Person();
			Person person2 = new Person("I. M. Notfool", 26);
			person1.talk();
			person2.move();
			
			double [][] m1 = {{1,6,5,8}, {7,4,9,2},{6,3,2,3},{4,5,7,1}};
			Матрица matrix1 = new Матрица( m1, 4, 4);
			double [][] m2 = {{4,55,6,31}, {34,5,6,-7},{5,4,8,0},{3,4,9,2}};
			Матрица matrix2 = new Матрица( m2, 4, 4);
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
