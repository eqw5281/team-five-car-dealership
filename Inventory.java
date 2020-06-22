package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Inventory {

    //Data members for the Inventory
    private ArrayList carList;
    private ArrayList partsList;


//Constructor Methods

    public Inventory() {
        carList = new ArrayList<Cars>();
        partsList = new ArrayList<Parts>();
    }


    //Setters and getters

    public Cars getCars(int _car) {
        return (Cars) carList.get(_car);
    }

    public void setCars(Cars _car) {
        carList.add(_car);
    }


    public Parts getParts(int _part) {
        return (Parts) partsList.get(_part);
    }
    public void setParts(Parts _part) {
        partsList.add(_part);
    }




}