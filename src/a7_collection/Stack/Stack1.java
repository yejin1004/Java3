package a7_collection.Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // #1. push 입력
        System.out.println("#1");
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println(stack);
        // #2. peek 읽기
        System.out.println("#2");
        System.out.println(stack.peek()); // 7
        // #3. search 탐색 및 확인(대기번호확인)
        System.out.println("#3");
        System.out.println(stack.search(7)); // 1
        System.out.println(stack.search(3)); // 2
        System.out.println(stack.search(5)); // 3
        System.out.println(stack.search(2)); // 4
        System.out.println(stack.search(9)); // -1 (없는 경우)
        // #4. pop (꺼내고 삭제)
        System.out.println("#4");
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 2
        System.out.println(stack.size()); // 0
    }
}
