import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.print("Nhập số dòng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];

        // Nhập giá trị các phần tử trong ma trận
        System.out.println("Nhập các phần tử trong ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất và tọa độ
        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.printf("Phần tử lớn nhất là %.2f tại vị trí [%d][%d]%n", max, maxRow, maxCol);
    }
}
