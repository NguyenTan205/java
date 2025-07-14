import java.util.Random;

public class ResizebleTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes[0] = new Rectangle(4.0, 6.0);
        shapes[1] = new Circle(5.0);

        Random rand = new Random();

        for (Shape shape : shapes) {
            System.out.println("Truoc khi resize: " + shape);

            if (shape instanceof Resizeble) {
                double percent = rand.nextInt(100) + 1; // 1% đến 100%
                System.out.println("Resize với " + percent + "%");
                ((Resizeble) shape).resize(percent);
            }

            System.out.println("Sau khi resize: " + shape);
            System.out.println("------------------------------");
        }
    }
}
