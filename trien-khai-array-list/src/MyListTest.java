public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        // Thêm phần tử
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");
        System.out.println("Danh sách sau khi thêm: ");
        printList(myList);

        // Thêm vào vị trí cụ thể
        myList.add(1, "JavaScript");
        System.out.println("\nSau khi thêm 'JavaScript' vào vị trí 1: ");
        printList(myList);

        // Lấy phần tử tại vị trí
        System.out.println("\nPhần tử tại vị trí 2: " + myList.get(2));

        // Xoá phần tử
        myList.remove(0);
        System.out.println("\nSau khi xoá phần tử ở vị trí 0: ");
        printList(myList);

        // Kiểm tra contains
        System.out.println("\nDanh sách có chứa 'Python'? " + myList.contains("Python"));

        // indexOf
        System.out.println("Vị trí của 'C++': " + myList.indexOf("C++"));

        // Kích thước
        System.out.println("Số phần tử hiện tại: " + myList.size());

        // Clone
        MyList<String> clonedList = (MyList<String>) myList.clone();
        System.out.println("\nDanh sách clone:");
        printList(clonedList);

        // Clear
        myList.clear();
        System.out.println("\nDanh sách sau khi clear:");
        printList(myList);
    }

    private static void printList(MyList<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

