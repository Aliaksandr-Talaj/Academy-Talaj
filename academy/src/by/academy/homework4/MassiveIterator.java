package by.academy.homework4;

import java.util.Iterator;

//	Написать итератор по двумерному массиву. 
//	(Отдельный класс. Наследуемся от Iterator<T>)
//	Протестировать в main.

public class MassiveIterator<T> implements Iterator<T> {

	public static void main(String[] args) {
		Integer[][] arr = new Integer[][] {
			{ 1, 2 }, 
			{ 3, 4, 5 }, 
			{ 6, 7, 8, 9 }, 
			{ 10, 11, 12 }, 
			{ 13, 14 } };

		Iterator<Integer> it = new MassiveIterator<>(arr);

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private T[][] array;
	private int index1;
	private int index2;

	public MassiveIterator(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return 	array != null &&
				array.length > index1 &&
				array[index1][index2] != null;
	}

	@Override
	public T next() {
		if (index2 < array[index1].length - 1) {
			return array[index1][index2++];
		} else {
			int i = index2;
			index2 = 0;
			return array[index1++][i];
		}

	}

}
