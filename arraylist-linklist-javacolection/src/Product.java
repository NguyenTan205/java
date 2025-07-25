public class Product {
    private String name;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String name, int id, double price) {
        this.setName(name);
        this.setId(id);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + ", id=" + id + ", price=" + price + '}';
    }
}
