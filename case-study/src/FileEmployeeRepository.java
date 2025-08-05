import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Triển khai lưu bằng file
public class FileEmployeeRepository implements EmployeeRepository {
    private static final String FILE_PATH = "employees.dat";

    // readEmployeesToFile
    @Override
    public List<Employee> getAll() {
        File file = new File(FILE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        if (!file.exists()) {
            return employeeList;
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            employeeList = (List<Employee>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    // writeEmployeeFromfile

    @Override
    public void saveEmployee(List<Employee> employees) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            oos.writeObject(employees);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error saving employees" + e.getMessage());
        }
    }
}
