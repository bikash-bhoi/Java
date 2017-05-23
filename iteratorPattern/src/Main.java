import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Flight del045 = new Flight();
        //Add Crew
        del045.addCrew("Pilot Virat");
        del045.addCrew("CoPilot Rohit");

        //Add Passengers
        del045.addPassenger("Amitabh");
        del045.addPassenger("Abhishek");
        del045.addPassenger("aishwarya");

        System.out.println("Initial");
        del045.printPassengers();

        System.out.println("Adding Aamir");
        del045.addPassenger("Aamir");
        del045.printPassengers();

        System.out.println("Removing Last Passenger");
        del045.removeLastPassenger();
        del045.printPassengers();

        del045.removeLastPassenger();
        del045.removeLastPassenger();
        del045.removeLastPassenger();
        System.out.println("Removing All Passenger");
        del045.printPassengers();

        System.out.println("Trying to remove when there are no Passengers");
        del045.removeLastPassenger();
        del045.printPassengers();

    }

}
