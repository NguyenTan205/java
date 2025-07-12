import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước ma trận vuông
        System.out.print("Nhập kích thước ma trận vuông (n): ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        // Nhập các phần tử cho ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Phần tử tại [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tính tổng đường chéo chính
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // Hiển thị kết quả
        System.out.println("Tổng của đường chéo chính là: " + sum);
    }
}

