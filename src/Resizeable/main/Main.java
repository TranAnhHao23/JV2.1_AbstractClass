package Resizeable.main;

import Resizeable.geometric.Circle;
import Resizeable.geometric.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 7);
//        Shape shape = new Shape("red", true);

        System.out.println("Diện tích trước thay đổi: ");
        System.out.println("Diện tích hình tròn = " + circle.getArea());
        System.out.println("Diện tích hình chữ nhật = " + rectangle.getArea());

        System.out.println("Diện tích sau thay đổi: ");
        circle.resize(Math.random()*100);
        rectangle.resize(Math.random()*100);
    }
}
