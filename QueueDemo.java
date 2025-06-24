import java.util.Scanner;

class Queue {
    int[] queue1 = new int[5];
    int rear, front;

    Queue() {
        rear = -1;
        front = -1;
    }

    void insert(int x) {
        if (rear == 4) {
            System.out.println("Queue Overflow");
        } else {
            queue1[++rear] = x;
            System.out.println("Inserted Element: " + x);
        }
    }

    void delet() {
        if (front == rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted Element: " + queue1[++front]);
        }
    }

    void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(queue1[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue qu = new Queue();
        int ch, value;

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Exit\nEnter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the Element: ");
                    value = sc.nextInt();
                    qu.insert(value);
                    break;
                case 2:
                    qu.delet();
                    break;
                case 3:
                    qu.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
