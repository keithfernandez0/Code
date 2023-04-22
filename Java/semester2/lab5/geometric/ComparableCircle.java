public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    // ==========================================================

    @Override
    public int compareTo(ComparableCircle other) {
        if (this.getRadius() > other.getRadius()) {
            return 1;
        } else if (this.getRadius() < other.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
