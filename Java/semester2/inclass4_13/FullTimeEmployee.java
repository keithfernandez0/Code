package semester2.inclass4_13;

public class FullTimeEmployee extends Employee {

    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee();
        FullTimeEmployee e2 = new FullTimeEmployee(40, "Abby Smith", 30);
    }

    public int workingHours;

    public FullTimeEmployee() {
        super();
        workingHours = 0;
    }

    public FullTimeEmployee(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int calculateSalary(int workingHours) {
        return paymentPerHour * workingHours;
    }
    
}
