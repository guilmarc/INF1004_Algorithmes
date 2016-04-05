/**
 * Created by guilmarc on 2016-03-28.
 */
public class Link {

    public int studentIndex;
    public int courseIndex;

    public Link nextStudent;
    public Link nextCourse;

    //public Link previousStudent;
    //public Link previousCourse;

    public Link(int studentIndex, int courseIndex ) {
        this.studentIndex = studentIndex;
        this.courseIndex = courseIndex;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(int studentIndex) {
        this.studentIndex = studentIndex;
    }

    public int getCourseIndex() {
        return courseIndex;
    }

    public void setCourseIndex(int courseIndex) {
        this.courseIndex = courseIndex;
    }

    public Link getNextStudent() {
        return nextStudent;
    }

    public void setNextStudent(Link nextStudent) {
        this.nextStudent = nextStudent;
    }

    public Link getNextCourse() {
        return nextCourse;
    }

    public void setNextCourse(Link nextCourse) {
        this.nextCourse = nextCourse;
    }

    public void displayLink() // display ourself
    {
        System.out.print("{" + studentIndex + "} ");
    }
}
