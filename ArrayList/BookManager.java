import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}

public class BookManager {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many books you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of book " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Year: ");
            int year = sc.nextInt();
            sc.nextLine(); 

            books.add(new Book(title, author, year));
        }

        System.out.println("\n--- Book List ---");
        for (Book b : books) {
            b.displayInfo();
        }

        sc.close();
    }
}
