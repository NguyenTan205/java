public class CircularQueue {
    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front = null;
    private Node rear = null;

    // Thêm phần tử vào cuối hàng đợi
    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = rear = newNode;
            rear.next = front; // tạo liên kết vòng
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // duy trì vòng
        }
    }

    // Lấy phần tử khỏi đầu hàng đợi
    public int deQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; // hoặc throw exception
        }

        int value;

        // chỉ còn một phần tử
        if (front == rear) {
            value = front.data;
            front = rear = null;
        } else {
            value = front.data;
            front = front.next;
            rear.next = front;
        }

        return value;
    }

    // In các phần tử trong hàng đợi
    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    // Kiểm tra rỗng
    public boolean isEmpty() {
        return front == null;
    }

    // Trả về giá trị đầu hàng đợi
    public int peek() {
        if (front == null) throw new RuntimeException("Queue is empty");
        return front.data;
    }

    // Main để test
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.displayQueue(); // Queue: 10 20 30

        System.out.println("Dequeue: " + queue.deQueue()); // 10
        queue.displayQueue(); // Queue: 20 30

        queue.enQueue(40);
        queue.displayQueue(); // Queue: 20 30 40

        System.out.println("Peek: " + queue.peek()); // 20
    }
}
