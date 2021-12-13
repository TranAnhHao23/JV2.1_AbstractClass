package Colorable.main;

import Colorable.geometric.Circle;
import Colorable.geometric.Rectangle;
import Colorable.geometric.Shape;
import Colorable.geometric.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 10);
        shapes[2] = new Square(6);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println("Diện tích tam giác = ");
                System.out.println(((Circle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Square) {
                System.out.println("Diện tích hình vuông = ");
//                System.out.println("Hello em");?
                ((Square) shapes[i]).howToColor();
                System.out.println(((Square) shapes[i]).getArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println("Diện tích hình chữ nhật = ");
                System.out.println(((Rectangle) shapes[i]).getArea());
            }
        }
        System.out.println(shapes[2] instanceof Rectangle);
        ((Square) shapes[2]).howToColor();
    }
}
