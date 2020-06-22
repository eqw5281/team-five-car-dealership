package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Salesmen {


    //  Data Members

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int emplID;
    private String phone;


    //Constructor


    public Salesmen(int _emplID, String _firstName, String _lastName, String _email, String _address, String _phone) {
        this.emplID = _emplID;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.address = _address;
        this.phone = _phone;
    }





    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
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

    public String getAddress() {
        return address;
    }
    public void setAddress(String _address) {
        this.address = _address;
    }

    public int getEmplID() {
        return emplID;
    }
    public void setEmplID(int _emplID) {
        this.emplID = _emplID;
    }


    public String getPhone() {
        return phone;
    }
    public void setPhone(String _phone) {
        this.phone = _phone;
    }


    public static void listSalesmen(ArrayList<Salesmen> sellerList) {
        for (Salesmen sellers : sellerList) {
            System.out.println("Salesman ID: " + sellers.getEmplID());
            System.out.println("First Name: " + sellers.getFirstName());
            System.out.println("Last Name: " + sellers.getLastName());
            System.out.println("Email: " + sellers.getEmail());
            System.out.println("Address: " + sellers.getAddress());
            System.out.println("Phone: " + sellers.getPhone());
        }
    }
}
