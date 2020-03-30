package UCSHelpdesk;

public class Resolution extends Action {

    private String details;

    public Resolution(Receptionist receptionist, String details) {
        super(receptionist);
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return super.toString() + "/n Details: " + getDetails();
    }
}
