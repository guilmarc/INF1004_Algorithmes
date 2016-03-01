//  Driver.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2015
//  Classe responsable du model de données des conducteurs
//********************************************************************

package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Driver {
    private String driverID;
    private String firstName;
    private String lastName;
    private int hiredIn;        //Année d'embauche
    private String address;
    private ArrayList<Route> routes;

    Driver(String firstName, String lastName, int hiredIn, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiredIn = hiredIn;
        this.address = address;
        this.routes = new ArrayList<Route>();
        this.driverID = generateDriverID();
    }
    
    private String generateDriverID(){
        return this.firstName.substring(0, 3).toUpperCase() + this.lastName.substring(0,1).toUpperCase() + Integer.toString(this.hiredIn).substring(2,4);
    }

    public void addRoute(Route route){
        this.routes.add(route);
    }

    public ObservableList<Limousine> getLimousines(){
        ObservableList<Limousine> limousines = FXCollections.observableArrayList();

        for(Route route : routes) {
            //If the limousine is nos already in the array
            if (limousines.indexOf(route.getLimousine()) == -1) {
                limousines.add(route.getLimousine());
            }
        }
        return limousines;
    }


    //Getters
    public String getDriverID() {
        return driverID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHiredIn() {
        return hiredIn;
    }

    public String getAddress() {
        return address;
    }


    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHiredIn(int hiredIn) {
        this.hiredIn = hiredIn;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //Display textually this object
    public String toString(){
        return "[" + this.driverID + "] " + this.firstName + " " + this.lastName + " living at " + this.address + " was hired in " + this.hiredIn;
    }
}
