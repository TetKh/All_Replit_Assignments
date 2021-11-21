package Loops;

public class PrintLyrics {

    public static void main(String[] args) {

        printLyrics("beer", 3);

    }

    public static void printLyrics(String str, int num) {

        for (int i = num; i > 0; i--) {

            System.out.println(i + " bottle" + ((i == 1) ? "" : "s") + " of " + str + " on the wall.\n" +
                    i + " bottle" + ((i == 1) ? "" : "s") + " of " + str + " !\n" +
                    "Take one down. Pass it around.");
        }

            System.out.println("No more bottles of " + str + " on the wall.");
        }

    }


