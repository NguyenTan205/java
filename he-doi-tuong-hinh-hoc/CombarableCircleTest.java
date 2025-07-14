import java.util.Arrays;

public class CombarableCircleTest {
    public static void main(String[] args) {
        CombarableCircle [] circles = new CombarableCircle[3];
        circles [0] = new CombarableCircle(3.6);
        circles [1] = new CombarableCircle();
        circles [2] = new CombarableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (CombarableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (CombarableCircle circle : circles) {
            System.out.println(circle);
        }

    }
}
