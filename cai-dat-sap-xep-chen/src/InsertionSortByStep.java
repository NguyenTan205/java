import java.util.Scanner;

public class InsertionSortByStep {
    // nhap vao 1 mang
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Nhap vao gia tri phan tu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Chuoi nhap vao la: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Bat dau sap xep: ");
        insertionSortByStep(arr);
    }

    // them phuong thuc sap xep chen
    public static void insertionSortByStep(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x =  arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos -1]) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }

        System.out.println("Danh sach sau khi xep: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
