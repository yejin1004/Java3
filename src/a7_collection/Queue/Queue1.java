package a7_collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        /* 큐 (인터페이스)
            - 선입선출 FIFO (=First In First Out)
            - 주로 키입력 또는 메서드호출등의 이벤트 처리에 사용됨
            - 먼저 들어온 객체정보를 먼저 사용함
            - 구현체로 LinkedList 또는 PriorityQueue를 많이 사용
         */
        Queue<Integer> q1 = new LinkedList<>();
        // LinkedList는 List의 구현체이면서 동시에 Queue의 구현체이기도 함
        // #1. add 추가 (큐의 사이즈가 다 차서 더이상 추가할 수 없으면 에러발생)
        System.out.println("#1");
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1); // [3, 4, 5]

        // #2. element
        System.out.println("#2");
        System.out.println(q1.element()); // 3
        System.out.println(q1.element()); // 3
        // FIFO 이므로 가장 먼저 들어간 자료를 먼저 읽는다. 3을 읽음

        // #3. remove (꺼내면서 삭제)
        System.out.println("#3");
        System.out.println(q1.remove()); // 3
        System.out.println(q1.remove()); // 4
        System.out.println(q1.remove()); // 5
        // System.out.println(q1.remove()); // 오류 (큐가 비었음)

        // 안전장치가 있는 메서드들
        Queue<Integer> q2 = new LinkedList<>();
        // #4. offer (큐가 다 차도 에러가 발생하지 않고 추가안함)
        System.out.println("#4");
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        // #5. peek 읽기 (빈 큐를 읽어도 에러 발생하지 않음)
        System.out.println("#5");
        System.out.println(q2.peek()); // 3
        // #6. poll 꺼내면서 삭제 (큐가 다 비워져도 에러 발생하지 않음)
        System.out.println("#6");
        System.out.println(q2.poll()); // 3
        System.out.println(q2.poll()); // 4
        System.out.println(q2.poll()); // 5
        System.out.println(q2.poll()); // null
    }
}
