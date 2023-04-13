package semester2.inclass4_13;

public class Employee {

    // Data fields
    protected String name;
    protected int paymentPerHour;

    // =================================================

    // Constructors
    public Employee() {};

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    // =================================================

    // Getters
    public String getName() {
        return name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    // =================================================

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    // =================================================

    public int calculateSalary(int workingHours) {
        return workingHours * paymentPerHour;
    }
    
}    
