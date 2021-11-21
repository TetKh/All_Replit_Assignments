package Basics;

public class PrintFigureOne {

    public static void main(String[] args) {

        figureOne();
        figureTwo();
        figureThree();
        figureTwo();
        figureOne();
    }

    public static void figureOne() {

        System.out.println("    /\\       /\\\n" +
                "   /  \\     /  \\\n" +
                "  /    \\   /    \\");

    }

    public static void figureTwo() {

        System.out.println(" +------+ +------+\n" +
                " |      | |      |\n" +
                " |      | |      |\n" +
                " +------+ +------+");

    }

    public static void figureThree() {

        System.out.println(" |United| |United|\n" +
                " |States| |States|");

    }
}
