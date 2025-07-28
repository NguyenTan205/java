import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    // tao file luu du lieu san pham
    private static final String FILE_PATH = "products.dat";

    // tao phuong thuc them san pham
    public static void addProduct(Product product) {
        List <Product> productList = readProductsFromFile();
        productList.add(product);
        writeProductsToFile(productList);
    }

    // tao phuong thuc readProductsFromFile
    public static List<Product> readProductsFromFile() {
        List<Product> productList = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            // File chưa tồn tại hoặc rỗng → trả về danh sách rỗng
        }
        return productList;
    }

    // tao phuong thuc writeProductsToFile
    public static void writeProductsToFile(List<Product> products) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    // tao phuong thuc hien thi san pham
    public void displayAllProducts() {
        List <Product> products = readProductsFromFile();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // tao phuong thuc tim kiem
    public void searchProductById(int id) {
        List <Product> products = readProductsFromFile();
        boolean found = false;
        for (Product product : products) {
            if(product.getId() == id) {
                System.out.println("found" + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found with ID: " + id);
        }
    }
}
