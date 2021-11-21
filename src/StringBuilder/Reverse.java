package StringBuilder;

public class Reverse {

    public static void main(String[] args) {

        reverse("Hello");
        System.out.println(reverse2("Parviz"));


    }

    private static void reverse(String a) {

        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        System.out.println(sb);

        System.out.println(new StringBuilder(a).reverse());

    }
    public static String reverse2(String str){

        return new StringBuilder(str).reverse().toString();
    }
}

