package Data;

public class Data {

	// Variables
	private int day, month, year;

	// Constructors
	public Data(int day, int month, int year) {
		this.year = Math.max(year, 1);

		if (isValidMonth(month)) {
			this.month = month;
			this.day = isValidDay(day, month) ? day : 1;
		} else {
			setDefaultDate();
		}
	}

	public Data() {
		day = month = year = 0;
	}

	// Getters
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// Setters
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// String representation
	@Override
	public String toString() {
		String formattedDay = String.format("%02d", day);
		String formattedMonth = String.format("%02d", month);
		return formattedDay + "." + formattedMonth + "." + year;
	}

	// Print date
	public void shtypDaten() {
		System.out.println(this);
	}

	// Helper methods
	private boolean isValidMonth(int month) {
		return (month >= 1 && month <= 12);
	}

	private boolean isValidDay(int day, int month) {
		if (isValid31DayMonth(month) && (day >= 1 && day <= 31)) {
			return true;
		} else if (isValid30DayMonth(month) && (day >= 1 && day <= 30)) {
			return true;
		} else if (month == 2) {
			return isValidFebruaryDay(day);
		}
		return false;
	}

	private boolean isValid31DayMonth(int month) {
		return (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12);
	}

	private boolean isValid30DayMonth(int month) {
		return (month == 4 || month == 6 || month == 9 || month == 11);
	}

	private boolean isValidFebruaryDay(int day) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return (day >= 1 && day <= 29);
		} else {
			return (day >= 1 && day <= 28);
		}
	}

	private void setDefaultDate() {
		month = 1;
		day = 1;
	}

}
