import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nguyên tố cần in ra: ");
        int numbers = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
