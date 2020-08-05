package by.academy.homework3;

public class MyCustomDate {

	class Day {
		int dayOfMonth;
		DaysOfWeek dayOfWeek;

		public Day() {
			super();
		}

		public Day(int d) {
			super();
			setDayOfMonth(d);
		}

		public Day(int d, int m, int y) {
			super();
			setDayOfMonth(d);
			this.dayOfWeek = dayOfWeek(d, m, y);
		}

		public void setDayOfMonth(int d) {

			dayOfMonth = d;
		}

	}

	class Month {
		private int daysInMonth;
		private String name;
		private int number;

		public Month() {
			super();
		}

		public Month(int m) {
			super();
			number = m;
		}

		public Month(int m, int y) {
			super();
			number = m;
			daysInMonth = getDaysInMonth(m, y);
		}

		public String getName() {
			return name;
		}

		public int getNumber() {
			return number;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setNumber(int number) {
			this.number = number;
		}

	}

	class Year {
		private boolean isLeap;
		private int year;

		public Year() {
			super();
		}

		public Year(int y) {
			setYear(y);
		}

		public int getYear() {
			return year;
		}

		public boolean isLeap() {
			return isLeap;
		}

		public void setYear(int y) {
			year = y;
			isLeap = isLeapYear(y);
		}

	}

	static DaysOfWeek dayOfWeek(int day, int month, int year) {
		if (month < 3) {
			--year;
			month += 10;
		} else
			month -= 2;
		int r = ((day + 31 * month / 12 + year + year / 4 - year / 100 + year / 400) % 7);
		switch (r) {
		case 1:
			return DaysOfWeek.MONDAY;
		case 2:
			return DaysOfWeek.TUESDAY;
		case 3:
			return DaysOfWeek.WEDNESDAY;
		case 4:
			return DaysOfWeek.THURSDAY;
		case 5:
			return DaysOfWeek.FRIDAY;
		case 6:
			return DaysOfWeek.SATURDAY;
		case 0:
			return DaysOfWeek.SUNDAY;
		default:
			return DaysOfWeek.SUNDAY;
		}
	}

	@SuppressWarnings("static-access")
	public static int daysBetween(MyCustomDate date1, MyCustomDate date2) {

		int dy1 = 0;
		int dm1 = 0;

		for (int i = 1900; i < date1.year.getYear(); i++) {
			if (isLeapYear(i)) {
				dy1 += 366;
			} else {
				dy1 += 365;
			}
		}
		for (int i = 1; i < date1.getMonth(); i++) {
			dm1 += date1.getDaysInMonth(i, date1.getYear());
		}

		int dy2 = 0;
		int dm2 = 0;

		for (int i = 1900; i < date2.year.getYear(); i++) {
			if (isLeapYear(i)) {
				dy2 += 366;
			} else {
				dy2 += 365;
			}
		}
		for (int i = 1; i < date2.getMonth(); i++) {
			dm2 += date1.getDaysInMonth(i, date1.getYear());
		}

		return Math.abs(dy2 + dm2 + date2.getDay() - dy1 - dm1 - date1.getDay());
	}

	public static int getDaysInMonth(int m, int y) {

		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (isLeapYear(y)) {
				return 29;
			} else {
				return 28;
			}
		default:
			return -1;
		}
	}

	public static boolean isLeapYear(int y) {

		return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
	}

	private Day day;

	boolean incorrect = false;

	private Month month;

	private Year year;

	public MyCustomDate() {
		super();
	}

	public MyCustomDate(int d, int m, int y) {
		setYear(new Year(y));
		setMonth(new Month(m, y));
		if (d <= month.daysInMonth) {
			setDay(new Day(d));
			incorrect = false;
		} else {
			System.out.println("This month is too short for this day of the month!");
			incorrect = true;
		}
	}

	public MyCustomDate(String date) {
		final String[] ints;
		if (date.contains("/")) {
			ints = date.split("/");
		} else {
			ints = date.split("-");
		}

		int d = Integer.parseInt(ints[0]);
		int m = Integer.parseInt(ints[1]);
		int y = Integer.parseInt(ints[2]);

		setYear(new Year(y));
		setMonth(new Month(m, y));
		if (d <= month.daysInMonth) {
			setDay(new Day(d, m, y));
			incorrect = false;
		} else {
			System.out.println("This month is too short for this day of the month!");
			incorrect = true;
		}

	}

	public Integer getDay() {
		return this.day.dayOfMonth;
	}

	public Integer getMonth() {
		return this.month.number;
	}

	public Integer getYear() {
		return this.year.year;
	}

	public boolean isIncorrect() {
		return incorrect;
	}

	public boolean isLeapYear(Year y) {

		return (y.year % 4 == 0 && y.year % 100 != 0) || (y.year % 400 == 0);
	}

	public void printDayOfWeek() {

		System.out.println("This day is " + day.dayOfWeek.getValue());
	}

	public void setDate(String dateInput) {
	}

	private void setDay(Day day) {
		this.day = day;
	}

	public void setDay(Integer d) {
		this.day = new Day(d);
	}

	public void setMonth(Integer m) {
		this.month = new Month(m);
	}

	private void setMonth(Month month) {
		this.month = month;
	}

	public void setYear(Integer y) {
		this.year = new Year(y);
	}

	private void setYear(Year year) {
		this.year = year;
	}

}
