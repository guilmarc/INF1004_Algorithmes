/**
 * Created by guilmarc on 2016-01-25.
 */


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

    public String toString(){
        return "a " + this.color + " " + this.model + " with " + this.tankCapacity + " liters tank capacity can " + this.passengerCapacity  +  " 90 passengers";
    }

}


//Chaque limousine possède les caractéristiques suivantes: le numéro d’immatriculation, la capacité du réservoir, le nombre de passagers, la couleur