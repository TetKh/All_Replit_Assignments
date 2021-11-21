package Basics;

public class GetSphereVolume {

    public static void main(String[] args) {

        System.out.println(getSphereVolume(3.2));
        System.out.println(getSphereVolume(12.9));
        System.out.println(getSphereVolume(1.02));
    }

    public static double getSphereVolume(double radius){

        double vol = (4 / 3) * Math.PI * (Math.pow(radius, 3));
        return vol;
    }
}