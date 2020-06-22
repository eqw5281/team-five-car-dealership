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

    public String getfirstName() {
        return lastName;
    }

    public void setfirstName(String _firstName) {
        this.lastName = _firstName;
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
            System.out.println("First Name: " + leads.getfirstName());
            System.out.println("Last Name: " + leads.getLastName());
            System.out.println("Last Name: " + leads.getEmail());
            System.out.println("Last Name: " + leads.getPhone());
        }
    }
}
