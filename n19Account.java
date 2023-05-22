interface Account {
    void set(String accNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Person, Account {
    private String name;
    private String accNumber;
    private double balance;

    @Override
    public void set(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Customer Name: " + name);
    }

    public void calculateInterest() {
        double interest = balance * 0.05; // Assuming 5% interest rate
        System.out.println("Interest: " + interest);
    }

    class n19Account {
        public static void main(String[] args) {
            Customer customer = new Customer();
            customer.store("John Doe");
            customer.set("123456789", 5000.0);
            customer.disp();
            customer.display();
            customer.calculateInterest();
        }
    }
}