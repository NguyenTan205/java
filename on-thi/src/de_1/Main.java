package de_1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner sc = new Scanner(System.in);
        String filePathDat = "books.dat";
        String filePathCsv = "books.csv";
        int choice = -1;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tiêu đề");
            System.out.println("4. Sắp xếp sách theo giá tăng dần");
            System.out.println("5. Ghi danh sách ra file nhị phân");
            System.out.println("6. Đọc danh sách từ file nhị phân");
            System.out.println("7. Ghi danh sách ra file CSV");
            System.out.println("8. Đọc danh sách từ file CSV");
            System.out.println("9. Xoá sách theo ID");
            System.out.println("10. Cập nhật sách theo ID");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");

            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Bạn chưa nhập gì cả!");
                continue;
            }
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Nhập không hợp lệ");
                continue;
            }
            switch (choice) {
                case 1:
                    int id;
                    while (true) {
                        try {
                            System.out.println("Nhập vào ID sách: ");
                            id = Integer.parseInt(sc.nextLine());
                            if (manager.findBookById(id) != null) {
                                System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("ID không hợp lệ. Vui lòng nhập số nguyên.");
                        }
                    }

                    System.out.println("Nhập vào title: ");
                    String title = sc.nextLine();
                    System.out.println("Nhập vào tác giả: ");
                    String author = sc.nextLine();
                    System.out.println("Nhập vào giá sách: ");
                    double price = Double.parseDouble(sc.nextLine());

                    Book book = new Book(id, title, author, price);
                    manager.addBook(book);
                    break;
                case 2:
                    if (manager.getBookList().isEmpty()) {
                        System.out.println("Danh sách sách đang trống.");
                    } else {
                        System.out.println("Danh sách sách: ");
                        manager.displayBooks();
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào tiêu đề sách cần tìm: ");
                    String keyword = sc.nextLine();
                    List<Book> result = manager.searchByTitle(keyword);
                    if (result.isEmpty()) {
                        System.out.println("Không tìm thấy sách nào.");
                    } else {
                        for (Book bookList : result) {
                            System.out.println(bookList);
                        }
                    }
                    break;
                case 4:
                    manager.sortByPriceAsc();
                    System.out.println("Danh sách sách theo thứ tự tăng dần: ");
                    manager.displayBooks();
                    break;
                case 5:
                    manager.writeBooksToFile(filePathDat);
                    break;
                case 6:
                    manager.readBooksFromFile(filePathDat);
                    System.out.println("Danh sách sau khi đọc từ file: ");
                    manager.displayBooks();
                    break;
                case 7:
                    manager.exportDataToFileCsv(filePathCsv);
                    break;
                case 8:
                    List<Book> importedBooks = manager.importDataFromFileCsv(filePathCsv);
                    manager.setBookList(importedBooks); // ✅ Gán danh sách mới vào manager
                    System.out.println("Danh sách sau khi đọc file CSV: ");
                    manager.displayBooks();
                    break;
                case 9:
                    System.out.println("Nhập vào ID sách muốn xoá: ");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    Book bookToDelete = manager.findBookById(deleteId);
                    if (bookToDelete == null) {
                        System.out.println("Không tìm thấy sách với ID: " + deleteId);
                        break;
                    }

                    System.out.println("Đã tìm thấy sách muốn xoá: " + bookToDelete);
                    System.out.println("Bạn có chắc chắn muốn xoá? (Y/N): ");
                    String confirm = sc.nextLine().trim();
                    if (confirm.equalsIgnoreCase("Y")) {
                        boolean deleted = manager.deleteBook(deleteId);
                        if (deleted) {
                            System.out.println("Đã xoá thành công.");
                        }
                    } else {
                        System.out.println("Đã huỷ thao tác xoá");
                    }
                    break;
                case 10:
                    System.out.println("Nhập vào ID sách muốn cập nhật: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    Book bookToUpdate = manager.findBookById(updateId);
                    if (bookToUpdate == null) {
                        System.out.println("Không tìm thấy sách với ID: " + updateId);
                        break;
                    }

                    System.out.println("Đã tìm thấy sách muốn cập nhật: " + bookToUpdate);
                    System.out.println("Nhập vào giá mới cuốn sách: ");
                    double updatePrice = Double.parseDouble(sc.nextLine());
                    boolean updated = manager.updateBook(updateId, updatePrice);
                    if (updated) {
                        System.out.println("Cập nhật sách thành công!!!");
                    } else {
                        System.out.println("Cập nhật sách thất bại");
                    }
                    break;
                case 0:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }
}
