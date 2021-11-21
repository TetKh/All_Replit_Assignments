package Array;

public class JoinMethod {

    public static void main(String[] args) {


        String[] strArray = {"How", "To", "Do", "In", "Java"};

        String joinedString = String.join(" ", strArray); // join takes array elements and makes it into a string

        System.out.println(joinedString);
    }
}
