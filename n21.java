import java.util.ArrayList;
import java.util.List;

public class n21 {
    private String name;
    private int grade;
    private List<String> courses;

    public n21(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}
class studentExample {
    public static void main(String[] args) {
        n21 student = new n21("John Doe", 10);
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");
        student.displayInformation();

        System.out.println();

        student.removeCourse("Science");
        student.displayInformation();
    }
}
