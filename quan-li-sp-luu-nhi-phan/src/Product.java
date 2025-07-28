import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String exportproducts;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, String exportproducts, String description) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setExportproducts(exportproducts);
        this.setDescription(description);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExportproducts() {
        return exportproducts;
    }

    public void setExportproducts(String exportproducts) {
        this.exportproducts = exportproducts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + "USD" +
                ", exportproducts='" + exportproducts + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
