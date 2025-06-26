package a6_array;

public class String1 {
    public static void main(String[] args) {
        // String 클래스는 문자의 시퀀스, 문자열을 나타내는 객체
        // 공식적으로 배열로 부르지는 않지만
        // 내부적으로 char의 배열 모습을 하고 있음
        // 배열과 유사한 특징을 가지지만 원칙적으로 불변성(immutable)을 가짐

        // 숫자 -> 문자열(String)
        int a = 10;
        String str1 = Integer.toString(a);
        System.out.println(str1); // 10  숫자가 아니라 문자임
        double b = 5.5;
        String str2 = Double.toString(b);
        System.out.println(str2); // 5.5 문자
        boolean c = true;
        String str3 = Boolean.toString(c);
        System.out.println(str3); // true 문자
    }
}
