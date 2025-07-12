import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String str = sc.nextLine();

        System.out.println("Nhap vao 1 ki tu: ");
        char kitu = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kitu) {
                count++;
            }
        }

        System.out.println("ki tu " + kitu + " xua hien " + count +" lan trong chuoi");
    }
}
