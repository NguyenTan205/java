import java.text.DecimalFormat;

public class FullTimeEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    public FullTimeEmployee(int id, String name, String birthday, String address, String email, String phoneNumber, String department, double baseSalary, double bonus) {
        super(id, name, birthday, address, email, phoneNumber, department);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#, ###");
        return super.toString() + " (Full Time: Lương cơ bản = " + df.format(baseSalary) + ", " +
                "Thưởng = " + df.format(bonus) + ")}";
    }
}
