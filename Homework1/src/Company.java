//  Company.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2016
//  Classe maîtresse utilisant la composition afin de sauvegarder les informations sur la compagnie
//*************************************************************************************************

import java.util.ArrayList;

public class Company {

    private String name;
    private int foundingYear;
    private ArrayList<Limousine> limousines;
    private ArrayList<Driver> drivers;
    private ArrayList<Route> routes;
    private ArrayList<Reservation> reservations;

    //Constructeur de la classe compagnie
    Company(String name, int foundingYear){
        this.name = name;
        this.foundingYear = foundingYear;

        this.limousines = new ArrayList<Limousine>();
        this.drivers = new ArrayList<Driver>();
        this.routes = new ArrayList<Route>();
        this.reservations = new ArrayList<Reservation>();
    }

    //Ajouter une limousine dans la liste
    public Limousine addLimousine(String model, String immatriculation, int tankCapacity, int passengerCapacity, String color) {
        Limousine newLimousine = new Limousine(model, immatriculation,  tankCapacity,  passengerCapacity, color);
        this.limousines.add(newLimousine);
        return newLimousine;
    }

    //Ajouter un conducteur dans la liste.  Cette méthode retourne une exception s'il y a déjà 12 conducteurs
    public Driver addDriver(String firstName, String lastName, int hiredIn, String address) throws TooManyDriversException  {
        if (this.drivers.size() >= 12) {
            throw new TooManyDriversException("Company doesn't accept more drivers (12 max)");
        }

        Driver newDriver = new Driver(firstName, lastName, hiredIn, address);
        this.drivers.add(newDriver);
        return newDriver;
    }

    //Ajouter un trajet dans la liste
    public Route addRoute(String startingCity, String endingCity, float startingOdometer, float endingOdometer, int limousineID){
        Route newRoute = new Route(startingCity, endingCity, startingOdometer, endingOdometer, this.limousines.get(limousineID));
        this.routes.add(newRoute);
        return newRoute;
    }

    //Lier un conducteur à un trajet
    public Driver linkDriverToRoute(String driverID, int[] routes){
        Driver driver = this.getDriverByID(driverID);
        for( int index : routes ) {
            driver.addRoute(this.routes.get(index));
        }

        return driver;
    }

    //Retourne un conducteur en le recherchant par son code
    public Driver getDriverByID(String driverID){
        for (Driver driver : drivers) {
            if (driver.getDriverID().equals(driverID)) {
                return driver;
            }
        }
        return null;
    }

    //Retourne la liste des limousines associées à un conducteur
    public ArrayList<Limousine> getLimousinesWithDriverID(String driverID){
        return getDriverByID(driverID).getLimousines();
    }

    //Ajouter une réservation de route liée à un conducteur dans la liste
    public Reservation addReservation(Driver driver, Route route){
        Reservation newReservation = new Reservation(driver, route);
        this.reservations.add(newReservation);
        return newReservation;
    }


    //Liste des assenceurs disponibles au publique
    public int getFoundingYear() {
        return foundingYear;
    }

    public ArrayList<Limousine> getLimousines() {
        return limousines;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getName() { return name; }

    //Will not be set cause should not be changed after creation (constructor)
    /*public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }*/
}


//Par ailleurs, la compagnie doit conserver certaines informations concernant les chauffeurs à savoir: le nom,
// le prénom, l’année d’embauche, l’adresse, la liste des trajets effectués ainsi qu’un numéro d’identification
// composé des trois premiers caractères du nom, du premier caractère du prénom et des deux derniers chiffres de l’année d’embauche.
