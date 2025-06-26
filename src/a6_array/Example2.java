package a6_array;

public class Example2 {
    public static void main(String[] args) {
        // 주어진 배열의 평균값을 계산하는 메서드
        int[] numbers = {10,20,30,40,50};
        double average = getAverage(numbers);
        System.out.println(average); // 30.0
    }
    public static double getAverage(int[] arr) {
        // 합계 / 갯수
        int sum = 0;
        for (int data : arr) {
            sum = sum + data;
        }
        double average = (double)sum / arr.length;
        return average;
    }
}
