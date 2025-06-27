package a6_array;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {
        // 2차원 행렬 배열. 매트릭스, 2D Array
        // 2차원 배열의 선언
        int[][] array1 = new int[3][4];
        //int[] array1[] = new int[3][4]; // 잘 안쓰는 방법
        //int array1[][] = new int[3][4]; // 잘 안쓰는 방법

        // 2차원 배열의 값 대입
        int[][] array3 = new int[2][3]; // 2*3=6개의 data가 있는 배열
        array3[0][0] = 1;
        array3[0][1] = 2;
        array3[0][2] = 3;
        array3[1][0] = 4;
        array3[1][1] = 5;
        array3[1][2] = 6;
        // 리터럴방식으로 생성 (new를 사용하지않고 생성)
        int[][] array4 = {{1,2,3},{4,5,6}};
        String[][] array5 = {{"black","white","yellow"}, {"green","blue","red"}};

        // 2차원배열의 출력 (deepToString)
        System.out.println(Arrays.deepToString(array3));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.deepToString(array5));
        System.out.println(array3.length); // 2
        System.out.println(array3[0].length); // 3
        System.out.println(array3[1].length); // 3
        for (int i=0; i<array3.length; i++) {
            for (int j=0; j<array3[i].length; j++) {
                System.out.print(array3[i][j]);
            }
        }
        System.out.println();
    }
}







