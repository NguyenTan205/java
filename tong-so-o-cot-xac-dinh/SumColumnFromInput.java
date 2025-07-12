import java.util.Scanner;

public class SumColumnFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Nhập từng phần tử của mảng
        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử tại [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Nhập chỉ số cột cần tính tổng
        System.out.print("Nhập chỉ số cột cần tính tổng (0 đến " + (cols - 1) + "): ");
        int col = scanner.nextInt();

        // Kiểm tra chỉ số cột hợp lệ
        if (col < 0 || col >= cols) {
            System.out.println("Chỉ số cột không hợp lệ!");
            return;
        }

        // Tính tổng
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][col];
        }

        System.out.println("Tổng của cột " + col + " là: " + sum);
    }
}

