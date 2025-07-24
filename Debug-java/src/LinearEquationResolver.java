import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Phuong trinh bac nhat co dang 'a * x + b = 0' Vui long nhap hang so: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: ");
        double a = sc.nextDouble();

        System.out.println("Nhap b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double result = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + result);
        } else {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
