package OOP.Constructors;

class Fan{
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    static int noOfFans = 0;
    int speed = SLOW;
    boolean isOn = false;
    double radius = 5.0;
    String color = "blue";
    static String manufacturer="WhirlWind";
    String productId="xxx";

    public Fan(){
        noOfFans++;
        this.productId = generateProductId();
    }

    public Fan(int speed,double radius,String color,boolean isOn){
        this.speed=speed;
        this.radius=radius;
        this.color=color;
        this.isOn=isOn;
        noOfFans++;
        this.productId = generateProductId();

    }

    public String toString(){
        if(isOn){
            return speed + ", " + color + ", " + radius;
        }else{
            return color + ", " + radius + ", " + "fan is off";
        }


    }

    public static int getNoOfFansCreated(){
        return noOfFans;
    }

    public static String generateProductId(){
        String s = "abcdefghijklmnopqrstuvwxyz0123456789";
        String id = "";
        for(int i=0;i<10;i++){
            id += s.charAt((int)(Math.random()*s.length()));
        }

        return id;


    }


}









