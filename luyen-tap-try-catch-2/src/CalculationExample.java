import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap y: ");
        int y = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    public void calculate(int x, int y) {
        try {
            int sum = x + y;
            int rest = x - y;
            int div = x / y;
            int mul = x * y;
            System.out.println("Tong x + y = " + sum);
            System.out.println("Hieu x - y = " + rest);
            System.out.println("Thuong x / y = " + div);
            System.out.println("Tich x * y = " + mul);
        } catch (Exception e) {
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
