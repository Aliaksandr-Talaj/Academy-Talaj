package by.academy.homework4;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

//	Можно писать все в main. Не нужно создавать новых классов.
//	Имеется текст. Следует составить для него частотный словарь:
//	Создать Map<Character, Integer> для символов,
//	в который мы заносим символ и его количество.

	public static void main(String[] args) {

		String string = "съешь же ещё этих мягких французских булок да выпей чаю";

		Map<Character, Integer> chars = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			addToChars(chars, string.charAt(i));
		}

		for (Character ch : chars.keySet()) {
			System.out.println(ch + " " + chars.get(ch));
		}
	}

	public static void addToChars(Map<Character, Integer> chars, Character ch) {
		if (chars == null) {
			return;
		}
		if (chars.containsKey(ch)) {
			chars.put(ch, chars.get(ch) + 1);
		} else {
			chars.put(ch, 1);
		}
	}
}
