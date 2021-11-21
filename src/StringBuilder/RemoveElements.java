package StringBuilder;

public class RemoveElements {

    public static void main(String[] args) {
        //TEST
        System.out.println(removeNonAlphaNumeric("He@l!l?/>o22"));
        System.out.println(removeNonAlphaNumeric("rt7&5%hne)(:}|"));
    }


    public static String removeNonAlphaNumeric(String str){
        //implement

        str = str.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb);

        return sb.toString();

        // second method is just to: return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
