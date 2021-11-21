package Tests;

public class Tester {

    public static void main(String[] args) {

        String s = "!@#$%^&*()abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPGTSTIVWXYZ";
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += s.charAt((int) (Math.random() * s.length()));
        }
        System.out.println(password);
    }}