/**
 * Created by guilmarc on 2016-03-28.
 */
public class Link<T> {

    private T data;

    private Link nextStudent;
    private Link nextCourse;

    public Link(T data) {
        this.data = data;
    }

    public Link getNext() {
        return data instanceof Course ? nextCourse : nextStudent;
    }

    public void setNext(Link link) {
        if( link.data instanceof Course ) {
            nextCourse = link;
        } else {
            nextStudent = link;
        }
    }

    public void displayLink() // display ourself
    {
        System.out.print("{" + data + "} ");
    }
}
