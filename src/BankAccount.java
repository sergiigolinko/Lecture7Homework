public class BankAccount {

    private String firstName;
    private String lastName;
    private char sex;
    private double value;
    private double limit;
    private boolean active;


    public BankAccount(String firstName, String lastName, char sex, double value, double limit, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.value = value;
        this.limit = limit;
        this.active = active;
    }

    public void printInfo() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(sex);
        System.out.println(limit);

    }

    public void printBalance() {
        System.out.println(value);

    }

    public void put(double amount) {
        System.out.println(+(value + amount));

    }

    public void withdraw(double amount) {
        System.out.println(+(value - amount));

    }

    public void block() {
        System.out.println("Your account is blocked!");

    }

    public void unblock() {
        System.out.println("Your account is unblocked!");

    }

    public boolean isActive() {
        return active;
    }
}