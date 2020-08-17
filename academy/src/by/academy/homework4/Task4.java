package by.academy.homework4;

public class Task4 {

//	Создать свое исключение CustomException.
//	Попробовать добавить в массив int на 8 элементов 10 чисел. 
//	Обернуть в try/catch, словить ArrayIndexOutOfBoundsException
//	и вывести на экран сообщение:
//	"Array is too small, expand the array".
//	После чего выкинуть свое исключение CustomException.

	
	public static void main(String[] args) throws CustomException {

		int [] arr = new int [8];
		
		for (int i=0; i<10;i++) {
		try {
			arr[i]=i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array is too small, expand the array");
				throw new CustomException("I'm serious!");
			}
		}
	}
}
