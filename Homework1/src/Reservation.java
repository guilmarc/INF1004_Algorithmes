/**
 * Created by guilmarc on 2016-01-27.
 */
public class Reservation {
    Limousine limousine;
    Driver driver;
    Path path;

    public Reservation(Limousine limousine, Driver driver, Path path) {
        this.limousine = limousine;
        this.driver = driver;
        this.path = path;
    }
}
