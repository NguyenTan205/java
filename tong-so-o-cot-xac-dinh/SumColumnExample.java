public class SumColumnExample {
    public static void main(String[] args) {
        // Khởi tạo nhanh mảng 2 chiều
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhập chỉ số cột cần tính tổng (bắt đầu từ 0): ");
        int col = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Kiểm tra nếu cột nằm ngoài giới hạn mảng
            if (col < matrix[i].length) {
                sum += matrix[i][col];
            } else {
                System.out.println("Chỉ số cột vượt quá số cột trong hàng " + i);
            }
        }

        System.out.println("Tổng của cột " + col + " là: " + sum);
    }
}

