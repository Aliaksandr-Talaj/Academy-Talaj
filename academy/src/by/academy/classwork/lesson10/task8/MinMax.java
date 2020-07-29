package by.academy.classwork.lesson10.task8;

public class MinMax<T extends Number> {

	private T[] array;

	public MinMax(T[] array) {
		this.array = array.clone();
	}

	public double min() {
		double minimal;
		if (array.length != 0) {
			minimal = array[0].doubleValue();

			for (T value : array) {
				if (minimal > value.doubleValue()) {
					minimal = value.doubleValue();
				}
			}
		} else {
			System.out.println("Массив пуст");
			return 0;
		}
		return minimal;
	}

	public double max() {
		double maximal;
		if (array.length != 0) {
			maximal = array[0].doubleValue();

			for (T value : array) {
				if (maximal < value.doubleValue()) {
					maximal = value.doubleValue();
				}
			}
		} else {
			System.out.println("Массив пуст");
			return 0;
		}
		return maximal;
	}

	public void bigger(MinMax<?> mm2) {
		if (max() > mm2.max()) {
			System.out.println("Максимум первого массива больше:\n" + max() + ">" + mm2.max());
		} else {
			if (max() < mm2.max()) {
				System.out.println("Максимум второго массива больше:\n" + max() + "<" + mm2.max());
			} else {
				System.out.println("Максимумы массивов равны:\n" + max() + "=" + mm2.max());
			}
		}
		if (min() > mm2.min()) {
			System.out.println("Минимум первого массива больше:\n" + min() + ">" + mm2.min());
		} else {
			if (min() < mm2.min()) {
				System.out.println("Минимум второго массива больше:\n" + min() + "<" + mm2.min());
			} else {
				System.out.println("Минимумы массивов равны:\n" + min() + "=" + mm2.min());
			}
		}
	}

}
