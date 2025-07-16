public class TriangleClassifier {
    public static String checkTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Khong phai la tam giac";
        }

        if(a + b > c && c + b > a && a + c > b) {
            if(a == b && a == c) {
                return "Tam Giac deu";
            } else if(a == b || a == c || b == c) {
                return "Tam Giac can";
            } else {
                return "Tam giac thuong";
            }
        } else {
            return "Khong phai la tam giac";
        }
    }
}
