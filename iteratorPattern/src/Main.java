import javax.jnlp.PersistenceService;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        CrewMember pilot = new CrewMember("Pilot Virat");
        CrewMember coPilot = new CrewMember("CoPilot Rohit");

        Passenger neeta = new Passenger("Neeta");
        Passenger amitabh = new Passenger("Amitabh");
        Passenger abhishek = new Passenger("Abhishek");
        Passenger aishwarya = new Passenger("aishwarya");

        CrewMember[] crew = {pilot, coPilot};
        Passenger[] roster = {neeta, amitabh, abhishek, aishwarya};

        Flight del045 = new Flight(crew, roster);
        
        Iterator<Person> persons = del045.iterator();
        while(persons.hasNext()){
            Person p = persons.next();
            System.out.println(p.getName());
        }
    }
}
