package by.academy.homework3;

public enum DaysOfWeek {
	MONDAY("Monday",1), TUESDAY("Tuesday",2), WEDNESDAY("Wednesday",3), THURSDAY("Thursday",4), FRIDAY("Friday",5),
	SATURDAY("Saturday",6), SUNDAY("Sunday",0);

	private String value;
	private int number;

	private DaysOfWeek(String value, int number) {
		this.value = value;
		this.number = number;
	}

	public String getValue() {
		return value;
	}

	public int getNumber() {
		return number;
	}
}
