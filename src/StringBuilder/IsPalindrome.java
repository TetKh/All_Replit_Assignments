package StringBuilder;

public class IsPalindrome {

    public static void main(String[] args) {
        //TEST

        System.out.println(isPalindrome("Able was I ere I saw Elba"));
        System.out.println(isPalindrome("Madam, I'm Adam"));
        System.out.println(isPalindrome("Show me the code"));
        System.out.println(isPalindrome("Do geese see God?"));
    }

    public static boolean isPalindrome(String str){
        // implement

        StringBuilder sb = new StringBuilder(str);

        String pal = sb.reverse().toString();

        return pal.replaceAll("[^A-Za-z]", "").
                equalsIgnoreCase(str.replaceAll("[^A-Za-z]", ""));
    }
}
