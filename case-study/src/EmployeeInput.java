import java.util.Scanner;

public class EmployeeInput {
    public static EmployeeInfo inputEmPloyeeInfo(Scanner sc) {
        System.out.println("Nhập vào ID của nhân viên: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào họ tên nhân viên: ");
        String name = sc.nextLine();

        String birthday;
        do {
            System.out.println("Nhập vào ngày sinh của nhân viên: ");
            birthday = sc.nextLine();
            if (!Validator.isValidDate(birthday)) {
                System.out.println("Bạn nhập sai định dạng. Vui lòng nhập đúng định dạng XX-XX-XXXX");
            }
        } while (!Validator.isValidDate(birthday));

        System.out.println("Nhập vào địa chỉ của nhân viên: ");
        String address = sc.nextLine();

        String email;
        do {
            System.out.println("Nhập vào email của nhân viên: ");
            email = sc.nextLine();
            if (!Validator.isValidEmail(email)) {
                System.out.println("Bạn chưa nhập đúng định dạng email. Vui lòng nhập lại!!!");
            }
        } while (!Validator.isValidEmail(email));

        String phoneNumber;
        do {
            System.out.println("Nhập vào số điện thoại của nhân viên: ");
            phoneNumber = sc.nextLine();
            if (!Validator.isValidPhone(phoneNumber)) {
                System.out.println("Số điện thoại bạn nhập không hợp lệ! Phải bắt đầu bằng số 0 và có độ dài 10 - 11 chữ số.");
            }
        } while (!Validator.isValidPhone(phoneNumber));

        System.out.println("Nhập vào chức danh của nhân viên: ");
        String department = sc.nextLine();

        // Tạo một Employee "chung" để tạm giữ thông tin
        return new EmployeeInfo(id, name, birthday, address, email, phoneNumber, department);
    }

    public static FullTimeEmployee inputFullTimeEmployee(Scanner sc) {
        EmployeeInfo employeeInfo = inputEmPloyeeInfo(sc); // lấy thông tin chung
        System.out.println("Nhập vào lương cơ bản của nhân viên: ");
        double baseSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào tiền thưởng của nhân viên: ");
        double bonus = Double.parseDouble(sc.nextLine());

        return new FullTimeEmployee(employeeInfo.getId(), employeeInfo.getName(), employeeInfo.getBirthday(),
                employeeInfo.getAddress(), employeeInfo.getEmail(), employeeInfo.getPhoneNumber(),
                employeeInfo.getDepartment(), baseSalary, bonus);
    }

    public static PartTimeEmployee inputPartTimeEmployee(Scanner sc) {
        EmployeeInfo employeeInfo = inputEmPloyeeInfo(sc); // lấy thông tin chung
        System.out.println("Nhập vào tiền lương theo giờ của nhân viên: ");
        double hourlyRate = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số giờ làm việc của nhân viên: ");
        int hoursWorked = Integer.parseInt(sc.nextLine());

        return new PartTimeEmployee(employeeInfo.getId(), employeeInfo.getName(), employeeInfo.getBirthday(),
                employeeInfo.getAddress(), employeeInfo.getEmail(), employeeInfo.getPhoneNumber(),
                employeeInfo.getDepartment(), hourlyRate, hoursWorked);
    }
}
