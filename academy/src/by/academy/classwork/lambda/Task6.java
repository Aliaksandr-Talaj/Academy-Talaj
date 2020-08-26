package by.academy.classwork.lambda;

import java.util.function.Consumer;

public class Task6 {
	public static void main(String[] args) {

		HeavyBox hb = new HeavyBox(45);
	
		Consumer <HeavyBox> load = (b) -> System.out.println("Отгрузили ящик с весом "+b.getWeight());
		Consumer <HeavyBox> send = (b) -> System.out.println("Отправляем ящик с весом "+b.getWeight());
		
		
		load.andThen(send).accept(hb);
	}
}
