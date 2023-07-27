import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookStore {
    private Map<String, String> books;

    public BookStore() {
        books = new HashMap<>();
    }

    public void addBook(String bookName, String author) {
        books.put(bookName, author);
        System.out.println("Book has been added successfully!");
    }

    public String getAuthor(String bookName) {
        return books.getOrDefault(bookName, " Book Author not found");
    }

    public void displayAllBooks() {
        System.out.println("!!!!!!!!! All Books !!!!!!!");
        for (String bookName : books.keySet()) {
            System.out.println("Book: " + bookName + ", Author: " + books.get(bookName));
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n!!!!!!Book Store !!!!!\n");
            System.out.println("Press 1. to Add Book");
            System.out.println("Press 2. to Get Author by Book Name");
            System.out.println("Press 3. to Display All Books");
            System.out.println("Press 4. to Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();  
                    System.out.print("Enter the book name you want to add: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter the author name of ur book: ");
                    String author = scanner.nextLine();
                    bookStore.addBook(bookName, author);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter the book name you want to add: ");
                    bookName = scanner.nextLine();
                    String authorName = bookStore.getAuthor(bookName);
                    System.out.println("Author: " + authorName);
                    break;
                case 3:
                    bookStore.displayAllBooks();
                    break;
                case 4:
                    System.out.println("Exiting the Book Store. Goodbye See you again!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("No Books. Please try again.");
            }
        }
    }
}
