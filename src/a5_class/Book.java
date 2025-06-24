package a5_class;

public class Book {
    /*
    필드 :
    제목 (title)
    저자 (author)
    가격 (price)
    생성자 : 기본생성자와 모든필드를 포함한 생성자
    메서드 : 책의 정보를 출력하는 메서드
    printBookInfo()
    "제목 by 저자, 가격원" - 해리포터 by J.K.롤링, 14000원
     */
    String title; // 제목
    String author; // 저자
    double price; // 가격

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 해리포터 by J.K.롤링, 14000원
    public String printBookInfo() {
        String str = this.title + " by " + this.author +
                ", " + this.price + "원";
        return str;
    }

    // 메서드 오버로딩(Overloading)이란?
    // 메서드의 이름을 동일하게 유지하면서 메서드 시그니처를 다르게하여
    // 여러 다른 기능을 메서드가 수행하도록 하는 기법
    // 메서드 시그니처 = 메서드이름, 매개변수 자료형, 매개변수의 갯수
    public void method1(int a, String b) {
    }
    public void method1(String c, int d) {
        // 메서드이름이 같지만 매개변수의 자료형이 다르므로 서로 다른 메서드로 인식
    }
    public void method1(int a, String b, boolean c) {
        // 메서드이름이 같지만 매개변수의 갯수가 다르므로 서로 다른 메서드로 인식
    }
    // 메서드 오버로딩은 왜 사용하는가?
    // 동일한 이름과 기능을 가진 메서드가 여러가지 형태의 매개변수를 사용가능하게
    // 만들어서 메서드의 사용성을 높임. 개발자는 하나의 메서드이름만 기억하고
    // 여러가지 방법으로 사용할 수 있음
    // 예) println 메서드
}
