import java.awt.Rectangle;
import java.awt.Point;

public class RectangleDemo {

	public static void main(String args[]) {
		Rectangle box = new Rectangle(0, 0, 100, 200);
		Point center = findCenter(box);
		System.out.println(center);
		System.out.println(box);
		box = changePoint(box);
		System.out.println(box);
		// apply methods to objects themselves using dot notation
		box.translate(300, 20);
		System.out.println(box);
	}

	public static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Point(x, y);
	}

	public static Rectangle changePoint(Rectangle box) {
		box.x = box.x + 50;
		box.y = box.y + 100;
		return box;
	}

}
