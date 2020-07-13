package by.academy.lesson5;

public final class Pricelist {
			
	
	public static Food 		kolbasa =  new Food 	("Колбаса", 	70,	"Не хреновая");
	public static Food 		baton  	= new Food 		("Батон", 		10,	"Не хреновый");
	public static Food		vodka 	= new Food 		("Водка", 		40, "Противопоказанно беременным детям");
	public static Food		tushenka = new Food 	("Тушенка", 	40, "\"Завтрак туриста\" грамм на 250, не 300");
	public static Food 		energetik= new Food		("Энергетик",	50, "Добавь ещё деньжат и сможешь нанять настоящего инженера-энергетика");	
	public static Medicine 	bint 	= new Medicine	("Бинт", 		80, "\"Рамзес\", стерильный ");
	public static Medicine 	aptechka = new Medicine	("Аптечка", 	250,"Коробочка с крестиком, спасающая от коробочки под крестиком");
	public static Medicine 	antirad = new Medicine	("Антирад", 	300,"Кто водку пить не рад, тот купит антирад");
	public static Weapon 	obrez 	= new Weapon 	("Обрез", 		400,"Вместо тысячи слов");
	public static Weapon 	drob 	= new Weapon 	("Патроны", 	10, "Пятёрка - на уток...");
	
	
	public static Product[] pricelist = {	
			kolbasa, baton,	vodka, tushenka, energetik, bint, aptechka, antirad, obrez, drob
	};
	public Product [] getProduct() {
		return pricelist;
	}
	
	
}
