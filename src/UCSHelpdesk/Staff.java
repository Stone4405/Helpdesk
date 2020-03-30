package UCSHelpdesk;

import java.text.ParseException;

public abstract class Staff extends Person {

    String password;

    public Staff(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
