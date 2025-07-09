public class MaxElementInMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.2, 5.6, 3.1},
                {9.8, 2.4, 7.7},
                {4.2, 6.5, 0.9}
        };

        double max = matrix[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.printf("Phần tử lớn nhất là %.2f tại vị trí [%d][%d]%n", max, row, col);
    }
}


