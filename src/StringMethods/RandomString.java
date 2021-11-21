package StringMethods;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(randomString());
    }

    public static String randomString() {
        String strAlpha = "abcdefghijklmnopqrstuvwxyz";
        String strNumeric = "123456789";
        String toReturn = "";

        int randomNumberForNumeric = (int) (Math.random() * 5);

        for (int i = 0; i < 5; i++) {

            if (i == randomNumberForNumeric) {
                int randomIndex = (int) (Math.random() * strNumeric.length());
                char randomChar = strNumeric.charAt(randomIndex);
                toReturn = toReturn + randomChar;
            } else {
                int randomIndex = (int) (Math.random() * strAlpha.length());
                char randomChar = strAlpha.charAt(randomIndex);

                toReturn = toReturn + randomChar;
            }
        }
    return toReturn;
    }


}
