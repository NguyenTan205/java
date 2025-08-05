import java.io.Serializable;
import java.text.DecimalFormat;

public abstract class Employee implements Serializable {
    private int id;
    private String name;
    private String birthday;
    private String address;
    private String email;
    private String phoneNumber;
    private String department;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, String address, String email, String phoneNumber, String department) {
        this.setId(id);
        this.setName(name);
        this.setBirthday(birthday);
        this.setAddress(address);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setDepartment(department);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#, ###");
        return "Nhân viên{" +
                "id: " + id +
                "| Họ và tên: '" + name + '\'' +
                "| Ngày sinh: '" + birthday + '\'' +
                "| Địa chỉ: '" + address + '\'' +
                "| Email: '" + email + '\'' +
                "| PhoneNumber: '" + phoneNumber + '\'' +
                "| Chức vụ: '" + department + '\'' +
                "| Lương: " + df.format(calculateSalary());
    }
}
