/**
 * Created by guilmarc on 2016-03-28.
 */
public class Link {

    private Object data;

    private Link next;
    private Link previous;

    public Link(Object data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setPrevious(Link previous) {
        this.previous = previous;
    }
}
