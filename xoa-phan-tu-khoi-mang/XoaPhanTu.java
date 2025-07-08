import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bước 1: Khai báo và khởi tạo mảng
        System.out.print("Nhập số lượng phần tử N: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xóa X: ");
        int X = sc.nextInt();

        // Bước 3: Tìm vị trí X trong mảng
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử " + X + " trong mảng.");
        } else {
            // Bước 4: Xoá phần tử bằng cách dịch trái
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--; // Giảm kích thước logic của mảng

            // Bước 5: In mảng sau khi xoá
            System.out.println("Mảng sau khi xoá phần tử " + X + ":");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}