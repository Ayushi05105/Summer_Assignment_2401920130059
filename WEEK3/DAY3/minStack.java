package WEEK3.DAY3;

import java.util.Stack;

public class minStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public minStack() {

    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            min.push(val);
        } else {
            st.push(val);
            if (min.peek() < val)
                min.push(min.peek());
            else
                min.push(val);
        }
    }

    public void pop() {
        st.pop();
        min.pop();

    }

    public int top() {
        return st.peek();

    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {

        minStack ms = new minStack();

    ms.push(-2);
    ms.push(0);
    ms.push(-3);

    System.out.println("getMin = " + ms.getMin());

    ms.pop();

    System.out.println("top = " + ms.top());
    System.out.println("getMin = " + ms.getMin());

    }
}
