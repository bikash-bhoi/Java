public class Main {

    public static void main(String[] args) {
        Flight flight1 = new Flight();
        //System.out.println(flight1.passengers);
        flight1.add1passenger();
        //System.out.println(flight1.passengers);
        flight1.passengers = flight1.passengers+149;
        //System.out.println(flight1.passengers);
        //flight1.add1passenger();

        //return Object
        Flight del1 = new Flight();
        Flight del2 = new Flight();
        del1.add1passenger();
        del1.passengers += 149;
        del2.add1passenger();
        Flight del3 = new Flight();
        if (del1.hasRoom(del2))
            del3 = del1.createNewWithBoth(del2);
        else
            System.out.println("New Flight cannot be created");

        System.out.println("passengers in del1 : " + del1.passengers);
        System.out.println("passengers in del2 : " + del2.passengers);
        System.out.println("passengers in del3 : " + del3.passengers);
    }
}
