//  Reservation.java
//	Author: Marco Choinière-Guillemette
//	Hiver 2016
//  Classe responsable du model de donnée des réservations
//********************************************************************

public class Reservation {
    Driver driver;
    Route route;

    public Reservation(Driver driver, Route route) {
        this.driver = driver;
        this.route = route;
    }

    //No getters or setters here cause only constructor can modify driver & route

}
