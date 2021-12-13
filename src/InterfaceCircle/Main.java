package InterfaceCircle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle = new ComparableCircle[3];
        comparableCircle[0] = new ComparableCircle(2,true,"blue");
        comparableCircle[1] = new ComparableCircle(4,true,"red");
        comparableCircle[2] = new ComparableCircle(3,true,"green");
        for (ComparableCircle c: comparableCircle) {
            System.out.println(c);
        }

        System.out.println("Sau khi sort nó");
        Arrays.sort(comparableCircle);
        // Phải cần có câu lệnh để triển khai.
        for (ComparableCircle c: comparableCircle) {
            System.out.println(c);
        }

    }
}
