package by.academy.classwork.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task1<T> {

	public Task1() {
		super();
	}

	public Collection <T> removeDoubles(Collection <T> obj) {
		Set <T> set = new HashSet<>(obj);
		
		 Collection <T> obj1= new ArrayList<T>(set);
		
			
		return obj1; 
	}

}
