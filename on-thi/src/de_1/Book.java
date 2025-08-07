package de_1;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(int id, String title, String author, double price) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String formatPrice(double price) {
        DecimalFormat df = new DecimalFormat("#, ###");
        return df.format(price);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "| title: " + title +
                "| author: " + author +
                "| price: " + formatPrice(price);
    }
}
