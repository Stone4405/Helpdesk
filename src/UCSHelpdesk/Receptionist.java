package UCSHelpdesk;

public class Receptionist extends Staff{

    public Receptionist(String name, String password) {
        super(name, password);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPassword: " + getPassword();
    }
}
