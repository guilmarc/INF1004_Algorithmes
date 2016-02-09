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
    private ArrayList<Path> paths;

    Driver(String firstName, String lastName, int hiredIn, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiredIn = hiredIn;
        this.address = address;
        this.paths = new ArrayList<Path>();
        this.driverID = generateDriverID();
    }
    
    private String generateDriverID(){
        //TODO: Generate the driverID here -> MUNA15 ("Munoz", "Armando", 2015, "4698 rue Fournier (St-Jerôme)  J7Z 4V1")
        return "EMPTY";
    }

    public void addPath(Path path){
        this.paths.add(path);
    }

}

//Par ailleurs, la compagnie doit conserver certaines informations concernant les chauffeurs à savoir: le nom, le prénom,
// l’année d’embauche, l’adresse, la liste des trajets effectués ainsi qu’un numéro d’identification composé des trois premiers
// caractères du nom, du premier caractère du prénom et des deux derniers chiffres de l’année d’embauche

//Pour chacun des trajets associé au chauffeur, on veut conserver la ville de départ, la ville d’arrivée,
// le kilométrage au départ, le kilométrage à l’arrivée et la limousine utilisée pour le trajet.
