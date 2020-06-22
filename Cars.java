package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Cars {
    //Data members

    private int carID;//Or we can use VIN. But CARID works faster
    private String make;
    private String model;
    private int year;
    private String color;
    private int miles;

    //Constructors

    public Cars(int _carID, String _make, String _model, int _year, String _color, int _miles) {
        this.carID = _carID;
        this.make = _make;
        this.model = _model;
        this.year = _year;
        this.color = _color;
        this.miles = _miles;
    }

    //Setters and Getters


    public int getcarID() {
        return carID;
    }

    public void setID(int _carID) {
        this.carID = _carID;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String _make) {
        this.make = _make;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        this.model = _model;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int _year) {
        this.year = _year;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        this.color = _color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(String _miles) {
        this.color = _miles;
    }



    //Make an arraylist for the cars

    public static void listCars(ArrayList<Cars> cList) {
        for (Cars car : cList) {
            System.out.println("Car ID: " + car.getcarID());
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Color: " + car.getColor());
            System.out.println("Miles on the car: " + car.getMiles());

        }


    }

}

