/**
 * Created by guilmarc on 2016-03-28.
 */
public class Student implements Comparable<Student> {

    private String permanentCode;
    private String lastName;
    private String firstName;

    private String programNumber;

    private int credits;
    private float cumulativeAverage;

    private int numberOfInscriptions;

    LinkedList<Course> courses;

    public Student(String permanentCode, String lastName, String firstName, String programNumber, int credits, float cumulativeAverage, int numberOfInscriptions) {
        this.permanentCode = permanentCode;
        this.lastName = lastName;
        this.firstName = firstName;
        this.programNumber = programNumber;
        this.credits = credits;
        this.cumulativeAverage = cumulativeAverage;
        this.numberOfInscriptions = numberOfInscriptions;
    }


    public int compareTo(Student anotherStudent){
        return this.permanentCode.compareTo(anotherStudent.permanentCode);
    }

}
