package UCSHelpdesk;

public abstract class Person {

    private static int nextAvailablePersonID = 1000;
    private int personID;
    private String name;

    public Person(String name) {
        this.personID = nextAvailablePersonID;
        this.name = name;
        nextAvailablePersonID++;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreds()
    {
        return getName() + " (" + getPersonID() + ")";
    }


    @Override
    public String toString() {
        return "Person ID: " + getPersonID() + "\nName: " + getName();
    }
}
