/**
 * Created by guilmarc on 2016-01-26.
 */
public class Point {

    private int absisse;
    private int ordonnee;

    private final static int MAX_ABSISSE = 10;
    private final static int MIN_ABSISSE = 0;
    private final static int MAX_ORDONNEE = 20;
    private final static int MIN_ORDONNEE = 0;

    Point(int absisse, int ordonnee) throws InvalidPointException {

        if (!this.setAbsisse(absisse) || !this.setOrdonnee(ordonnee)) {
            throw new InvalidPointException();
        }

        this.absisse = absisse;
        this.ordonnee = ordonnee;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public boolean setOrdonnee(int ordonnee) {
        if (ordonnee < MIN_ORDONNEE || ordonnee > MAX_ORDONNEE) {
            return false;
        }

        this.ordonnee = ordonnee;
        return true;
    }

    public int getAbsisse() {
        return absisse;
    }

    public boolean setAbsisse(int absisse) {

        if (ordonnee < MIN_ABSISSE || ordonnee > MAX_ABSISSE) {
            return false;
        }

        this.absisse = absisse;
        return true;
    }

    boolean Deplacer(int deltaX, int deltaY) {

        if (!this.setAbsisse(absisse + deltaX) || !this.setOrdonnee(ordonnee + deltaY)) {
            return false;
        }

        this.absisse = this.absisse + deltaX;
        this.ordonnee = this.ordonnee + deltaY;

        return true;

    }

}
