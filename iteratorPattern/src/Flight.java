import java.util.Iterator;

/**
 * Created by Biks on 5/22/2017.
 */
public class Flight implements Iterable<Person> {

    private CrewMember[] crew;
    private Passenger[] roster;

    public Flight(CrewMember[] crew, Passenger[] roster){
        this.crew = crew;
        this.roster = roster;
    }

    public Iterator<Person> iterator(){
        return new FlightIterator(crew, roster);}

    private class FlightIterator implements Iterator<Person> {

        private CrewMember[] crew;
        private Passenger[] roster;
        private int index = 0;

        public FlightIterator(CrewMember[] crew, Passenger[] roster){
            this.crew = crew;
            this.roster = roster;
        }

        public boolean hasNext() {
            return index < crew.length + roster.length;
        }


        public Person next() {
            Person p = (index < crew.length) ?
                    crew[index] : roster[index - crew.length];
            index++;
            return p;
        }
    }


}

