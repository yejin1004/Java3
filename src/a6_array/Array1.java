package a6_array;

// 같은 패키지에 있는 클래스가 아니므로 import 해야함
// public 클래스라 하더라도 다른 패키지에 있으면 import 해야만 사용할 수 있음
// public의 의미가 누구나 import 할 수 있다는 의미이지 어디에 있는지 자동으로
// 찾는다는 의미는 아니기 때문임!
import a5_class.Student;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        // 배열 Array
        // 자료구조 (Data Structure)중에서 가장 단순한 구조
        // 자료구조의 종류 : 배열, 리스트, 세트, 맵, 트리...

        // 배열의 선언
        // 한줄로 선언
        int[] array1 = new int[3]; // int형 자료 3개를 힙 영역에 생성
        // 두줄로 선언
        double[] array2; 
        array2 = new double[5]; // double형 자료 5개를 힙 영역에 생성
        // 배열의 특징 : 생성시에 크기를 결정하고 이를 늘리거나 줄일 수 없음!!
        // 만약 array2의 크기를 6개로 늘리려면 새로 6개를 만들고 기존 배열은 삭제함
        
        // 모든 자료형을 배열로 만들 수 있음(참조자료형 포함)
        String[] array3 = new String[10];
        Student[] students = new Student[100]; // Student 객체 100개를 생성

        // 배열에 값을 대입하는 법
        array1[0] = 0; // 0번 인덱스(=0번 자리) index
        array1[1] = 10; // 1번 인덱스
        array1[2] = 20; // 2번 인덱스
        // array1[3] = 30; // 에러. 인덱스 초과(array1은 생성시 3개로 만듬)
        // 화면출력
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
        System.out.println(Arrays.toString(array1));
        // 배열의 출력 메서드(tpString)을 사용하면 쉽게 전체 데이터를 확인 가능

        // 배열의 초기값 정리
        // 배열은 힙메모리에 생성되므로 기본자료형의 경우, 각자의 초기값을 갖는다
        // char ch = null
        // boolean bool = false
        // int i = 0 (byte, short, int, long 모두 0)
        // double num = 0.0 (float, double 모두 0.0)
    }
}








