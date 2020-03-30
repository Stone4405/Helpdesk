package UCSHelpdesk;

public class TechnicalTicket extends GeneralTicket  {

    private Person raisedBy;
    private String equipmentAffected;

    public TechnicalTicket(Receptionist receptionist, String details, Person raisedBy, String equipmentAffected) {
        super(receptionist, details);
        this.raisedBy = raisedBy;
        this.equipmentAffected = equipmentAffected;
    }

    public Person getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(Person raisedBy) {
        this.raisedBy = raisedBy;
    }

    public String getEquipmentAffected() {
        return equipmentAffected;
    }

    public void setEquipmentAffected(String equipmentAffected) {
        this.equipmentAffected = equipmentAffected;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaised By: " + raisedBy.getCreds() + "\nEquipment: " + getEquipmentAffected();
    }
}
