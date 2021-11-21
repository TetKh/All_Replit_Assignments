package Tests;

public class TestSeymur {

    public static void main(String[] args) {

        //Tests

        System.out.println(max1020(11, 19)); // 19
        System.out.println(max1020(19, 11)); // 19
        System.out.println(max1020(11, 9)); // 11
        System.out.println(max1020(9, 21)); // 0
        System.out.println(max1020(21, 10)); // 10
        System.out.println(max1020(7, 20)); // 20
        System.out.println(max1020(10, 21)); // 10

    }

    public static int max1020(int a, int b) {

        if ((a <= 20 && a >= 10) && (b <= 20 && b >= 10)) {
            return Math.max(a, b);

        } else if ((a >= 20 || a <= 10) && (b <= 20 && b >= 10)) {
            return b;
        }
        if ((b >= 20 || b <= 10) && (a <= 20 && a >= 10)) {
            return a;
        } else
            return 0;
        }
    }




