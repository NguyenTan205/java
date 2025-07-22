public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>("A");
        list.addLast("B");
        list.addLast("C");
        list.addFirst("Start");
        list.add(2, "Middle");

        System.out.println("Danh sách ban đầu:");
        list.printList();

        System.out.println("Phần tử ở index 2: " + list.get(2));

        list.remove("Middle");
        System.out.println("Sau khi xóa phần tử 'Middle':");
        list.printList();

        list.remove(0);
        System.out.println("Sau khi xóa phần tử ở index 0:");
        list.printList();

        System.out.println("Chứa phần tử C? " + list.contains("C"));
        System.out.println("Index của phần tử B: " + list.indexOf("B"));

        System.out.println("Sao chép danh sách:");
        MyLinkedList<String> clonedList = list.clone();
        clonedList.printList();
    }
}

