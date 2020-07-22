package by.academy.deal;

public final class Pricelist {

	public static Food 		kolbasa = 	new Food	("Колбаса", 70, "Не хреновая", 4);
	public static Food 		baton = 	new Food	("Батон", 10, "Не хреновый", 5);
	public static Food 		vodka = 	new Food	("Водка", 40, "Противопоказанно беременным детям", 3);
	public static Food 		tushenka = 	new Food	("Тушенка", 40, "\"Завтрак туриста\" грамм на 250, не 300", 5);
	public static Food 		energetik = new Food	("Энергетик", 50,
			"Добавь ещё деньжат и сможешь нанять настоящего инженера-энергетика", 2);
	public static Medicine 	bint = 		new Medicine("Бинт", 80, "\"Рамзес\", стерильный ", 7);
	public static Medicine 	aptechka = 	new Medicine("Аптечка", 250,
			"Коробочка с крестиком, спасающая от коробочки под крестиком", 8);
	public static Medicine 	antirad = 	new Medicine("Антирад", 300, "Кто водку пить не рад, тот купит антирад", 12);
	public static Weapon 	obrez = 	new Weapon	("Обрез", 400, "Вместо тысячи слов", 4);
	public static Weapon 	drob = 		new Weapon	("Патроны", 10, "Пятёрка - на уток...", 5);

	private static Product[] pricelist = { kolbasa, baton, vodka, tushenka, energetik, bint, aptechka, antirad, obrez,
			drob };

	public static Product[] getProduct() {
		return pricelist;
	}

}
