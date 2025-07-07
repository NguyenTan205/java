import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a  = sc1.nextInt();
        System.out.println("Nhap vao so b: ");
        int b  = sc1.nextInt();
        // Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Vui long nhap so hop le a, b khac 0!");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("UCLN la: " + a);
    }
}
