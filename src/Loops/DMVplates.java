package Loops;

public class DMVplates {

    public static void main(String[] args) {

        System.out.println(generatePlate("VA")); // "ADS-2252"
        System.out.println(generatePlate("MD")); // "3BS6121"
        System.out.println(generatePlate("NY")); //  ""
        System.out.println(generatePlate("DC")); // "NS7821"
        System.out.println(generatePlate("CA")); // "7SDA798"


    }

    // implement the method
    public static String generatePlate(String str) {

        String plate = "";

        if (str.equals("VA")) {

            for (int i = 0; i < 3; i++) {
                char randomThree = (char) ((Math.random() * 25) + 65);
                {
                    plate += randomThree;
                }
            }
            return (plate + "-" + (int) ((Math.random() * 9000) + 1000));
        }
        if (str.equals("DC")) {

            for (int i = 0; i < 2; i++) {
                char randomTwo = (char) ((Math.random() * 25) + 65);
                {
                    plate += randomTwo;
                }
            }
            return (plate + (int) ((Math.random() * 9000) + 1000));
        }
        if (str.equals("MD")) {

            for (int i = 0; i < 2; i++) {
                char randomTwo = (char) ((Math.random() * 25) + 65);
                {
                    plate += randomTwo;
                }
            }
            return ((int) ((Math.random() * 9) + 1) + plate + (int) ((Math.random() * 9000) + 1000));
        }
        if (str.equals("CA")) {

            for (int i = 0; i < 3; i++) {
                char randomThree = (char) ((Math.random() * 25) + 65);
                {
                    plate += randomThree;
                }
            }
            return ((int) ((Math.random() * 9) + 1) + plate + (int) ((Math.random() * 900) + 100));
        }

        return plate;
    }
}