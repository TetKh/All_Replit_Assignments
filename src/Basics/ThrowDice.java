package Basics;

public class ThrowDice {

    public static void main(String[] args) {
        throwDice();
    }

    public static void throwDice() {

        int dice1 = ((int)(Math.random() * 6) ) + 1;
        int dice2 = ((int)(Math.random() * 6) ) + 1;
        int total = dice1 + dice2;
        System.out.println("Throwing a pair of dice...");
        System.out.println("Dice #1: " + dice1);
        System.out.println("Dice #2: " + dice2);
        System.out.println("Total: " + total);

    }
}
