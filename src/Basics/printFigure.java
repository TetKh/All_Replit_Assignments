package Basics;

public class printFigure {

    public static void main(String[] args) {

        figureOne();
        figureTwo();
        figureThree();
        figureOne();
        figureFour();
        figureTwo();
        figureTwo();
        figureFour();
        figureFour();
    }

    public static void figureOne() {

        System.out.println("       *****\n" +
                "     *********\n" +
                "   *************\n" +
                "\n" +
                "       *****\n" +
                "     *********\n" +
                "   *************");

    }

    public static void figureTwo() {

        System.out.println("   * | | | | | *");
    }

    public static void figureThree() {

        System.out.println("   *************");

    }

    public static void figureFour() {

        System.out.println("       *****");

    }
}