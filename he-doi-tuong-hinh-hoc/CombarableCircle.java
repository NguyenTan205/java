public class CombarableCircle extends Circle
        implements Comparable<CombarableCircle> {

    public CombarableCircle () {

    }

    public CombarableCircle (double radius) {
        super(radius);
    }

    public CombarableCircle (double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(CombarableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
