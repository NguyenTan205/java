import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        width = scanner.nextFloat(); // nhap chieu rong
        System.out.println("Enter height");
        height = scanner.nextFloat(); // nhap chieu cao

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
