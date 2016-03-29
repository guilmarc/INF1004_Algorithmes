/**
 * Created by guilmarc on 2016-03-28.
 */
public class Course implements Comparable<Course> {

    private String code;
    private String name;
    private int maximumOfInscriptions;
    private int numberOfInscriptions;
    private DoublyLinkedList<Course> prerequisites;
    private DoublyLinkedList<Student> inscriptions;

    public int compareTo(Course anotherCourse){
        return this.code.compareTo(anotherCourse.code);
    }
}
