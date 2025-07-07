import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        System.out.println("-----Menu-----");
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác cân");
            System.out.printf("0. Thoát chương trình");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int height = 5; // chiều cao của tam giác

                    for (int i = 1; i <= height; i++) { // vòng lặp ngoài: duyệt qua từng dòng
                        // Vòng lặp 1: In khoảng trắng
                        for (int j = 1; j <= (height - i); j++) {
                            System.out.print(" ");
                        }
                        // Vòng lặp 2: In dấu *
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        // Xuống dòng sau khi in xong 1 hàng
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
            }
        } while (choice != 0);
    }
}
