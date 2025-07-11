public class Cylinder extends Circle {
    private double height;

    public Cylinder () {

    }

    public Cylinder (double radius, String color, double height) {
        setRadius(radius);
        setColor(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTheTich() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder with heigh="
                + getHeight()
                + " with the tich="
                + getTheTich()
                + ", which is a subclass of "
                + super.toString();
    }
}
