package InterfaceComparable;

public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius, boolean filled, String color) {
        super(radius, filled, color);
    }

    @Override
    public int compareTo(Circle o) {
        if (getRadius() > o.getRadius()){
            return -1;
        } else if (getRadius() < o.getRadius()){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
