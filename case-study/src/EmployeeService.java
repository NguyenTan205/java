import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Service chỉ quản lí nghiệm vụ

public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Hiển thị nhân viên ra màn hình
    public void displayAllEmployees() {
        List<Employee> employeeList = repository.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // Thêm nhân viên
    public void addEmployee(Employee employee) {
        List<Employee> employeeList = repository.getAll();
        employeeList.add(employee);
        repository.saveEmployee(employeeList);
    }

    // Cập nhật dữ liệu nhân viên
    public void updateEmployee(int id, Scanner sc) {
        List<Employee> employeeList = repository.getAll();
        boolean found = false;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Đã tìm thấy nhân viên: " + employee);
                found = true;
                System.out.println("Nhập vào cập nhật họ tên nhân viên: ");
                String updateName = sc.nextLine();
                if (!updateName.trim().isEmpty()) {
                    employee.setName(updateName);
                }

                System.out.println("Nhập vào số điện thoại mới của nhân viên: ");
                String updatePhoneNumber = sc.nextLine();
                if (!updatePhoneNumber.trim().isEmpty()) {
                    employee.setPhoneNumber(updatePhoneNumber);
                }
                repository.saveEmployee(employeeList);
                System.out.println("Đã cập nhật thông tin của nhân viên.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy ID nhân viên.");
        }
    }

    // Xoá nhân viên
    public void deleteEmployee(int id, Scanner sc) {
        List<Employee> employeeList = repository.getAll();
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Đã tìm thấy nhân viên muốn xoá: " + employee);
                System.out.print("Bạn có chắc muốn xóa? (Y/N): ");
                String confirm = sc.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    employeeList.remove(employee);
                    repository.saveEmployee(employeeList);
                    System.out.println("Đã xoá nhân viên !!!");
                } else {
                    System.out.println("Đã huỷ thao tác xoá !!!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với ID: " + id);
    }

    // Tìm kiếm nhân viên theo ID
    public void findEmployeeById(int id) {
        List<Employee> employeeList = repository.getAll();
        boolean found = false;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println("Đã tìm thấy nhân viên có ID: " + id + ": " + employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    // Sắp xếp nhân viên theo mức lương giảm dần
    public void sortEmployeesBySalaryDesc() {
        List<Employee> employeeList = repository.getAll();
        employeeList.sort(Comparator.comparingDouble(Employee::calculateSalary).reversed());
        repository.saveEmployee(employeeList);
    }

    // Tính tổng số tiền lương của nhân viên
    public double calculateTotalSalary() {
        List<Employee> employeeList = repository.getAll();
        double totalSalary = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            totalSalary += employeeList.get(i).calculateSalary();
        }
        return totalSalary;
    }
}
