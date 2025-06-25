package a6_array;

public class MyClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        double area = r.getArea();
        System.out.println("면적은 " + area); // 6
        double perimeter = r.getPerimeter();
        System.out.println("둘레는 " + perimeter); // 10
        // 크기 재설정
        r.resize(new double[] {4,5}); 
        area = r.getArea();
        System.out.println("면적은 " + area); // 20
        perimeter = r.getPerimeter();
        System.out.println("둘레는 " + perimeter); // 18
    }
}
