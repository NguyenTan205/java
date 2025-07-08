import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // b1. khai bao mang
        System.out.println("Nhap vao so luong phan tu mang n: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("So nho nhat trong mang la: " + min);
    }
}
