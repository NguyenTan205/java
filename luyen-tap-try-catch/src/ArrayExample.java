import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer [] createRandom() {
        Random rd =  new Random();
        Integer [] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua 1 phan tu bat ki: ");
        int x = sc.nextInt();

        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Chi so vuot qua gioi han cua mang");
        }
    }
}


