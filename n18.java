import java.util.Scanner;
public class n18 {
    String name;
    int age;

    public void acceptData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends n18 {
    String designation;
    double salary;

    public void acceptData() {
        super.acceptData();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter designation: ");
        designation = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].acceptData();
        }

        System.out.println("Employees with salary greater than 5000:");

        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.println(employee.name);
            }
        }
    }
}
