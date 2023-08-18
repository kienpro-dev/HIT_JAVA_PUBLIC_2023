package BaiTapTrenLop;

class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x2, double y2) {
        x = x2;
        y = y2;
    }

    public void setX(double x2) {
        x = x2;
    }

    public void setY(double y2) {
        y = y2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x2, double y2) {
        x = x2;
        y = y2;
    }

    public double distance(double x2, double y2) {
        return Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
    }

    public double distance(Point another) {
        return Math.sqrt((x - another.getX()) * (x - another.getX()) + (y - another.getY()) * (y - another.getY()));
    }
}


public class Bai3 {
    public static void main(String[] args) {
        Point p1 = new Point(1.5, 6.7);
		Point p2 = new Point(2.8, 3.2);
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(2.34, 7.8));
    }
}
