//  Limousine.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2016
//  Classe responsable du model de données des limousines
//********************************************************************


public class Limousine {
    private String model;
    private String immatriculation;
    private int tankCapacity;
    private int passengerCapacity;
    private String color; //HEX COLOR 0x009089;

    Limousine(String model, String immatriculation, int tankCapacity, int passengerCapacity, String color){
        this.model = model;
        this.immatriculation = immatriculation;
        this.tankCapacity = tankCapacity;
        this.passengerCapacity = passengerCapacity;
        this.color = color;
    }

    ////Liste des "getters" disponibles
    public String getModel() {
        return model;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public String getColor() {
        return color;
    }


    ////Liste des "setters" disponibles
    public void setModel(String model) {
        this.model = model;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Affichage textuel de cet objet
    public String toString(){
        return this.color + " " + this.model + " #" + this.immatriculation  + "with " + this.tankCapacity + " liters tank capacity can afford " + this.passengerCapacity  +  " passengers";
    }
}
