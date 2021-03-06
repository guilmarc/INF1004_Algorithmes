//  Driver.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2016
//  Classe responsable du model de données des conducteurs
//********************************************************************


import java.util.ArrayList;

public class Driver {
    private String driverID;
    private String firstName;
    private String lastName;
    private int hiredIn;        //Année d'embauche
    private String address;
    private ArrayList<Route> routes;

    //Constructeur de la classe conducteur
    Driver(String firstName, String lastName, int hiredIn, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiredIn = hiredIn;
        this.address = address;
        this.routes = new ArrayList<Route>();
        this.driverID = generateDriverID();
    }

    //Methode privée servant à générer le code du conducteur selon certains critères
    private String generateDriverID(){
        return this.firstName.substring(0, 3).toUpperCase() + this.lastName.substring(0,1).toUpperCase() + Integer.toString(this.hiredIn).substring(2,4);
    }

    //Associe une route existante à ce conducteur
    public void addRoute(Route route){
        this.routes.add(route);
    }

    //Retourne les limousines associées à ce conducteur
    public ArrayList<Limousine> getLimousines(){
        ArrayList<Limousine> limousines = new ArrayList<Limousine>();
        for(Route route : routes) {
            //If the limousine is not already in the array
            if (limousines.indexOf(route.getLimousine()) == -1) {
                limousines.add(route.getLimousine());
            }
        }
        return limousines;
    }


    //Liste des "getters" disponibles
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


    //Liste des "setters" disponibles
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


    //Affichage textuel de cet objet
    public String toString(){
        return "[" + this.driverID + "] " + this.firstName + " " + this.lastName + " living at " + this.address + " was hired in " + this.hiredIn;
    }
}
