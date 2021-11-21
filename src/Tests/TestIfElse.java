package Tests;

public class TestIfElse {

    public static void main(String[] args) {
        testIfElse(-22);

    }

    public static int testIfElse(int num) {

        if(num > 0){
            System.out.println("This number is great!");
        } else if(num == 0){
            System.out.println("This is Zero!");
        } else {
            System.out.println("There is a negative number!");
        }
return num;
    }

}
