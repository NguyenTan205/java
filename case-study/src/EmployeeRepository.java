import java.util.List;

// Interface định nghĩa hành vi lưu trữ
public interface EmployeeRepository {
    List<Employee> getAll();
    void saveEmployee(List<Employee> employees);
}
