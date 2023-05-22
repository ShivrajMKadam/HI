//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and
// in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an
// abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name
// which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters
// and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the
// percentage of marks for both the students.

abstract class n5 {

        abstract double getPercentage();
    }

    class A extends n5 {
        private double subject1Marks;
        private double subject2Marks;
        private double subject3Marks;

        A(double subject1Marks, double subject2Marks, double subject3Marks) {
            this.subject1Marks = subject1Marks;
            this.subject2Marks = subject2Marks;
            this.subject3Marks = subject3Marks;
        }

        @Override
        double getPercentage() {
            double totalMarks = subject1Marks + subject2Marks + subject3Marks;
            return (totalMarks / 300) * 100;
        }
    }

    class B extends n5 {
        private double subject1Marks;
        private double subject2Marks;
        private double subject3Marks;
        private double subject4Marks;

        B(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
            this.subject1Marks = subject1Marks;
            this.subject2Marks = subject2Marks;
            this.subject3Marks = subject3Marks;
            this.subject4Marks = subject4Marks;
        }

        @Override
        double getPercentage() {
            double totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
            return (totalMarks / 400) * 100;
        }
    }

    class new1 {
        public static void main(String[] args) {
            A studentA = new A(80, 90, 95);
            B studentB = new B(70, 85, 90, 75);

            System.out.println("Student A's percentage: " + studentA.getPercentage() + "%");
            System.out.println("Student B's percentage: " + studentB.getPercentage() + "%");
        }
    }


