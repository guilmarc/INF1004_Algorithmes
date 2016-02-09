/**
 * Created by guilmarc on 2016-01-27.
 */
public class Reservation {
    Driver driver;
    Route route;

    public Reservation(Driver driver, Route route) {
        this.driver = driver;
        this.route = route;
    }

    public Limousine getLimousine(){
        return this.route.getLimousine();
    }
}
