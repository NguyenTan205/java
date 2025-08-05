import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        EmployeeRepository repository = new FileEmployeeRepository();
        EmployeeService service = new EmployeeService(repository);
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("-----------Welcome to Employee Manager----------");
            System.out.println("1. Hiển thị toàn bộ nhân viên");
            System.out.println("2. Thêm nhân viên FullTime mới");
            System.out.println("3. Thêm nhân viên PartTime mới");
            System.out.println("4. Cập nhật dữ liệu nhân viên");
            System.out.println("5. Xoá Nhân viên");
            System.out.println("6. Tìm kiếm nhân viên theo ID");
            System.out.println("7. Xếp thứ tự nhân viên theo mức lương giảm dần");
            System.out.println("8. Tổng số lương của nhân viên");
            System.out.println("0. Thoát chương trình");
            System.out.println("------------------------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");

            // Kiểm tra input nhập vào có hợp lệ không
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Bạn chưa nhập gì. Vui lòng nhập lựa chọn của bạn!!!");
                continue;
            }
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn của bạn không hợp lệ !!!");
                continue;
            }

            // xây dựng các case
            switch (choice) {
                case 1:
                    System.out.println("Danh sách nhân viên: ");
                    service.displayAllEmployees();
                    break;
                case 2:
                    service.addEmployee(EmployeeInput.inputFullTimeEmployee(sc));
                    break;
                case 3:
                    service.addEmployee(EmployeeInput.inputPartTimeEmployee(sc));
                    break;
                case 4:
                    System.out.println("Nhập ID của nhân viên muốn cập nhật: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    service.updateEmployee(updateId, sc);
                    break;
                case 5:
                    System.out.println("Nhập ID của nhân viên muốn xoá: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    service.deleteEmployee(deleteId, sc);
                    break;
                case 6:
                    System.out.println("Nhập ID nhân viên muốn tìm kiếm: ");
                    int findId = Integer.parseInt(sc.nextLine());
                    service.findEmployeeById(findId);
                    break;
                case 7:
                    System.out.println("Danh sách sắp xếp lương theo thứ tự giảm dần: ");
                    service.sortEmployeesBySalaryDesc();
                    service.displayAllEmployees();
                    break;
                case 8:
                    System.out.println("Tổng số lương nhân viên của công ty là: " + String.format("%,.0f", service.calculateTotalSalary()));
                    break;
                case 0:
                    System.out.println("Bạn có chắc muốn thoát? (Y/N): ");
                    String confirm = sc.nextLine().trim();
                    if (confirm.equalsIgnoreCase("Y"));
                    System.out.println("Thank you. See you again!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ !!!");
            }
        } while (choice != 0);
    }
}