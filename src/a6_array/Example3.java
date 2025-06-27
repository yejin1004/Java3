package a6_array;

public class Example3 {
    public static void main(String[] args) {
        // 중복된 숫자의 갯수를 리턴하는 메서드.
        // 아래 배열에 3의 갯수는 3개이므로 3이 출력
        // 없으면 0을 출력
        int[] numbers = {1,3,7,2,4,3,9,8,3,4};
        int count = countNumber(numbers, 3);
        System.out.println(count); // 3
        count = countNumber(numbers, 10);
        System.out.println(count); // 0
    }
    public static int countNumber(int[] numbers, int target) {
        int count = 0;
        for (int data : numbers) {
            if (data == target) {
                count++;
            }
        }
        return count;
    }
}
