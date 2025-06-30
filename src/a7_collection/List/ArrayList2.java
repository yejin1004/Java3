package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        // 배열을 List로 변환하는 법
        //int[] array = {1,2,3,4}; // 기본자료형의 배열은 리스트로 변환X
        Integer[] array = {1,2,3,4};
        List<Integer> aList1 = Arrays.asList(array);
        // aList1.add(5); // 왜 에러발생??
        // Arrays.asList()로 배열을 리스트로 변환할 때, 기존 배열의 메모리 위치를
        // 그대로 재사용함. 원본 배열을 참조하여 그 위에 List 인터페이스의 껍데기를
        // 씌운 것과 같음.
        // 그러므로 배열의 고정크기를 유지하며 View(뷰)의 역할을 수행함.
        // 결과적으로 배열의 불변성을 그대로 가지게 됨.

        List<Integer> aList2 = new ArrayList<>(Arrays.asList(array));
        aList2.add(5);
        System.out.println(aList2); // [1, 2, 3, 4, 5]
        // 기존 배열의 메모리 위치를 재사용하지 않고 new ArrayList<>()로 새로 생성
        // 하는 방식이므로 새로운 힙의 메모리 영역을 가짐. (값 복사)
        // 이 경우 리스트의 특징을 그대로 사용 가능.
    }
}
