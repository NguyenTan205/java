//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Nguyen Van A", "a@example.com");

        // Lưu bằng XML
        UserController xmlController = new UserController(new XMLStorage());
        xmlController.store(user);

        System.out.println();

        // Lưu bằng MySQL
        UserController mysqlController = new UserController(new MySQLStorage());
        mysqlController.store(user);
    }
}