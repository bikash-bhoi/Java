public class Main {

    public static void main(String[] args) {
/*
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
        del1.passengers += 148;
        del2.add1passenger();
        Flight del3 = null;
        if (del1.hasRoom(del2))
            del3 = del1.createNewWithBoth(del2);


        System.out.println("passengers in del1 : " + del1.passengers);
        System.out.println("passengers in del2 : " + del2.passengers);
        if (del3 != null) {
            System.out.println("Flights successfully Combined");
            System.out.println("passengers in del3 : " + del3.passengers);
        }
        else
            System.out.println("Flights cannot be combined");

        //Object Reference

        Flight fl1 = new Flight();
        fl1.add1passenger();
        fl1.add1passenger();
        Flight fl2 = fl1;
        System.out.println("passengers in fl1 before : " + fl1.passengers);
        System.out.println("passengers in fl2 before : " + fl2.passengers);

        fl1.add1passenger();
        fl1.add1passenger();
        System.out.println("passengers in fl1 after : " + fl1.passengers);
        System.out.println("passengers in fl2 after : " + fl2.passengers);

        fl1.add1passenger();
        fl2.add1passenger();
        fl2.add1passenger();
        System.out.println("passengers in fl1 after adding to fl2: " + fl1.passengers);
        System.out.println("passengers in fl2 after adding to fl2: " + fl2.passengers);
*/
        Passenger dude = new Passenger(3);
        dude.setCheckedBags(2);
        System.out.println(dude.getCheckedBags());
        System.out.println(dude.getFreeBags());
        System.out.println(dude.getPerBagFee());

    }
}
