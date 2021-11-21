package Basics;

public class GetArea {

    public static void main(String[] args) {

        System.out.println(getArea(0.5));
        System.out.println(getArea(50.3));
        System.out.println(getArea(5));
    }

    public static double getArea(double radius) {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
