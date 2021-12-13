package InterfaceComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2,true, "blue");
        circles[1] = new Circle(4,true,"red");
        circles[2] = new Circle(3,true,"green");

        for (Circle c: circles) {
            System.out.println(c);
        }

        ComparatorCircle comparatorCircles = new ComparatorCircle();
        System.out.println("Sau khi sort: ");
        Arrays.sort(circles,comparatorCircles);

        for (Circle c: circles) {
            System.out.println(c);
        }

    }
}
