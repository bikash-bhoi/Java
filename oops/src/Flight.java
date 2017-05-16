/**
 * Created by Biks on 5/15/2017.
 */
public class Flight {
    int passengers;
    int seats;

    Flight(){
        seats = 150;
        passengers = 0;
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