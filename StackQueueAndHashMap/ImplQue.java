package StackQueueAndHashMap;

import java.util.Stack;

class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> qt = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        st.add(x);
    }

    public int pop() {
        while (st.size() > 1) {
            qt.add(st.pop());
        }
        int val = st.pop();
        while (!qt.isEmpty()) {
            st.add(qt.pop());
        }
        return val;
    }
    public int peek() {
        while (st.size() > 1) {
            qt.add(st.pop());
        }
        int val = st.peek();
        while (!qt.isEmpty()) {
            st.add(qt.pop());
        }
        return val;
    }
    public boolean empty() {
        return st.isEmpty();
    }
}
public class ImplQue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.peek());  // 10
        System.out.println(q.pop());   // 10
        System.out.println(q.pop());   // 20
        System.out.println(q.empty()); // false
        System.out.println(q.pop());   // 30
        System.out.println(q.empty()); // true
    }
}
