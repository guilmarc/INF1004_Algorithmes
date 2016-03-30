import java.util.ArrayList;

/**
 * Created by guilmarc on 2016-03-28.
 */
public class Course implements Comparable<Course> {

    private String code;
    private String name;
    private int maximumOfInscriptions;
    private int numberOfInscriptions;
    private ArrayList<Course> prerequisites;
    private LinkedList<Student> students;

    public Course(String code, String name, int maximumOfInscriptions, Course... prerequisites) {
        this.code = code;
        this.name = name;
        this.maximumOfInscriptions = maximumOfInscriptions;

        for(Course prerequisite : prerequisites) {
            this.prerequisites.add(prerequisite);
        }
    }

    public int compareTo(Course anotherCourse){
        return this.code.compareTo(anotherCourse.code);
    }


}
