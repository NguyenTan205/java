public class MovablePointTest {
    public static void main(String[] args) {
        // diem ban dau
        MovablePoint point = new MovablePoint(1,1,1,1);
        System.out.println(point);
        // diem sau khi di chuyen
        point.move();
        System.out.println(point);

    }
}
