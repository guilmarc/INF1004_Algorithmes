import java.util.ArrayList;

/**
 * Created by guilmarc on 2016-03-31.
 */
public class University {

    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void addCourse(Course newCourse) {
        courses.add(newCourse);
    }

    public void showCoursesForStudentIndex(int studentIndex) {
        Student student = students.get(studentIndex);

        Link current = student.firstCourse;

        System.out.println("Liste des cours de " + student.toString());
        System.out.println("****************************************************************************");

        while (current != null) {
            Course course = courses.get(current.courseIndex);
            System.out.println(course.toString());
            current = current.nextCourse;
        }

        System.out.println();
    }

    public void showStudentsForCourseIndex(int courseIndex) {
        Course course = courses.get(courseIndex);

        Link current = course.firstStudent;

        System.out.println("Liste des étudiants de " + course.toString());
        System.out.println("****************************************************************************");

        while (current != null) {
            Student student = students.get(current.studentIndex);
            System.out.println(student.toString());
            current = current.nextCourse;
        }

        System.out.println();
    }


    public void switchInscription(int studentIndex, int oldCourseIndex, int newCourseIndex) {
        this.removeInscription(studentIndex, oldCourseIndex);
        this.addInscription(studentIndex, newCourseIndex);
    }

    public void addInscription(int studentIndex, int courseIndex) {
        Link newLink = new Link(studentIndex, courseIndex);

        Student student = students.get(studentIndex);
        Course course = courses.get(courseIndex);

        //Insert the new course for the selected student
        newLink.nextCourse = student.firstCourse;
        student.firstCourse = newLink;

        //Insert the new student for the selected course
        newLink.nextStudent = course.firstStudent;
        course.firstStudent = newLink;
    }

    public void removeInscription(int studentIndex, int courseIndex) {
        this.removeCourseForStudentIndex(studentIndex, courseIndex);
        this.removeStudentForCourseIndex(courseIndex, studentIndex);
    }

    private Link removeCourseForStudentIndex(int studentIndex, int courseIndex) {
        Student student = students.get(studentIndex);

        Link current = student.firstCourse;
        Link previous = student.firstCourse;

        while (current.courseIndex != courseIndex) {
            if (current.nextCourse == null) {
                return null;
            } else {
                previous = current;
                current = current.nextCourse;
            }
        }

        if (current == student.firstCourse) {
            student.firstCourse = student.firstCourse.nextCourse;
        } else {
            previous.nextCourse = current.nextCourse;
        }

        return current;
    }

    private Link removeStudentForCourseIndex(int courseIndex, int studentIndex) {
        Course course = courses.get(courseIndex);

        Link current = course.firstStudent;
        Link previous = course.firstStudent;

        while (current.studentIndex != studentIndex) {
            if (current.nextStudent == null) {
                return null;
            } else {
                previous = current;
                current = current.nextStudent;
            }
        }

        if (current == course.firstStudent) {
            course.firstStudent = course.firstStudent.nextCourse;
        } else {
            previous.nextStudent = current.nextStudent;
        }

        return current;
    }

    private Link findInscription(int studentIndex, int courseIndex){

        Student student = students.get(studentIndex);
        Link current = student.getFirstCourse();
        while(current.courseIndex != courseIndex) {
            if(current.nextCourse == null) {
                return null;
            } else {
                current = current.nextCourse;
            }
        }
        return current;
    }

}
