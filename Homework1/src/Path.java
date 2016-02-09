/**
 * Created by guilmarc on 2016-01-25.
 */
public class Path {

    private String startingCity;
    private String endingCity;
    private float startingOdometer;
    private float endingOdometer;
    private Limousine limousine;

    Path(String startingCity, String endingCity, float startingOdometer, float endingOdometer, Limousine limousine){
        this.startingCity = startingCity;
        this.endingCity = endingCity;
        this.startingOdometer = startingOdometer;
        this.endingOdometer = endingOdometer;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public String getEndingCity() {
        return endingCity;
    }

    public void setEndingCity(String endingCity) {
        this.endingCity = endingCity;
    }

    public float getStartingOdometer() {
        return startingOdometer;
    }

    public void setStartingOdometer(int startingOdometer) {
        this.startingOdometer = startingOdometer;
    }

    public float getEndingOdometer() {
        return endingOdometer;
    }

    public void setEndingOdometer(int endingOdometer) {
        this.endingOdometer = endingOdometer;
    }

    public Limousine getLimousine() {
        return limousine;
    }

    public void setLimousine(Limousine limousine) {
        this.limousine = limousine;
    }
}

//Pour chacun des trajets associé au chauffeur, on veut conserver la ville de départ, la ville d’arrivée,
// le kilométrage au départ, le kilométrage à l’arrivée et la limousine utilisée pour le trajet.
