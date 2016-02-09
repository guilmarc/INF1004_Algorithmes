/**
 * Created by guilmarc on 2016-01-27.
 */
public class Reservation {
    Limousine limousine;
    Driver driver;
    Route route;

    public Reservation(Limousine limousine, Driver driver, Route route) {
        this.limousine = limousine;
        this.driver = driver;
        this.route = route;
    }
}
