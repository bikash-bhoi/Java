/**
 * Created by Biks on 5/15/2017.
 */
public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    private int maxCarryOns = seats * 2, totalCarryOns;

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    public void setTotalCheckedBags(int totalCheckedBags) {
        this.totalCheckedBags = totalCheckedBags;
    }

    private int totalCheckedBags;

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


    public void  add1Passenger(){
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    public void add1Passenger(int bags){
        if(hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }
    public void add1Passenger(Passenger p){
        add1Passenger(p.getCheckedBags());
    }
    public void add1Passenger(int bags, int carryOns){
        if(hasSeating() && hasCarryOnSpace(carryOns)){
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }
    public void add1Passenger(Passenger p, int carryOns){
        add1Passenger(p.getCheckedBags(), carryOns);
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
    private boolean hasSeating() {return passengers < seats; }
    private boolean hasCarryOnSpace(int carryOns){
        return totalCarryOns + carryOns <= maxCarryOns;
    }
}
