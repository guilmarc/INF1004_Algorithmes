//  TooManyDriversException.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2015
//  Classe d'erreur servant lors de l'ajout de trop de conducteurs
//********************************************************************
package sample;

public class TooManyDriversException extends Exception {
    public TooManyDriversException(String message) {
        super(message);
    }
}