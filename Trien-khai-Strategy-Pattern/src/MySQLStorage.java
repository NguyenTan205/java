public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        // Giả lập lưu vào MySQL
        System.out.println("Kết nối MySQL...");
        System.out.println("INSERT INTO users (name, email) VALUES ('"
                + user.getName() + "', '" + user.getEmail() + "')");
    }
}
