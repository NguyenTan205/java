public class EmployeeInfo {
    private int id;
    private String name;
    private String birthday;
    private String address;
    private String email;
    private String phoneNumber;
    private String department;

    public EmployeeInfo(int id, String name, String birthday, String address, String email, String phoneNumber, String department) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }
}
