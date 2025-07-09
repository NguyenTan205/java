import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao gia tri b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap vao gia tri c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();
        System.out.println("delta = " + delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("PT co 2 nghiem x1 = " + x1 + " x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("PT co nghiem kep x1 = x2 = " + x);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
