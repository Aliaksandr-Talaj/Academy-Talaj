package by.academy.classwork.reflectoinAPI;

public class Tiger extends Cat {

	public String surname;
	protected String favoriteRabbit;
	private String eye;

	public Tiger() {
		super();
	}

	public Tiger(String surname, String favoriteRabbit, String eye) {
		super();
		setEye(eye);
		this.favoriteRabbit = favoriteRabbit;
		this.surname = surname;
	}

	public String getEye() {
		return eye;
	}

	private void setEye(String eye) {
		this.eye = eye;
	}

	public String getFavoriteRabbit() {
		return favoriteRabbit;
	}

	protected void setFavoriteRabbit(String favoriteRabbit) {
		this.favoriteRabbit = favoriteRabbit;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
