public class n24AgeNotWithinRangeException extends Exception {
    public n24AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws n24AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new n24AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }

        if (!name.matches("^[a-zA-Z\\s]+$")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

class tudentExample {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            student1.displayStudentInfo();

            System.out.println();

            Student student2 = new Student(2, "Jane@Smith", 22, "Mathematics");
            student2.displayStudentInfo();
        } catch (n24AgeNotWithinRangeException e) {
            System.out.println("AgeNotWithinRangeException: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("NameNotValidException: " + e.getMessage());
        }
    }
}