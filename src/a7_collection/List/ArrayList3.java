package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        // ArrayList 메서드 사용법
        List<Integer> aList1 = new ArrayList<>();
        // #1. add (요소추가, 맨뒤에 추가)
        System.out.println("#1");
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3, 4, 5]

        // #2. add(int index, E element) (요소추가, 특정위치에 추가)
        System.out.println("#2");
        aList1.add(1,6);
        System.out.println(aList1); // [3, 6, 4, 5]

        // #3. addAll (또 다른 리스트를 뒤에 추가)
        System.out.println("#3");
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]

        // #4. addAll (특정위치에 리스트 추가)
        System.out.println("#4");
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(100);
        aList3.add(101);
        aList2.addAll(1, aList3);
        System.out.println(aList2); // [1, 100, 101, 2, 3, 6, 4, 5]

        // #5. set (수정)
        System.out.println("#5");
        System.out.println(aList3); // [100, 101]
        aList3.set(0, 10);
        aList3.set(1, 20);
        System.out.println(aList3); // [10, 20]

        // #6. remove(int index) (해당 인덱스 삭제)
        System.out.println("#6");
        //aList3.remove(10); // 주의. 정수는 인덱스로 인식함
        aList3.remove(0);
        System.out.println(aList3); // [20]

    }
}
