//  TooManyDriversException.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2016
//  Classe d'erreur servant lors de l'ajout de trop de conducteurs
//********************************************************************

public class TooManyDriversException extends Exception {
    public TooManyDriversException(String message) {
        super(message);
    }
}