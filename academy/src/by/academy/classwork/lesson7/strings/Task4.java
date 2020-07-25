package by.academy.classwork.lesson7.strings;

public class Task4 {
	public static void main(String[] args) {

		StringBuilder sbl = new StringBuilder();
		StringBuffer sbf = new StringBuffer();
		String str = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000_000; i++) {
			sbl = sbl.append("a");
		}
		System.out.println("Время выполнения StringBuilder, мс: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		for (int i = 0; i < 100_000_000; i++) {
			sbf = sbf.append("a");
		}
		System.out.println("Время выполнения StringBuffer, мс: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			str = str.concat("a");
		}
		System.out.println("Время выполнения String, мс: " + (System.currentTimeMillis() - start));
	}
}
