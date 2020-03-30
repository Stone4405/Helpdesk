package UCSHelpdesk;

import java.util.ArrayList;

public class Helpdesk {

    private ArrayList<GeneralTicket> tickets;
    private ArrayList<Person> persons;
    private String helpdeskName;

    public Helpdesk(String helpdeskName) {
        this.tickets = new ArrayList<GeneralTicket>();
        this.persons = new ArrayList<Person>();
        this.helpdeskName = helpdeskName;
    }

    public void addTicket(GeneralTicket ticket)
    {
        tickets.add(ticket);
    }

    public void addPerson(Person person)
    {
        persons.add(person);
    }

    public Person searchPersons(int personID)
    {
        for (Person person : persons)
        {

            if (person.getPersonID() == personID)
            {
                return person;
            }
        }

        return null;
    }

    public Receptionist getReceptionist(int personID)
    {
        Person person = searchPersons(personID);

        if (person != null && person instanceof Receptionist)
        {
            return (Receptionist) person;
        }

        return null;
    }

    public GeneralTicket getGeneralTicket(int ticketID)
    {

        for (GeneralTicket ticket : tickets)
        {

            if (ticket.getTicketID() == ticketID)
            {
                return ticket;
            }
        }

        return null;
    }

    public Student getStudent(int personID)
    {
        Person person = searchPersons(personID);

        if (person.equals(null) && person instanceof Student)
        {
            return (Student) person;
        }
        return null;
    }

    public Administrator getAdministrator(int personID) {
        Person person = searchPersons(personID);

        if (!person.equals(null) && person instanceof Staff) {
            return (Administrator) person;
        }
        return null;

    }

    public ArrayList<GeneralTicket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<GeneralTicket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public String getHelpdeskName() {
        return helpdeskName;
    }

    public void setHelpdeskName(String helpdeskName) {
        this.helpdeskName = helpdeskName;
    }

    @Override
    public String toString() {
        return "Helpdesk:" + helpdeskName + "\nTickets:\n" + tickets + "\nPersons\n" + persons;
    }
}
