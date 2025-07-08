import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        // b1. Tao 2 mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Nhap so luong phan tu mang 2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < m; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = sc.nextInt();
        }

        // b2. tao mang 3
        int[] arr3 = new int[m + n];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = n, j = 0; i < arr3.length; i++, j++) {
            arr3[i] = arr2[j];
        }

        // b3. in ra mang arr 3
        System.out.println("Mang 3 sau khi cong 2 mang: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
