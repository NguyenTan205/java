public class Main {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo ma trận vuông sẵn có
        double[][] matrix = {
                {1.5, 2.0, 3.5},
                {4.0, 5.5, 6.0},
                {7.2, 8.1, 9.3}
        };

        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];  // các phần tử [0][0], [1][1], [2][2], ...
        }

        System.out.println("Tổng đường chéo chính là: " + sum);
    }
}

