package UCSHelpdesk;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public abstract class Action {

    private Date dateTime;
    private Receptionist receptionist;

    public Action(Receptionist receptionist) {
        this.dateTime = new Date();
        this.receptionist = receptionist;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getDateTimeString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    @Override
    public String toString() {
        return "Actioned By: " + receptionist.toString() + "\nDate: " + getDateTimeString();
    }
}

