import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // b1: Khoi tao mang
        System.out.println("Nhap vao so luong phan tu n: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        // b2: Nhap x so can chen
        System.out.println("Nhap phan tu can chen: ");
        int number = sc.nextInt();
        // b3. Nhap vao vi tri can chen
        System.out.println("Nhap vi tri muon chen phan tu: ");
        int index_chen = sc.nextInt();
        // b4. Kiem tra vi tri hop le
        if (index_chen <= -1 || index_chen >= n - 1) {
            System.out.println("Vui long nhap dung vi tri: ");
        } else {
            // tao mang moi co kich thuoc lon hon 1
            int[] newArray = new int[n + 1];

            for (int i = 0; i < index_chen; i++) {
                newArray[i] = array[i];
            }
            newArray[index_chen] = number;
            for (int i = index_chen; i < n; i++) {
                newArray[i + 1] = array[i];
            }
            // b5// in mang sau khi chen
            System.out.println("Mang sau khi chen: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }
    }
}
