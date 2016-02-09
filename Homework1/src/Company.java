import java.util.ArrayList;

/**
 * Created by guilmarc on 2016-01-25.
 */
public class Company {

    private String name;
    private int foundingYear;
    private ArrayList<Limousine> limousines;
    private ArrayList<Driver> drivers;
    private ArrayList<Route> routes;
    private ArrayList<Reservation> reservations;

    Company(String name, int foundingYear){
        this.name = name;
        this.foundingYear = foundingYear;

        this.limousines = new ArrayList<Limousine>();
        this.drivers = new ArrayList<Driver>();
        this.routes = new ArrayList<Route>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Limousine addLimousine(String model, String immatriculation, int tankCapacity, int passengerCapacity, String color) {
        Limousine newLimousine = new Limousine(model, immatriculation,  tankCapacity,  passengerCapacity, color);
        this.limousines.add(newLimousine);
        return newLimousine;
    }

    public Driver addDriver(String firstName, String lastName, int hiredIn, String address) throws TooManyDriversException  {
        if (this.drivers.size() >= 12) {
            throw new TooManyDriversException("Company doesn't accept more drivers (12 max)");
        }

        Driver newDriver = new Driver(firstName, lastName, hiredIn, address);
        this.drivers.add(newDriver);
        return newDriver;
    }


    public Route addRoute(String startingCity, String endingCity, float startingOdometer, float endingOdometer, int limousineID){
        Route newRoute = new Route(startingCity, endingCity, startingOdometer, endingOdometer, this.limousines.get(limousineID));
        this.routes.add(newRoute);
        return newRoute;
    }


    public Driver linkDriverToRoute(String driverID, int[] routes){
        Driver driver = this.getDriverByID(driverID);
        for( int index : routes ) {
            driver.addRoute(this.routes.get(index));
        }

        return driver;
    }

    public Driver getDriverByID(String driverID){
        for (Driver driver : drivers) {
            if (driver.getDriverID().equals(driverID)) {
                return driver;
            }
        }
        return null;
    }

    public ArrayList<Limousine> getLimousinesWithDriverID(String driverID){
        return getDriverByID(driverID).getLimousines();
    }

    public Reservation addReservation(Driver driver, Route route){
        Reservation newReservation = new Reservation(driver, route);
        this.reservations.add(newReservation);
        return newReservation;
    }

    public void useReservation(Reservation reservation){

        reservation.driver.addRoute(reservation.route);
        this.removeReservation(reservation);
    }

    public boolean removeReservation(Reservation reservation){
        return this.reservations.remove(reservation);
    }

    public boolean removeLimousine(Limousine limousine){
        return this.limousines.remove(limousine);
    }

    public boolean removeDriver(Driver driver){
        return this.drivers.remove(driver);
    }


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

    //Will not be set cause should not be changed after creation (constructor)
    /*public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }*/
}


//Par ailleurs, la compagnie doit conserver certaines informations concernant les chauffeurs à savoir: le nom,
// le prénom, l’année d’embauche, l’adresse, la liste des trajets effectués ainsi qu’un numéro d’identification
// composé des trois premiers caractères du nom, du premier caractère du prénom et des deux derniers chiffres de l’année d’embauche.
