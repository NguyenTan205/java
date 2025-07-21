public class Main {
    public static void main(String[] args) {
        // tao doi duong manager
        ProductManager manager = new ProductManager();

        // them san pham
        manager.addProduct(new Product("Iphone 16promax", 001, 32_000_000));
        manager.addProduct(new Product("Iphone 16Pro", 002, 28_000_000));
        manager.addProduct(new Product("Iphone 16", 003, 23_000_000));

        // hien thi san pham
        System.out.println("Danh sach san pham: ");
        manager.displayProduct();
        System.out.println("---------------------");

        // sua san pham
        System.out.println("Sua san pham ID: 002 (thay doi gia tien)");
        manager.editProduct("Iphone 16pro", 002, 27_000_000);
        manager.displayProduct();
        System.out.println("---------------------");

        // xoa san pham
        System.out.println("Xoa san pham co ID: 002");
        manager.deleteProduct(002);
        manager.displayProduct();
        System.out.println("---------------------");

        // tim kiem theo ten san pham
        System.out.println("Tim kiem san pham Iphone 16promax");
        manager.seachProduct("iphone 16promax");
        manager.displayProduct();
        System.out.println("----------------------");

        // sap xep theo gia tang dan
        System.out.println("Sap xep theo gia tien tang dan");
        manager.sortByPriceAsc();
        manager.displayProduct();
        System.out.println("-----------------------");

        // sap xep theo gia giam dan
        System.out.println("Sap xep theo gia tien giam dan");
        manager.sortByPriceDesc();
        manager.displayProduct();
    }
}
