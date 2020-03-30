package UCSHelpdesk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CLI {

    private InputStreamReader streamReader = new InputStreamReader(System.in);
    private BufferedReader input = new BufferedReader(streamReader);
    private Helpdesk helpdesk;
    private Receptionist loggedInReceptionist;
    private Administrator loggedInAdministrator;

    public CLI(Helpdesk helpdesk) throws IOException {
        this.helpdesk = helpdesk;
        login();
    }

    private void login() throws IOException {
        System.out.println("Welcome to " + helpdesk.getHelpdeskName() + " Helpdesk" );
        System.out.println("------------------------------" );
        System.out.print("Enter User ID: ");
        String userID = input.readLine();
        System.out.print("Enter Password: ");
        String password = input.readLine();


       int userIDNumber = checkInt(userID);

       if(authenticateUser(userIDNumber, password))
       {
           loggedInReceptionist = helpdesk.getReceptionist(userIDNumber);

           ticketMenu();
       }
       else
       {
           System.out.println("Incorrect Credentials");
           login();
       }
       if (authenticateUser(userIDNumber, password))
        {
            loggedInAdministrator = helpdesk.getAdministrator(userIDNumber);

            adminMenu();
        }
        else
        {
            System.out.println("Incorrect Credentials");
            login();
        }
    }


    private int checkInt(String number)
    {
        try
        {
            return Integer.parseInt(number);
        }
        catch (NumberFormatException ex)
        {
            return -1;
        }
    }

    private boolean authenticateUser(int userID, String password)
    {
        Receptionist receptionist = helpdesk.getReceptionist(userID);
        if (receptionist != null){

            if(receptionist.getPassword().equals(password))
            {
                return true;
            }
            else
            {
                return false; //Incorrect password
            }
        }
        return false;
    }


    private void adminMenu() throws IOException {
        System.out.println("Administrator Ticket Menu");
        System.out.println("------------------------------" );
        System.out.println("<-----------CREATE----------->" );
        System.out.println("1.1 Create Student" );
        System.out.println("1.2 Create Staff" );
        System.out.println("1.3 Create Receptionists" );
        System.out.println("------------------------------" );
        System.out.println("<-----------UPDATE----------->" );
        System.out.println("2.1 Update Student" );
        System.out.println("2.2 Update Staff" );
        System.out.println("2.3 Update Receptionists" );
        System.out.println("------------------------------" );
        System.out.println("<-----------SEARCH & VIEW----------->" );
        System.out.println("3.1 Search & View Student" );
        System.out.println("3.2 Search & View Staff" );
        System.out.println("3.3 Search & View Receptionists" );
        System.out.println("------------------------------" );
        System.out.println("<-----------DELETE----------->" );
        System.out.println("4.1 Delete Student" );
        System.out.println("4.2 Delete Staff" );
        System.out.println("4.3 Delete Receptionists" );
        String adminChoice = input.readLine();

    }


    private void ticketMenu() throws IOException {
        System.out.println("Ticket Menu");
        System.out.println("------------------------------" );
        System.out.println("1. Open Ticket" );
        System.out.println("2. Search and View Ticket" );
        System.out.println("3. Add Action" );
        System.out.println("------------------------------" );
        System.out.print("Enter choice: ");
        String choice = input.readLine();

        switch(choice)
        {
            case "1":
                createTicket();
                break;
            case "2":
                viewTickets();
                break;
            case "3":
                addAction();
                break;
            default:
                System.out.println("Not an option");
                ticketMenu();

        }

    }

    private void createTicket() throws IOException {
        System.out.print("Enter General Ticket Details: ");
        String details = input.readLine();
        helpdesk.addTicket(new GeneralTicket(loggedInReceptionist, details));
        ticketMenu();
    }

    private void viewTickets() throws IOException {
        System.out.print(helpdesk.getTickets());
        ticketMenu();
    }

    private void addAction() throws IOException {
    System.out.println("Please Provide an Update:");

    }
}
