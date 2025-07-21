import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    // khai bao arraylist
    private ArrayList<Product> productList = new ArrayList<>();

    // them san pham
    public void addProduct(Product product) {
        productList.add(product);
    }

    // sua san pham
    public void editProduct(String newName, int id, double newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Khong tim thay san pham voi ID: " + id);
    }

    // xoa san pham
    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    // hien thi danh danh san pham
    public void displayProduct () {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    // tim kiem theo ten
    public void seachProduct(String keyword) {
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    // Sap xep theo gia tang dan
    public void sortByPriceAsc() {
        productList.sort(Comparator.comparingDouble(Product::getPrice)); // tạo một comparator dùng để so sánh kiểu double.
    }

    // Sap xep theo thu tu giam dan
    public void sortByPriceDesc() {
        productList.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}
