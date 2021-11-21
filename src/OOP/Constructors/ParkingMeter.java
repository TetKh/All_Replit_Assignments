package OOP.Constructors;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime){

        this.maxTime = maxTime;
    }

    public boolean add(int a){

        if ((a == 25) && (timeLeft <= maxTime)){
            timeLeft = timeLeft + 30;
        } else {
            timeLeft = 0;
        }
        return timeLeft > 0;
    }
    public void tick(){

        if (timeLeft > 0){
            timeLeft--;
        }
    }
    public boolean isExpired(){

        return timeLeft == 0;
    }

}