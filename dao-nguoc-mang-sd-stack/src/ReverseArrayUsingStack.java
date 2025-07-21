import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Bước 1: Push từng phần tử mảng vào Stack
        for (int value : arr) {
            stack.push(value);
        }

        // Bước 2: Pop từng phần tử từ Stack vào lại mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Trước khi đảo:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        reverse(array);

        System.out.println("\nSau khi đảo:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

