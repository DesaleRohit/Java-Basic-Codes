public class StackDemo {
    public static void main(String[] args) {
        int[] stack = new int[5];
        stack[0] = 10;
        stack[1] = 20;
        stack[2] = 30;
        int elements = 3;
        int top = elements - 1;

        System.out.println("Before Operation on Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

        // PUSH Operation
        if (top >= 4) {
            System.out.println("Stack Overflow");
        } else {
            top += 1;
            stack[top] = 1000;
        }

        System.out.println("\nStack After PUSH Operation:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

        // POP Operation
        if (top == -1) {
            System.out.println("\nStack Underflow");
        } else {
            top -= 1; // Remove top element
        }

        System.out.println("\nStack After POP Operation:");
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
