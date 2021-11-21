package OOP.Abstraction.TollAdministrationApplication;
import java.util.Scanner;
public class Main2 {

        static int vehicleCounter = 0;
        public static void main(String[] args) {
            System.out.println("******************* DUOTECH TOLL ADMINISTRATION APPLICATION *******************");
            System.out.println("------------------------------------------------------------------------------");
            // Implement the TAA application logic here
            System.out.print("How many vehicles would you like to calculate toll for?: ");
            Scanner myInput = new Scanner(System.in);
            int countOfVehicles = myInput.nextInt();
            Vehicle[] createdVehicles = new Vehicle[countOfVehicles];
            do {
                System.out.println("Calculating the toll for Vehicle #" + (++vehicleCounter) + "...");
                System.out.println("Choose the vehicle type: ");
                System.out.println("1.Car");
                System.out.println("2.Truck");
                System.out.println("3.Police Cruiser");
                int chooseTheType = myInput.nextInt();
                int distanceTraveled = 0;
                boolean hasTrailer = false;
                boolean isHov = false;
                int noOfAxles = 0;
                switch (chooseTheType) {
                    case 1:
                        System.out.print("Distance traveled: ");
                        distanceTraveled = myInput.nextInt();
                        System.out.print("Does it have a trailer?: ");
                        hasTrailer = myInput.nextBoolean();
                        System.out.print("Is HOV3+ on?: ");
                        isHov = myInput.nextBoolean();
                        break;
                    case 2:
                        System.out.print("Distance traveled: ");
                        distanceTraveled = myInput.nextInt();
                        System.out.print("How many axles?: ");
                        noOfAxles = myInput.nextInt();
                        break;
                    case 3:
                        System.out.print("Distance traveled: ");
                        distanceTraveled = myInput.nextInt();
                        break;
                    default:
                        System.out.print("Invalid Type... ");
                }
                System.out.println("TOLL INFO:");
                System.out.println("Vehicle\t\t\tDistance\t\tToll Amount");
                System.out.println("-------------------------------------------");
                Object o = new Object();
                switch (chooseTheType) {
                    case 1:
                        o = new Car(distanceTraveled, hasTrailer, isHov);
                        System.out.println(o + "\n");
                        break;
                    case 2:
                        o = new Truck(distanceTraveled, noOfAxles);
                        System.out.println(o + "\n");
                        break;
                    case 3:
                        o = new PoliceCruiser(distanceTraveled);
                        System.out.println(o + "\n");
                        break;
                }
                createdVehicles[vehicleCounter - 1] = (Vehicle) o;
            } while (vehicleCounter < countOfVehicles);
            System.out.println("\nTOLL INFO ON ALL VEHICLES:\n");
            System.out.println("Vehicle\t\t\tDistance\t\tToll Amount");
            System.out.println("-------------------------------------------");
            for (Vehicle e : createdVehicles) {
                System.out.println(e);
            }
            System.out.println("\nTHANK YOU FOR USING DUOTECH TAA! GOODBYE!");
        }
    }
