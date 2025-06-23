package a4_method;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // 두개의 숫자를 매개변수로 받아서 더 큰 수를 반환하는 메서드
        // 유저입력을 두번으로 나누어 받음
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요.");
        int first = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요.");
        int second = scanner.nextInt();
        //System.out.println(first + " " + second);
        int max = getMax(first, second);
        System.out.println(max);
    }
    public static int getMax(int first, int second) {
        if (first >= second) {
            return first;
        }else {
            return second;
        }
    }
}
