import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("-----Menu-----");
            System.out.println("1. fahrenheitToCelsius");
            System.out.println("2. celsiusToFahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celcius = sc.nextDouble();
                    System.out.println("Celcius to Fahrenheit: " + celsiusToFahrenheit(celcius));
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");;
            }
        } while (choice != 0);

    }

    // xay dung phuong thuc do c sang do F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    // xay dung phuong thuc do F sang do C
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
