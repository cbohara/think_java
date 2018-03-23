public class Circle {
    public static void main(String[] args) {
       double radius = distance(1.0, 2.0, 4.0, 6.0);
       System.out.println(radius);
       double area = calculateArea(radius);
       System.out.println(area);
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        return Math.sqrt(dsquared);
    }
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}