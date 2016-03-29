/**
 * Created by guilmarc on 2016-03-28.
 */
public class DoublyLinkedList<Comparable> {

    private Link first;
    private Link last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insertFirst(Comparable data){

        Link newLink = new Link(data);

        if (isEmpty()) {
            this.last = newLink;
        } else {
            this.first.setPrevious(newLink);
        }
        newLink.setNext(this.first);
        this.first = newLink;
    }

    public void insertLast(Comparable data) {

        Link newLink = new Link(data);

        if (isEmpty()) {
            this.first = newLink;
        } else {
            this.last.setNext(newLink);
            newLink.setPrevious(this.last);
        }

        this.last = newLink;

    }

    public Link deleteFirst() {

        Link deletedLink = this.first;

        if (this.first.getNext() == null) {
            this.last = null;                       //List os now empty
        } else {
            this.first.getNext().setPrevious(null);
        }

        first = first.getNext();

        return deletedLink;
    }

    public Link deleteLast() {

        Link deletedLink = this.last;

        if (first.getNext() == null) {
            first = null;
        } else {
            this.last.getPrevious().setNext(null);
        }

        this.last = this.last.getPrevious();

        return deletedLink;

    }

    public boolean insertAfter() {
        return true;
    }

    public boolean insertBefore() {
        return true;
    }

    // public Link deleteKey(long key)


}
