package by.academy.homework3;

import java.util.Arrays;

public class Container<T> {
	private T[] array;

	@SuppressWarnings("unchecked")
	public Container() {
		super();
		setArray((T[]) new Object[16]);

	}

	@SuppressWarnings("unchecked")
	public Container(int size) {
		super();
		setArray((T[]) new Object[size]);

	}

	/*
	 * метод add(T obj) добавляет значение в первую свободную ячейку после
	 * последнего существующего значения, если массив заполнен - расширяет его и
	 * добавляет новое значение в первую свободную ячейку расширенного массива
	 */
	@SuppressWarnings("unchecked")
	public void add(T obj) {
		if (array == null) {
			array = (T[]) new Object[16];
			array[0] = obj;
			return;
		}

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				if (i == array.length - 1) {
					int filledLength = array.length;
					T[] temp = (T[]) new Object[array.length * 2 + 1];
					System.arraycopy(array, 0, temp, 0, array.length);
					array = temp;
					array[filledLength] = obj; // выполняется, если массив заполнен
					return;
				}
				array[i + 1] = obj; // выполняется, если в массиве есть хоть одно значение
				return;
			}
		}
		array[0] = obj; // выполняется, если все ячейки массива пусты
	}

	/*
	 * метод addToFirstFreeSlot(T obj) добавляет значение в первую свободную ячейку,
	 * если массив заполнен - расширяет его и добавляет новое значение в первую
	 * свободную ячейку расширенного массива
	 */
	@SuppressWarnings("unchecked")
	public void addToFirstFreeSlot(T obj) {
		if (array == null) {
			array = (T[]) new Object[16];
			array[0] = obj;
			return;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = obj; // выполняется, если в массиве есть свободные ячейки
				return;
			}
		}

		int filledLength = array.length;
		T[] temp = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
		array[filledLength] = obj; // выполняется, если массив заполнен

	}

	public T get(int index) {
		if (index < array.length && index >= 0) {
			return array[index];
		} else {
			System.out.println("Invalid index");
			return null;
		}
	}

	public T[] getArray() {
		return array;
	}

	public T getFirst() {
		if (array == null) {
			return null;
		}
		return array[0];
	}

	public Integer getIndexOfLast() {
		if (array == null) {
			System.out.println("Array does not exist");
			return null;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				return i;
			}
		}
		System.out.println("Array has empty values only");
		return null;
	}

	public T getLast() {
		if (array == null) {
			return null;
		}
		return array[array.length - 1];
	}

	public int getSize() {
		if (array == null) {
			return 0;
		}
		return array.length;
	}

	public void print() {
		System.out.println(Arrays.toString(array));
	}

	public void remove(int i) {
		if (array == null) {
			System.out.println("Array does not exist");
			return;
		}
		for (int j = i; j < array.length - 1; j++) {
			array[j] = array[j + 1];
		}
		array[array.length - 1] = null;

	}

	public void remove(T obj) { // удаляет первый совпадающий элемент
		if (array == null) {
			System.out.println("Array does not exist");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == obj) {
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				array[array.length - 1] = null;
				return;
			}
		}
	}

	public void removeAll(T obj) { // удаляет все совпадающие элементы
		if (array == null) {
			System.out.println("Array does not exist");
			return;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == obj) {
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				array[array.length - 1] = null;
			}
		}
	}

	public void removeLast(T obj) { // удаляет последний совпадающий элемент
		if (array == null) {
			System.out.println("Array does not exist");
			return;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == obj) {
				for (int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				array[array.length - 1] = null;
				return;
			}
		}
	}

	public void setArray(T[] array) {
		this.array = array;
	}

}
