import java.util.ArrayList;

/**
 * Created by guilmarc on 2016-01-25.
 */
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
        //TODO: Generate the driverID here -> MUNA15 ("Munoz", "Armando", 2015, "4698 rue Fournier (St-Jerôme)  J7Z 4V1")
        return this.firstName.substring(0, 3).toUpperCase() + this.lastName.substring(0,1).toUpperCase() + Integer.toString(this.hiredIn).substring(2,4);
    }

    public void addRoute(Route route){
        this.routes.add(route);
    }

    public ArrayList<Limousine> getLimousines(){
        ArrayList<Limousine> limousines = new ArrayList<Limousine>();
        for(Route route : routes) {
            //If the limousine is nos already in the array
            if (limousines.indexOf(route.getLimousine()) == -1) {
                limousines.add(route.getLimousine());
            }
        }
        return limousines;
    }

    public String toString(){
        return "[" + this.driverID + "] " + this.firstName + " " + this.lastName + " living at " + this.address + " was hired in " + this.hiredIn;
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
}

//Par ailleurs, la compagnie doit conserver certaines informations concernant les chauffeurs à savoir: le nom, le prénom,
// l’année d’embauche, l’adresse, la liste des trajets effectués ainsi qu’un numéro d’identification composé des trois premiers
// caractères du nom, du premier caractère du prénom et des deux derniers chiffres de l’année d’embauche

//Pour chacun des trajets associé au chauffeur, on veut conserver la ville de départ, la ville d’arrivée,
// le kilométrage au départ, le kilométrage à l’arrivée et la limousine utilisée pour le trajet.
