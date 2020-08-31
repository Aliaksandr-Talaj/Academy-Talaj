package by.academy.classwork.reflectoinAPI;

public class Cat {

	public String name;
	protected String favoriteFood;
	private int age;

	public Cat(String name, String favoriteFood, int age) {
		super();
		this.name = name;
		this.favoriteFood = favoriteFood;
		setAge(age);
		
	}
	public Cat() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	protected void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
}
