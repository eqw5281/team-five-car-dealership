package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesLead {

    //  for sales leads, we should only need basic information about the non-converted customer
    private int leadId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    //Constructor
    public SalesLead(int _leadId) {
        this.leadId = _leadId;
    }

    // setters/getters
    public int getleadId() {
        return leadId;
    }
    public void setleadId(int _leadId) {
        this.leadId = _leadId;
    }

    public String getFirstName() {
        return lastName;
    }
    public void setFirstName(String _lastName) {
        this.lastName = _lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String _phone) {
        this.phone = _phone;
    }


    //  class methods
    public static void listSalesLeads(ArrayList<SalesLead> leadList) {
        for (SalesLead leads : leadList) {
            System.out.println("Lead ID: " + leads.getleadId());
            System.out.println("First Name: " + leads.getFirstName());
            System.out.println("Last Name: " + leads.getLastName());
            System.out.println("Last Name: " + leads.getEmail());
            System.out.println("Last Name: " + leads.getPhone());
        }
    }


    // this is to be added to the main() method in class Main
    public static SalesLead addSalesLead(ArrayList<SalesLead> leadList) {
        SalesLead lead = new SalesLead(leadIdCount++);  // --> please add private static int leadIdCount = 0; in Main Class, before main() method
        Scanner in = new Scanner(System.in);
        for (SalesLead s : leadList) {
            System.out.println("Lead First Name: " + s.getFirstName());
            s.setFirstName(in.nextLine());
            System.out.println("Lead Last Name: " + s.getLastName());
            s.setLastName(in.nextLine());
            System.out.println("Lead Email: " + s.getEmail());
            s.setEmail(in.nextLine());
            System.out.println("Lead Phone: " + s.getPhone());
            s.setPhone(in.nextLine());
            System.out.println("Lead ID: " + s.getleadId());
        }
        return lead;
    }

    /* QUESTIONS:
    1. Can we add option to login and/or add sales lead (then 'logging in' with the employee's ID?
        1a. We would add it to this line in main() of class Main: final String PROMPT_ACTION = "To see cars inventory type'C', to see parts inventory type'P', to exit type 'e'";
        1b. Only Sales Advisors and Employees should have access to add new leads (NOT customers)

     */
}
