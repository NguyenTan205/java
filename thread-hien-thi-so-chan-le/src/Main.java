//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        OddThread oddThread = new OddThread(lock);
        EvenThread evenThread = new EvenThread(lock);

        oddThread.start();
        evenThread.start();
    }
}