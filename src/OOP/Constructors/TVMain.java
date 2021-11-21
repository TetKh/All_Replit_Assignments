package OOP.Constructors;

public class TVMain {
    public static void main(String[] args) {

        //Test your class here
        TV tv = new TV();

        tv.turnOn();
        tv.setChannel(22);
        System.out.println(tv.channel);

        tv.turnOff();
        tv.setVolume(60);
        System.out.println(tv.volume);

        tv.turnOn();
        tv.channelUp();
        System.out.println(tv.channel);

        tv.channelDown();
        System.out.println(tv.channel);

        tv.volumeUp();
        System.out.println(tv.volume);

        tv.turnOff();
        tv.volumeDown();
        System.out.println(tv.volume);

        System.out.println("__________________________");


        TV tv2 = new TV(10, 15);

        tv2.turnOn();
        tv2.setChannel(22);
        System.out.println(tv2.channel);

        tv2.turnOff();
        tv2.setVolume(60);
        System.out.println(tv2.volume);

        tv2.turnOn();
        tv2.channelUp();
        System.out.println(tv2.channel);

        tv2.channelDown();
        System.out.println(tv2.channel);

        tv2.volumeUp();
        System.out.println(tv2.volume);

        tv2.turnOff();
        tv2.volumeDown();
        System.out.println(tv2.volume);
    }
}
