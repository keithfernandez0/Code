package semester2.inclass4_13;

public class Contractor extends Employee {

    public static void main(String[] args) {
        Contractor c1 = new Contractor();
        Contractor c2 = new Contractor(40, "Johnny Appleseed", 25);
    }
    
    public int workingHours;

    // Constructors
    public Contractor() {
        super();
        workingHours = 0;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public Contractor(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int calculateSalary(int workingHours) {
        return paymentPerHour * workingHours;
    }
}
