package de_2;

public class Book extends Item implements Discountable {
    private String author;

    public Book(int id, String title, double price, String author) {
        super(id, title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.9;
    }

    @Override
    public String getInfo() {
        return String.format("ID: " + getId() + "Title: " + getTitle() + "Author: " + getAuthor()
                + "Price: " + getPrice() + "Discounted Price: " + getDiscountedPrice());
    }
}
