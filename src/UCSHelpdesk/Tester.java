package UCSHelpdesk;

import java.io.IOException;

public class Tester {

    public static void main(String[] args) throws IOException {

        Helpdesk UCSHelpdesk = new Helpdesk("UCS");

        UCSHelpdesk.addPerson(new Administrator("Simon", "Simon123"));
        UCSHelpdesk.addPerson(new Receptionist("Sam", "Sam123"));
        UCSHelpdesk.addPerson(new Receptionist("Sally", "Sally123"));
        UCSHelpdesk.addPerson(new Student("James"));

       // Administrator loggedInAdministrator = UCSHelpdesk.getAdministrator(1000);
       // Student loggedInStudent = UCSHelpdesk.getStudent(1001);
       // Receptionist loggedInReceptionist = UCSHelpdesk.getReceptionist(1004);

        CLI cli = new CLI(UCSHelpdesk);

  //      System.out.println(loggedInReceptionist);


//        GeneralTicket ticket1 = new GeneralTicket(receptionist1, "Door in A23 broken.");
//        Update update1 = new Update(receptionist2, "Door had been checked, needs new hinge.");
//        ticket1.addAction(update1);
//
//
//        TechnicalTicket ticket2 = new TechnicalTicket(receptionist1, "Computer in C4 broke.", student1, "Computer");
//
//        ticket2.addAction(new Update(receptionist2, "Computer needs new SSD."));
//
//        ticket2.addAction(new Resolution(receptionist1, "SDD now installed."));
//
//        System.out.println(ticket2);

    }
}
