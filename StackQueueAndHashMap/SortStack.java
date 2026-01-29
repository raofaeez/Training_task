package StackQueueAndHashMap;

import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> s) {
        sortt(s);
        return s;
    }

    private static void sortt(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        sortt(s);
        insert(s, temp);
    }

    private static void insert(Stack<Integer> s, int temp) {
        if (s.isEmpty() || s.peek() <= temp) {
            s.push(temp);
            return;
        }
        int ele = s.pop();
        insert(s, temp);
        s.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);

        sort(s);

        System.out.println("Sorted Stack (Top to Bottom):");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
