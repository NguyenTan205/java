import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc  = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------PRODUCT MANAGER MENU------");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Search product by ID");
            System.out.println("0. Thoat chương trình");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

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
                    int searchid = sc.nextInt();
                    manager.searchProductById(searchid);
                    break;
                case 0:
                    System.out.println("Thank you for using our application");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ !!!");
            }
        } while (choice != 0);
    }
}
