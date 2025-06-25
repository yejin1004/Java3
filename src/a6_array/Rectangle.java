package a6_array;

public class Rectangle {
    double width; // 너비
    double height; // 높이
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() { // 면적
        return this.width * this.height;
    }
    public double getPerimeter() { // 둘레
        return 2 * (this.width + this.height);
    }
}
