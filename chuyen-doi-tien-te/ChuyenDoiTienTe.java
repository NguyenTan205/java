import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 26000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gia tri VND: " + quydoi);
    }
}
