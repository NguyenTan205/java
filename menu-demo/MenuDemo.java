import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        System.out.println("---- Menu ----");
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Tim so nguyen to");
            System.out.println("2. Tim UCLN");
            System.out.println("0. Thoat");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Tim so nguyen to
                    // Vaong lap chay tu 2 den can bac 2 cua number
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhap vao 1 so nguyen: ");
                    int number = sc1.nextInt();
                    if (number < 2) {
                        System.out.println(" Khong phai la so nguyen to");
                    } else {
                        int i = 2;
                        boolean check = true;
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check) {
                            System.out.println(number + " la so nguyen to");
                        } else {
                            System.out.println(number + " Khong phai la so nguyen to");
                        }
                    }
                    break;
                case 2:
                    // Tim UCLN giai thuat Euclid
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Nhap vao 1 so nguyen: ");
                    int number2 = sc2.nextInt();
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Nhap vao 1 so nguyen: ");
                    int number3 = sc3.nextInt();
                    while (number3 != 0) {
                        int temp = number3;
                        number3 = number2 % number3;
                        number2 = temp;
                    }
                    System.out.println("UCLN la: " + number2);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh: ");
                    break;
            }
        } while (choice != 0);
    }
}
