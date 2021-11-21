package Basics;

public class Print1000Times {

    public static void main(String[] args) {
        thousand();
    }

    public static void ten() {

        String s1 = "All work and no play makes Joe a dull boy.\n";
        String s3 = s1 + s1 + s1;
        String s10 = s3 + s3 + s3 + s1;
        System.out.print(s10);
        // System.out.println("All work and no play makes Joe a dull boy.");

    }

    public static void hundred() {
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
    }

    public static void thousand() {

        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
    }
    }

