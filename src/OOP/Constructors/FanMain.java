package OOP.Constructors;

public class FanMain {

        public static void main(String[] args) {
            Fan[] fans = {new Fan(Fan.FAST, 10, "Yellow", true),
                    new Fan(Fan.MEDIUM, 5, "BLUE", false),
                    new Fan()
            };
            for(Fan f: fans){
                System.out.println(f.toString());
            }
            System.out.println(Fan.getNoOfFansCreated());
        }
    }
