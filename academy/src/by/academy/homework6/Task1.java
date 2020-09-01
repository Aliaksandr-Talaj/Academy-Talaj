package by.academy.homework6;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		Map<Long, String> longMap = Stream.generate(() -> new Random().nextInt(100))
				.distinct()
				.limit(100)
				.map(i -> (long) (i * Math.PI - 20))
				.filter(l -> l < 100)
				.sorted()
				.skip(3)
				.collect(Collectors.toMap(l -> l, l -> "Number: " + l));

		longMap.keySet().stream().forEach(l -> System.out.println(l + " " + longMap.get(l)));

	}

}
