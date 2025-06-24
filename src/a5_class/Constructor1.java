package a5_class;

public class Constructor1 {
    public static void main(String[] args) {

    }
}

// 보통 클래스는 외부파일(.java)에 만드는 것이 일반적임 (Student, User 클래스처럼)
// 예외적으로 하나의 파일에 여러개의 클래스를 선언하는 경우에는
// public 제어자는 오직 하나의 클래스에만 붙일 수 있음!
// public class A {} // 에러. public 사용하면안됨
class A {
    int m;
    void work() {
        System.out.println(m);
    }
}
class B {
    int m;
    B() {
        System.out.println("B의 기본생성자");
    }
    void work() {
        System.out.println(m);
    }
}









