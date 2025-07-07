import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interesta = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi: ");
        money = input.nextDouble();
        System.out.println("Nhập vào số tháng gửi: ");
        month = input.nextInt();
        System.out.println("Nhập vào lãi suất: ");
        interesta = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interesta / 100) / 12 * month;
        }
        System.out.println("Tổng số tiền lãi là: " + totalInterest);
    }
}
