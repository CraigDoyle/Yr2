public class Circle extends Point {
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + " and radius is " + radius;
    }
}