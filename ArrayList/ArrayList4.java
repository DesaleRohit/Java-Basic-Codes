import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to the Item Manager!!");

        while (true) {
            System.out.println("\nChoose an option --> 1.add , 2.show , 3.quit ");
            choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine();
                    itemList.add(newItem);
                    System.out.println("Added item: " + newItem);
                    break;

                case "2":
                    System.out.println("Items in your list:");
                    if (itemList.isEmpty()) {
                        System.out.println("  (No items added yet)");
                    } else {
                        for (int i = 0; i < itemList.size(); i++) {
                            System.out.println("  " + (i + 1) + ". " + itemList.get(i));
                        }
                    }
                    break;

                case "3":
                    System.out.println("Exiting... Thank you for using Item Manager!!");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Invalid option. Please use: 1, 2, or 3");
            }
        }
    }
}
