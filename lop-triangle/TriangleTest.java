import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap side1: ");
        int side1 = input.nextInt();
        System.out.println("Nhap side2: ");
        int side2 = input.nextInt();
        System.out.println("Nhap side3: ");
        int side3 = input.nextInt();

        if (side1 + side2 > side3 && side1 + side2 > side3 && side2 + side3 > side3) {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle);
        } else {
            System.out.println("Vui long nhap dung kich thuoc 3 canh cua 1 tam giac");
        }
    }
}
