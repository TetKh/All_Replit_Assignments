package WrapperClass_Autoboxing_Autounboxing;

public class WrapperDemo {

    public static void main(String[] args) {

        // No wrapper class has an empty constructor
//        Byte b = new Byte();
        // All warpper classes have 2 constructors: STRING, corresponding primitive type
        Byte b = new Byte("34");
        Byte b1 = new Byte((byte)23);

        System.out.println(Byte.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        Integer integer = new Integer(245);
        // typeValue() methods return primitives
        byte b2 = integer.byteValue();
        double d1 = integer.doubleValue();

        // valueOf() methods return Object
        Integer integer1 = Integer.valueOf(45); // 45
        Integer integer2 = Integer.valueOf("56"); // 56

        // parse() methods are used to

        String price = new StringBuilder("$59.99").deleteCharAt(0).toString();

        double price1 = Double.parseDouble(price);

        System.out.println("The tax is: " + price1 * 0.06);


        String priceOfCar = "55000.0";

//        int i = Integer.parseInt();

        int i1 = new Double(priceOfCar).intValue();
        System.out.println(i1);

        boolean bool =  Boolean.parseBoolean("true"); // true
        Boolean aFalse = Boolean.valueOf("false"); // false

        System.out.println(bool);

        String s = String.valueOf(true);
        String.valueOf(56);





    }
}

