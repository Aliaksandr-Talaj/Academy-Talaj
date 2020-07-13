package by.academy.lesson5;

public final class Pricelist {
			
	
	public static Food kolbasa 	=  new Food ("Колбаса", 			70,	 "Не хреновая");
	public static Product baton  	= new Product ("Батон", 			10,  "Не хреновый");
	public static Product vodka 	= new Product ("Водка", 			40,  "Противопоказанно беременным детям");
	public static Product tushenka 	= new Product ("Тушенка", 			40,  "\"Завтрак туриста\" грамм на 250, не 300");
	public static Product energetik = new Product ("Энергетик",			50,  "Добавь ещё деньжат и сможешь нанять настоящего инженера-энергетика");	
	public static Product bint 		= new Product ("Бинт", 				80,  "\"Рамзес\", стерильный ");
	public static Product aptechka 	= new Product ("Аптечка", 			250, "Коробочка с крестиком, спасающая от коробочки под крестиком");
	public static Product antirad 	= new Product ("Антирад", 			300,  "Кто водку пить не рад, тот купит антирад");
	public static Product obrez 	= new Product ("Обрез", 			400,  "Вместо тысячи слов");
	public static Product drob 		= new Product ("Патроны", 			10,  "Пятёрка - на уток...");
	
	
	public static Product[] pricelist = {	
			kolbasa, baton,	vodka, tushenka, energetik, bint, aptechka, antirad, obrez, drob
	};
	public Product [] getProduct() {
		return pricelist;
	}
	
	
}
