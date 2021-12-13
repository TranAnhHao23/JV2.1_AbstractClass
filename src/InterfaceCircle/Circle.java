package InterfaceCircle;

public class Circle {
    private double radius;
    private boolean filled;
    private String color;

    public Circle() {
    }

    public Circle(double radius, boolean filled,String color) {
        this.radius = radius;
        this.filled = filled;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
