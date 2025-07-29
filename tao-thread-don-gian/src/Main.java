//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Tạo 2 đối tượng NumberGenerator
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 Thread, truyền vào các đối tượng Runnable
        Thread thread1 = new Thread(generator1, "Thread 1");
        Thread thread2 = new Thread(generator2, "Thread 2");

        // Gọi start để chạy cả 2 thread
        thread1.start();
        thread2.start();
    }
}