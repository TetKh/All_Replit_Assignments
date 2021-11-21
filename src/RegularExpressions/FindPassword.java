package RegularExpressions;

import java.util.Arrays;

public class FindPassword {

    public static void main(String[] args) {

        // SSN
        String ssn = "345-89-8711";

        ssn.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}");

        System.out.println(ssn.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}")); // true
        System.out.println("345-89-8711".matches("[\\d]{3}-[\\d]{2}-[\\d]{4}")); // true

        // Number ending with even digits
        System.out.println("266663454".matches("[\\d]*[02468]")); // true

        // Phone number
        boolean matches = "(912) 921-2728".matches("\\([1-9][\\d]{2}\\) [\\d]{3}-[\\d]{4}"); // true


        "921-2728".matches("\\([1-9][\\d]{2}\\) [\\d]{3}-[\\d]{4}"); // false

        // Name consists of at most 6 letters and the first letter is in uppercase

        System.out.println("Azizovs".matches("[A-Z][a-zA-Z]{6,8}")); // true
        "Jones123".matches("[A-Z][a-zA-Z]{1,24}"); // false

        // Identifiers
        System.out.println("w_edr$W".matches("[a-zA-Z_$][\\w$]*")); // true
        System.out.println("49w_edr$W".matches("[1-9a-zA-Z_$]*")); // true


        String st = "Hello Java";

        String [] str = st.split("");

        System.out.println(Arrays.toString(str));

        String [] str2 = st.split("a", 3);

        System.out.println(Arrays.toString(str2));


        // Replace String

        System.out.println("Java Java Java".replaceAll("v\\w", "wi"));

        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));

        System.out.println("Jaaavaa".replaceFirst("a+", "R")); // JRvaa

        System.out.println("Jaaavaa".replaceFirst("a+?", "R")); // JRaavaa


        // Split

        String[] tokens = "Java1HTML2Perl".split("\\d");
        System.out.println(Arrays.toString(tokens));


    }
}
