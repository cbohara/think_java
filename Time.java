// public = can be used in other classes
public class Time {
	// instance variables are declared at the beginning of a class definition outside of any method
	// private variables can only be accessed from inside the Time class
	private int hour;
	private int minute;
	private double second;

	// constructor 
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}

	// value constructor
	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public double getSecond() {
		return this.second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	};

	public void setSecond(double second) {
		this.second = second;
	};

	public static void main(String args[]) {
		// instance with default instance variable values
		Time time1 = new Time();
		System.out.println(time1.hour);
		// instance with declared instance variable values
		Time time2 = new Time(11, 59, 59.9);
		System.out.println(time2.second);
	}
}

