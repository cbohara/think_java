import java.awt.Point;

public class Distance {

	public static void main(String args[]) {
		// create two object with 2 variables x and y
		Point p1 = new Point(3, 4);
		Point p2 = new Point(4, 10);
		double distance = calc_distance(p1, p2);
		System.out.println(distance);
	}

	public static double calc_distance(Point p1, Point p2) {
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		return Math.sqrt(dx * dx * dy * dy);
	}
}
