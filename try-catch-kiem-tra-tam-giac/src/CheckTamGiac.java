import java.util.Scanner;

public class CheckTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ung dung nhap vao 3 canh cua tam giac: ");
        System.out.println("Nhap canh a: ");
        int a =  sc.nextInt();
        System.out.println("Nhap canh b: ");
        int b = sc.nextInt();
        System.out.println("Nhap canh c: ");
        int c = sc.nextInt();

        CheckTamGiac tamgiac = new CheckTamGiac();
        tamgiac.checBaCanh(a, b, c);
    }

    public void checBaCanh(int a, int b, int c){
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Cac canh phai lon hon 0.");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Tong 2 canh phai lon hon canh con lai");
            }
            System.out.println("Ba canh tao thanh 1 tam giac hop le");
        } catch (IllegalArgumentException e) {
            System.out.println("loi: " + e.getMessage());
        }
    }
}
