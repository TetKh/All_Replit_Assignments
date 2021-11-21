package OOP.Abstraction.TollAdministrationApplication;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

        public static void main(String[] args) {
            System.out.println("******************** DUOTECH TOLL ADMINISTRATION APPLICATION ********************");
            System.out.println("------------------------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            int number;
            System.out.print("Number of Vehicles you want to calculate the toll for?: ");
            number = scanner.nextInt();
            String typeString;
            int distance;
            ArrayList<Vehicle> arrayList = new ArrayList<>();
            for (int i = 1; i <= number; i++) {
                System.out.println("\nCalculating the toll for Vehicle #" + i + "..." );
                Vehicle vehicle = null;
                System.out.print("Choose the vehicle type: \n1.Car \n2.Truck \n3.Police Cruiser\n");
                int num = scanner.nextInt();
                System.out.print("Distance Traveled: ");
                distance = scanner.nextInt();
                if (num == 1) {
                    boolean bool1, bool2;
                    System.out.print("Does it have a trailer?: ");
                    bool1 = scanner.nextBoolean();
                    System.out.print("Is HOV+3 on?: ");
                    bool2 = scanner.nextBoolean();
                    vehicle = new Car(distance, bool1, bool2);
                } else if (num == 2) {
                    int numOfAxles;
                    System.out.print("How many axles?: ");
                    numOfAxles = scanner.nextInt();
                    vehicle = new Truck(distance, numOfAxles);
                } else if (num == 3) {
                    vehicle = new PoliceCruiser(distance);
                }
                System.out.println(
                        "\nTOLL INFO: \nVehicle           Distance           Toll Amount \n------------------------------------------------ ");
                System.out.println(vehicle);
                arrayList.add(vehicle);
            }
            System.out.println(
                    "\n\nTOLL INFO FOR ALL VEHICLES:\n \nVehicle           Distance           Toll Amount \n------------------------------------------------");
            for (Vehicle vehicle : arrayList) {
                System.out.println(vehicle);
            }
            System.out.println("\nTHANK YOU FOR USING DUOTECH TAA! GOODBYE!");
        }
    }
