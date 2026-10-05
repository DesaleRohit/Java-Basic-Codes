import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if (min.isEmpty() || value <= min.peek()) {
            min.push(value);
        }
    }

    public void pop() {
        int value = st.pop();

        if (value == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

public class Leetcode_155_MinStack {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum : " + minStack.getMin());

        minStack.pop();

        System.out.println("Top : " + minStack.top());
        System.out.println("Minimum : " + minStack.getMin());
    }
}