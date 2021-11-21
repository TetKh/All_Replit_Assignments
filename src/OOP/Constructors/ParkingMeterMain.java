package OOP.Constructors;

public class ParkingMeterMain {

    public static void main(String[] args) {

        //Test your class constructor, instance variable and methods

        ParkingMeter pm = new ParkingMeter(22);

        System.out.println(pm.add(25));

        pm.tick();
        System.out.println(pm.timeLeft);

        System.out.println(pm.isExpired());
    }
}