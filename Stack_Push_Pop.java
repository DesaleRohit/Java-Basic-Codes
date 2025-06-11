import java.util.Scanner;

class StackDemo {
    private int[] stack;
    private int top;

    public StackDemo() {
        stack = new int[5];
        top = -1;
    }

    public void push(int x) {
        if (top >= 4) {
            System.out.println("Stack is OverFlow");
        } else {
            stack[++top] = x;
            System.out.println("Element inserted ");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack is UnderFlow");
        } else {
            System.out.println("Deleted Element is :" + stack[top--]);
        }
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is Empty..");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class Stack_Push_Pop {
    public static void main(String[] args) {
        StackDemo stackdemo = new StackDemo();
        Scanner scanner = new Scanner(System.in);
        int ch, value;

        while (true) {
            System.out.println("1.PUSH \n2.POP \n3.Display \n4.Exit");
            System.out.print("Enter the Operation Number : ");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the Elements : ");
                    value = scanner.nextInt();
                    stackdemo.push(value);
                    break;
                case 2:
                    stackdemo.pop();
                    break;
                case 3:
                    stackdemo.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice !! Please enter a valid option..");
            }
        }
    }
}