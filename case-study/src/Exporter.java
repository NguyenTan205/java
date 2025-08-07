import java.util.List;

public interface Exporter {
    void exportData(List<Employee> employeeList, String filePath);
}
