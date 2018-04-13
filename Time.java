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
	}

	public void setSecond(double second) {
		this.second = second;
	}

	// static method belongs to the class
	public static void printTime(Time t) {
		// use %d with int and %f with float
		// 02 total width 2 with leading zeros if necessary
		// 04.1 total width 4, 1 digit after the decimal point, leading zeros if necessary
		System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
	}

	// every object type has a method toString = returns string rep of object (name followed by hexidecimal memory address)
	// override behavior with own string method
	// instance method applied to an instance of the class
	// can use this to find the instance variable values 
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
	}

	public boolean equals(Time that) {
		return this.hour == that.hour
			&& this.minute == that.minute
			&& this.second == that.second;
	}

	public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;
		if (sum.second >= 60.0 {
			sum.second -= 60.0;
			sum.minute += 1;
		}
		if (sum.minute >= 60) {
			sum.minute -= 60;
			sum.hour += 1;
		}
		return sum;
	}

	public Time add(Time t2) {
		Time sum = new Time();
		sum.hour = this.hour + t2.hour;
		sum.minute = this.minute + t2.minute;
		sum.second = this.second + t2.second;

		if (sum.second >= 60.0 {
			sum.second -= 60.0;
			sum.minute += 1;
		}
		if (sum.minute >= 60) {
			sum.minute -= 60;
			sum.hour += 1;
		}
		return sum;
	}

	// modifies existing time object rather than creating Time sum = new Time();
	public void increment(double seconds) {
		this.second += seconds;
		while (this.second >= 60.0) {
			this.second -= 60.0;
			this.minute += 1;
		}
		while (this.minute >= 60) {
			this.minute -= 60;
			this.hour += 1;
		}
	}

	public static void main(String args[]) {
		// instance with default instance variable values
		Time time1 = new Time();
		// instance with declared instance variable values
		Time time2 = new Time(0, 0, 0.0);

		// getter
		System.out.println(time1.getHour());
		// setter
		time1.setHour(10);
		System.out.println(time1.equals(time2));
		time2.setHour(10);
		System.out.println(time1.equals(time2));

		// static method
		printTime(time1);
		printTime(time2);

		// instance method
		System.out.println(time1);
		System.out.println(time2);

		// add 2 time objects using static method
		Time startTime = new Time(18, 50, 0.0);
		Time runningTime = new Time(2, 16, 0.0);
		Time endTime = Time.add(startTime, runningTime);
		System.out.println(endTime);

		// use instance method to add a time to an instance
		Time totalTime = startTime.add(runningTime);
		System.out.println(totalTime);
	}
}
