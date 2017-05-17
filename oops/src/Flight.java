/**
 * Created by Biks on 5/15/2017.
 */
public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;

    //initialization Blocks
    {
        isSeatAvailable = new boolean[seats];
        for(int i = 0; i < seats; i++)
            isSeatAvailable[i] = true;
    }

    public Flight(){}
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public Flight(char flightClass){
        this.flightClass = flightClass;
    }


    void  add1passenger(){
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    public boolean hasRoom(Flight f2){
        int total = this.passengers + f2.passengers;
        return total <= this.seats;
    }

    public Flight createNewWithBoth(Flight f2){
        Flight newFlight = new Flight();
        newFlight.seats = this.seats;
        newFlight.passengers = this.passengers + f2.passengers;
        return newFlight;
    }

    private void handleTooMany(){
        System.out.println("Too Many");
    }
}
