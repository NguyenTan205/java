package de_2;

import java.io.Serializable;

public abstract class Item implements Serializable {
    private int id;
    private String title;
    private double price;

    public Item(int id, String title, double price) {
        this.setId(id);
        this.setTitle(title);
        this.setPrice(price);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getInfo();
}
