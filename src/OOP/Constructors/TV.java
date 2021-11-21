package OOP.Constructors;

public class TV{

    int channel;
    int volume;
    boolean isOn = false;

    public TV(){

        channel = 1;
        volume = 1;
        isOn = false;
    }
    public TV(int channel, int volume){

        this.channel = channel;
        this.volume = volume;
    }


    public void turnOn(){

        isOn = true;

    }
    public void turnOff(){

        isOn = false;

    }
    public void setChannel(int newChannel){

        if (isOn && channel >= 1 && channel <= 120){
            channel = newChannel;
        }
    }
    public void setVolume(int newVolume){
        if (isOn && volume >= 1 && volume <= 50){
            volume = newVolume;
        }
    }
    public void channelUp(){

        if (isOn && channel < 120){
            channel ++;
        }
    }
    public void channelDown(){

        if (isOn && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){

        if (isOn && volume < 50){
            volume++;
        }
    }
    public void volumeDown(){

        if (isOn && volume > 1){
            volume--;
        }
    }
}

