package a11_exception;

public class Exception1 {
    public static void main(String[] args) {
        // #1. try~catch 문
        try {
            //System.out.println(3/0); // 0으로 나누면 산술예외가 발생함!
            int[] arr = new int[]{1,2,3};
            arr[3] = 0; // 배열크기초과 예외 발생 (ArrayIndexOutOfBoundsException)
        } catch (ArithmeticException e) {
            System.out.println("산술예외가 발생하여 종료됨");
        } catch (RuntimeException e) {
            System.out.println("런타임 예외 발생");
        }

        // #2. try~catch~finally 문
        try {
            System.out.println(3/0); // 0으로 나누면 산술예외가 발생함!
        } catch (ArithmeticException e) {
            System.out.println("산술예외가 발생하여 종료됨");
        } finally {
            // 예외상황이건 아니건 모두 실행됨
            // 자원(=리소스)의 회수를 위하여 사용함
            // 메모리할당이 발생했다면 여기서 메모리삭제
            System.out.println("프로그램 종료");
            System.out.println("주로 여기서 관련 리소스를 해제(메모리삭제)");
        }
    }
}
