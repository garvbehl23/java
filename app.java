import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.add(new Book(title, author));
                    System.out.println("Book added!");
                    break;
                case 2:
                    System.out.println("\nLibrary Books:");
                    for (Book b : library) {
                        System.out.println(b.title + " by " + b.author);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
