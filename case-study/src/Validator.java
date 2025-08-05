// Lớp kiểm tra dữ liệu nhập vào

public class Validator {
    // Phương thức kiểm tra email, số điện thoại, ngày tháng hợp lệ
    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("^(0[3|5|7|8|9])+([0-9]{8})$");
    }

    public static boolean isValidDate(String date) {
        return date.matches("^\\d{2}-\\d{2}-\\d{4}$");
    }
}
