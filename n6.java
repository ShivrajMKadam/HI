//Write the following code in your editor below:
//A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
//A class named Adder that inherits from a superclass named Arithmetic. The main method in the Tester class should print the following:
// SAMPLE O/P:My superclass is: Arithmetic
//42 13 20

public class n6 {
    int add(int a, int b) {
        return a + b;
    }
}

class r extends n6 {
    // No need to explicitly define the add method since it's inherited from Arithmetic
}

class Tester {
    public static void main(String[] args) {
        r adder = new r();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        int num1 = 42;
        int num2 = 13;
        int sum = adder.add(num1, num2);

        System.out.println(num1 + " " + num2 + " " + sum);
    }

}
