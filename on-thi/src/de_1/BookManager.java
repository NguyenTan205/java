package de_1;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static de_1.Book.formatPrice;

public class BookManager {
    List<Book> bookList = new ArrayList<>();

    // addBook
    public void addBook(Book book) {
        bookList.add(book);
    }

    // displayBooks
    public void displayBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    // findBookById
    public Book findBookById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // updateBookById
    public boolean updateBook(int id, double newPrice) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                book.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    // deleteBook
    public boolean deleteBook(int id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    // SearchByTitle
    public List<Book> searchByTitle(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // sortByPriceAsc
    public void sortByPriceAsc() {
        bookList.sort(Comparator.comparingDouble(Book::getPrice));
    }

    // writeBooksToFile
    public void writeBooksToFile(String filePath) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(bookList);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error writing books to file" + e.getMessage());
        }
    }

    // readBooksFromFile
    public void readBooksFromFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            bookList = new ArrayList<>();
            return;
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            bookList = (List<Book>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // writeBooksToFileCsv
    public void exportDataToFileCsv(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // ghi dòng tiêu đề
            writer.append("ID,Title,Author,Price\n");

            // ghi danh sách sách
            for (Book book : bookList) {
                writer.append(book.getId() + "," + book.getTitle() + "," + book.getAuthor() + "," + formatPrice(book.getPrice()) + "\n");
            }
            System.out.println("Xuất file CSV thành công!!!");
        } catch (IOException e) {
            System.err.println("Lỗi ghi file CSV" + e.getMessage());
        }
    }

    // readBooksFromFileCsv
    public List<Book> importDataFromFileCsv(String filePath) {
        List<Book> bookList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                // Bỏ qua dòng tiêu đề
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                // Tách dữ liệu theo dấu phẩy
                String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                if (fields.length == 4) {
                    int id = Integer.parseInt(fields[0].trim());
                    String title = fields[1].trim();
                    String author = fields[2].trim();
                    double price = Double.parseDouble(fields[3].trim());

                    Book book = new Book(id, title, author, price);
                    bookList.add(book);
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file CSV" + e.getMessage());
        }
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
