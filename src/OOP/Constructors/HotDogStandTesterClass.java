package OOP.Constructors;

public class HotDogStandTesterClass {

    public static void main(String[] args) {
        HotDogStand one = new HotDogStand();
        one.setId(1);
        one.setsoldByOne(20);
        one.justSold();
        one.justSold(); //22
        //one.soldByOneStand();
        //one.soldByAllStands();  // static method
        one.toString();

        HotDogStand two = new HotDogStand(2, 101);
        two.soldByOneStand();
        two.justSold();
        two.justSold();
        two.justSold();

        two.toString();
//
//
//        HotDogStand three = new HotDogStand();
//        three.setId(3);
//        three.setsoldByOne(30);
    }
}