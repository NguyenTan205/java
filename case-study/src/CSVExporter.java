import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

public class CSVExporter implements Exporter {

    @Override
    public void exportData(List<Employee> employeeList, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.append("ID, Họ và tên, Ngày sinh, Địa chỉ, Email, Phone number, Chức vụ, Lương\n");
            DecimalFormat df = new DecimalFormat("#, ###");
            for (Employee employee : employeeList) {
                writer.append(employee.getId() + "," + employee.getName() + "," + employee.getBirthday() +
                        "," + employee.getAddress() + "," + employee.getEmail() + "," + employee.getPhoneNumber()
                        + "," + employee.getDepartment() + "," + df.format(employee.calculateSalary()) +"\n");
            }

            // Ghi dữ liệu và đóng file
            writer.flush(); // Đảm bảo dữ liệu được ghi hết
            writer.close(); // Đóng file để tránh lỗi
            System.out.println("Xuất CSV thành công!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
