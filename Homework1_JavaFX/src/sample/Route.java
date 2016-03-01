//  Route.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2015
//  Classe responsable du model de donnée des trajets
//********************************************************************
package sample;

public class Route {

    private String startingCity;
    private String endingCity;
    private float startingOdometer;
    private float endingOdometer;
    private Limousine limousine;

    Route(String startingCity, String endingCity, float startingOdometer, float endingOdometer, Limousine limousine){
        this.startingCity = startingCity;
        this.endingCity = endingCity;
        this.startingOdometer = startingOdometer;
        this.endingOdometer = endingOdometer;
        this.limousine = limousine;
    }

    //Getters
    public String getStartingCity() {
        return startingCity;
    }

    public String getEndingCity() {
        return endingCity;
    }

    public float getStartingOdometer() {
        return startingOdometer;
    }

    public float getEndingOdometer() {
        return endingOdometer;
    }

    public Limousine getLimousine() {
        return limousine;
    }


    //Setters
    public void setStartingCity(String startingCity) {
        this.startingCity = startingCity;
    }

    public void setEndingCity(String endingCity) {
        this.endingCity = endingCity;
    }

    public void setStartingOdometer(float startingOdometer) {
        this.startingOdometer = startingOdometer;
    }

    public void setEndingOdometer(float endingOdometer) {
        this.endingOdometer = endingOdometer;
    }

    public void setLimousine(Limousine limousine) {
        this.limousine = limousine;
    }


    //Display textually this object
    public String toString(){
        return "This is a " + (this.endingOdometer - this.startingOdometer)  + "km route from " + this.startingCity + " to " + this.endingCity + " run by a " + this.limousine.toString();
    }
}

//Pour chacun des trajets associé au chauffeur, on veut conserver la ville de départ, la ville d’arrivée,
// le kilométrage au départ, le kilométrage à l’arrivée et la limousine utilisée pour le trajet.
