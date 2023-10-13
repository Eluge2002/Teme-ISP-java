package isp.lab3.exercise2;

public class Rectangle {
    private static int length = 2;

    public static int getLength() {
        return Rectangle.length;
    }

    private static int width = 1;

    public static int getWidth() {
        return Rectangle.width;
    }

    private static final String color = String.valueOf("red");


    public static String getColor() {
        return color;
    }


    public static int getPerimeter(int width, int length) {
        int perimeter = width * 2 + length * 2;
        return perimeter;
    }

    public static int getArea(int width, int length) {
        int area = width * length;
        return area;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        System.out.println("First Rectangle");
        System.out.println("    length: " + getLength() + " meters");
        System.out.println("    width: " + getWidth() + " meters");
        System.out.println("    perimeter: " + getPerimeter(width, length) + " meters");
        System.out.println("    the area: " + getArea(width, length) + " square meters");
        System.out.println("    color: " + getColor());
    }
}