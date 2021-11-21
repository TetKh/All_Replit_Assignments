package Basics;

public class Max1020 {

    public static void main(String[] args) {

        System.out.println(max1020(11, 19)); // 19
        System.out.println(max1020(19, 11)); // 19
        System.out.println(max1020(11, 9)); // 11
        System.out.println(max1020(9, 21)); // 0
        System.out.println(max1020(21, 10)); // 10
        System.out.println(max1020(7, 20)); // 20
        System.out.println(max1020(10, 21)); // 10



    }

    public static int max1020(int a, int b) {

        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return Math.max(a, b);
        }
        if ((a < 10 || a > 20) && (b >= 10 && b <= 20)) {
            return b;
        }
        if (a >= 10 && a <= 20) {
            return a;

        } else return 0;
    }
}
