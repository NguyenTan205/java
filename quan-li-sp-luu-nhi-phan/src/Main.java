import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc  = new Scanner(System.in);
        int choice = -1;

        while (true) {
            System.out.println("------PRODUCT MANAGER MENU------");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Search product by ID");
            System.out.println("4. Delete product by ID");
            System.out.println("0. Thoat chương trình");
            System.out.println("Nhập lựa chọn của bạn: ");

            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Bạn chưa nhập gì cả. Vui lòng nhập lại.");
                continue;
            }

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter product ID");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter product name");
                    String name = sc.nextLine();
                    System.out.println("Enter product price");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter product exportproducts");
                    String exportproducts = sc.nextLine();
                    System.out.println("Enter product description");
                    String description = sc.nextLine();

                    Product product = new Product(id, name, price, exportproducts, description);
                    manager.addProduct(product);
                    break;
                case 2:
                    manager.displayAllProducts();
                    break;
                case 3:
                    System.out.println("Enter product ID to search: ");
                    int searchId = Integer.parseInt(sc.nextLine());
                    manager.searchProductById(searchId);
                    break;
                case 4:
                    System.out.println("Enter product ID to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    manager.deleteProductById(deleteId);
                    break;
                case 0:
                    System.out.println("Thank you for using our application");
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ !!!");
            }
        }
    }
}
