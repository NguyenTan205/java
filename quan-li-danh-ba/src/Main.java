import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Phương thức kiểm tra email, số diện thoại hợp lệ
    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("^0\\d{9,10}$");
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("======MENU======");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("0. Thoát chương trình");
            System.out.println("================");
            System.out.println("Nhập lựa chọn của bọn");

            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Bạn chưa nhập gì cả!! Vui lòng nhập lại!!!");
                continue;
            }
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ !!!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Danh bạ: ");
                    manager.displayAllContacts();
                    break;
                case 2:
                    String phoneNumber;
                    do {
                        System.out.println("Vui lòng nhập số điện thoại: ");
                        phoneNumber = sc.nextLine();
                        if (!isValidPhone(phoneNumber)) {
                            System.out.println("Số điện thoại bạn nhập không hợp lệ! Phải bắt đầu bằng số 0 và có độ dài 10 - 11 chữ số.");
                        }
                    } while (!isValidPhone(phoneNumber));

                    System.out.println("Vui lòng nhập họ tên: ");
                    String name = sc.nextLine();

                    String email;
                    do {
                        System.out.println("Vui lòng nhập email: ");
                        email = sc.nextLine();
                        if (!isValidEmail(email)) {
                            System.out.println("Email không hợp lệ! Vui lòng nhập đúng định dạng (ví dụ: a@gmail.com");
                        }
                    } while (!isValidEmail(email));

                    manager.addContact(new Contact(phoneNumber, name, email));
                    break;
                case 3:
                    System.out.println("Nhập số điện thoại cần cập nhật: ");
                    String updatePhone = sc.nextLine();

                    List<Contact> contactList = manager.readContactsFromFile();
                    boolean found = false;

                    for (Contact contact : contactList) {
                        if (contact.getPhoneNumber().equals(updatePhone)) {
                            found = true;

                            System.out.println("Nhập tên mới: ");
                            String updateName = sc.nextLine();
                            if (!updateName.trim().isEmpty()) {
                                contact.setName(updateName);
                            }

                            System.out.println("Nhập email mới: ");
                            String updateEmail = sc.nextLine();
                            if (!updateEmail.trim().isEmpty()) {
                                contact.setEmail(updateEmail);
                            }
                            manager.updateContact(contact);
                            System.out.println("Đã cập nhật thông tin");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy số điện thoại trong danh bạ!!!");
                    }

                    break;
                case 4:
                    System.out.println("Nhập số điện thoại cần xoá: ");
                    String deletePhoneNumber = sc.nextLine();

                    List<Contact> contacts = manager.readContactsFromFile();
                    boolean deleted = false;

                    for (Contact contact : contacts) {
                        if (contact.getPhoneNumber().equals(deletePhoneNumber)) {
                            System.out.println("Tìm thấy liên hệ: " + contact);
                            System.out.println("Bạn có chắc muốn xóa? (Y/N)");
                            String confirm = sc.nextLine();
                            if (confirm.equalsIgnoreCase("Y")) {
                                manager.deleteContact(deletePhoneNumber);
                                System.out.println("Đã xoá liên hệ");
                            } else {
                                System.out.println("Đã huỷ thao tác xoá");
                            }
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Không tìm thấy số điện thoại trong danh bạ!!!");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên muốn tìm kiếm: ");
                    String searchName = sc.nextLine();
                    manager.searchContact(searchName);
                    break;
                case 0:
                    System.out.println("Thank you!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
            }
        } while (choice != 0);
    }
}