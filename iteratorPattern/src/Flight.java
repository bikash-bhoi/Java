import java.util.*;

/**
 * Created by Biks on 5/22/2017.
 */
public class Flight {

    private ArrayList<CrewMember> crew;
    private ArrayList<Passenger> roster;

    public Flight(){
        this.crew = new ArrayList<CrewMember>();
        this.roster = new ArrayList<Passenger>();
    }

    public Iterator<Person> iterator(){
        return new FlightIterator(crew, roster);}

    public void addCrew(String name){
        CrewMember newCrew = new CrewMember(name);
        if (!(crew.add(newCrew)))
            System.out.println("Error Adding Crew");
    }
    public void addPassenger(String name){
        Passenger newPassenger = new Passenger(name);
        if (!roster.add(newPassenger))
            System.out.println("Error Adding Passenger");
    }

    public void printPassengers() {
        Iterator<Person> persons = this.iterator();
        int count = 1;
        System.out.println("********************************");
        while (persons.hasNext()) {
            Person p = persons.next();
            System.out.println(count++ + ". " + p.getName());
        }
        System.out.println("********************************");
    }

    public void removeLastPassenger(){
        Iterator<Person> persons = this.iterator();
        persons.remove();
    }

    //Private class to Iterate
    private class FlightIterator implements Iterator<Person> {

        private ArrayList<CrewMember> crew;
        private ArrayList<Passenger> roster;
        private int index = 0;

        public FlightIterator(ArrayList<CrewMember> crew, ArrayList<Passenger> roster){
            this.crew = crew;
            this.roster = roster;
        }

        public boolean hasNext() {
            return index < crew.size() + roster.size();
        }


        public Person next() {
            Person p = (index < crew.size()) ?
                    crew.get(index++) : roster.get(index++ - crew.size());
            return p;
        }

        @Override
        public void remove() {
            if (roster.size() == 0)
                System.out.println("****No Passengers to remove****");
            else{

                roster.remove(roster.size() - 1);
            }
        }
    }
}
