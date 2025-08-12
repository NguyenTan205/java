public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        // Giả lập lưu ra file XML
        System.out.println("Lưu user vào file XML:");
        System.out.println("<user>");
        System.out.println("    <name>" + user.getName() + "</name>");
        System.out.println("    <email>" + user.getEmail() + "</email>");
        System.out.println("</user>");
    }
}
