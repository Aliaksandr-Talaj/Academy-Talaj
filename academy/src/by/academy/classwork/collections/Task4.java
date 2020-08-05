package by.academy.classwork.collections;

import java.util.HashMap;
import java.util.Map;

public class Task4 {

	public static void main(String[] args) {
		
		Map <String, Integer> catalog = new HashMap<>();
		
		addProductToMap(catalog,"Корюшка");
		addProductToMap(catalog,"Пюрешка");
		addProductToMap(catalog,"Корюшка");
		addProductToMap(catalog,"Макарошки");
		addProductToMap(catalog,"Корюшка");
		addProductToMap(catalog,"Котлетки");
		addProductToMap(catalog,"Макарошки");
		addProductToMap(catalog,"Пюрешка");
		addProductToMap(catalog,"Пюрешка");
		addProductToMap(catalog,"Корюшка");
		
		for(String product: catalog.keySet()) {
			
			System.out.println(product+ " "+ catalog.get(product));

		}
		
	}
	public static void addProductToMap(Map <String, Integer> catalog, String product) {
		catalog.compute(product, (k,v)->v!=null? v+1:1);
	}
	
	
}
