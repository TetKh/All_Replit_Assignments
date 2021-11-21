package Basics;

public class GetRandomPassword {

    public static void main(String[] args) {
        System.out.println(getRandomPassword());

    }

    public static String getRandomPassword() {

        // int random = ((char)(Math.random() * 25) + 97);
        // char letter1 = ((char)((Math.random()*26) + 97)); -> the other way

        int random1 = ((char)(Math.random() * 26) + 97);
        int random2 = ((char)(Math.random() * 26) + 97);
        int random3 = ((char)(Math.random() * 26) + 97);
        int random4 = ((char)(Math.random() * 26) + 97);
        int random5 = ((char)(Math.random() * 26) + 97);


        return "" + (char)random1+(char)random2+(char)random3+(char)random4+(char)random5;

    }
}
