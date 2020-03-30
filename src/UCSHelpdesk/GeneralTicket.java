package UCSHelpdesk;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GeneralTicket {

    private static int nextAvailableTicketID = 1000;
    private int ticketID;
    private Date dateTime;
    private Status status;
    private Receptionist receptionist;
    private String details;
    private ArrayList<Action> actions;

    public GeneralTicket(Receptionist receptionist, String details) {
        this.dateTime = new Date();
        this.status = Status.OPEN;
        this.receptionist = receptionist;
        this.details = details;
        this.actions = new ArrayList<Action>();
        ticketID = nextAvailableTicketID;
        nextAvailableTicketID++;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
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

    public void addAction(Action action)
        {
            if(status.equals(Status.OPEN))
            {
                actions.add(action);
                if (action instanceof Resolution)
                {
                    status = Status.CLOSED;
                }
            }

    }

    public Boolean removeAction(Action action)
    {
        if (actions.contains(action)) {
            actions.remove(action);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Date: " + getDateTimeString() + "\nDetails: " + getDetails() + "\nStatus: " + getStatus() + "\nCreated By: " + getReceptionist().getCreds()
                + "\nActions: \n" + getActions();
    }
}
