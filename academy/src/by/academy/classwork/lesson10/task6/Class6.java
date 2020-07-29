package by.academy.classwork.lesson10.task6;

import java.io.Serializable;
import by.academy.classwork.lesson6.task8.Animal;

public class Class6<T extends Comparable<?>, V extends Animal & Serializable, K extends Number> {

	private T firstVar;
	private V secondVar;
	private K thirdVar;

	public Class6() {
		super();
	}

	public Class6(T fV, V sV, K tV) {
		setFirstVar(fV);
		setSecondVar(sV);
		setThirdVar(tV);
	}

	public T getFirstVar() {
		return firstVar;
	}

	public void setFirstVar(T firstVar) {
		this.firstVar = firstVar;
	}

	public V getSecondVar() {
		return secondVar;
	}

	public void setSecondVar(V secondVar) {
		this.secondVar = secondVar;
	}

	public K getThirdVar() {
		return thirdVar;
	}

	public void setThirdVar(K thirdVar) {
		this.thirdVar = thirdVar;
	}
	public void printType() {
		System.out.println(firstVar.getClass());
		System.out.println(secondVar.getClass());
		System.out.println(thirdVar.getClass());
		
	}
}
