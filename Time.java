// public = can be used in other classes
public class Time {
	// can only be accessed from inside the Time class
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
}
