package UCSHelpdesk;

public class Update extends Action {

    private String note;

    public Update(Receptionist receptionist, String note) {
        super(receptionist);
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNote: " + getNote();
    }
}
