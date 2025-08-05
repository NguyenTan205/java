import java.text.DecimalFormat;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, String birthday, String address, String email, String phoneNumber, String department, double hourlyRate, int hoursWorked) {
        super(id, name, birthday, address, email, phoneNumber, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#, ###");
        return super.toString() + " (Part Time: hourlyRate = " + df.format(hourlyRate) +
                ", hoursWorked = " + hoursWorked + "h)}";
    }
}
