package InterfaceComparator;

import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<Circle> {

    public ComparatorCircle() {
    }

    public ComparatorCircle(double radius, boolean filled, String color) {
        super(radius, filled, color);
    }

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() < o2.getRadius()){
            return -1;
        } else if (o1.getRadius() > o2.getRadius()){
            return 1;
        } else {
            return 0;
        }
    }
}
