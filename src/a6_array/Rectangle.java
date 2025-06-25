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
    public void resize(double[] nums) {
        // double형 배열을 매개변수로 받음
        // 매개변수 nums[0]은 width, nums[1]는 height로 설정하는 메서드
        this.width = nums[0];
        this.height = nums[1];
        // 반환형이 void 이므로 return 없음
    }
}
