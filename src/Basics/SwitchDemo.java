package Basics;

public class SwitchDemo {

        public static void main(String[] args) {




//        switch (browser){
//
//            case "Chrome" :
//                System.out.println("Launching Chrome Driver");
//                break;
//            case "Firefox" :
//                System.out.println("Launching Firefox Driver");
//                break;
//            case "Opera" :
//                System.out.println("Launching Opera Driver");
//                break;
//            case "Safari" :
//                System.out.println("Launching Safari Driver");
//                System.out.println("Launching Safari Driver");
//                System.out.println("Launching Safari Driver");
//                System.out.println("Launching Safari Driver");
//
//                break;
//            default:
//                System.out.println("Wrong browser");
//                break;
//        }

            // Switch rules:


            // If you omit the break statements in cases, the execution will keep goinf until the next break statement
            String browser = "Penguin";

            switch (browser){




                case "Chrome" :
                    System.out.println("Launching Chrome Driver");
                case "Firefox" :
                    System.out.println("Launching Firefox Driver");
                    break;

                case "Opera" :
                    System.out.println("Launching Opera Driver");
                case "Safari" :

                    System.out.println("Launching Safari Driver");
                    break;

                default:
                    System.out.println("Wrong browser");
                    break;

            }

            int i = 4;

            final int j = 6;

            switch (i){




                case j :
                    System.out.println("Launching Chrome Driver");
                case 4 :
                    System.out.println("Launching Firefox Driver");
                    break;
                default:
                    System.out.println("Wrong browser");
                    break;

            }



        }

}
