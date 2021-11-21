package Overloading;

public class GetArea {

    public static void main(String[] args) {

        // test your methods here

        System.out.println(getArea(5.8));
        System.out.println(getArea(5, 6));
        System.out.println(getArea(5.8, 7));
    }

    // create your methods here
    public static double getArea(double radius) {

        return Math.PI * radius * radius;
    }

    public static double getArea(int width, int height) {

        return width * height;
    }

    public static double getArea(double radius, double height) {
        return 2 * Math.PI * radius * radius * height;

    }

}
