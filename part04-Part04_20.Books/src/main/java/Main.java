
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            String pages = scanner.nextLine();

            System.out.println("Publication year:");
            String year = scanner.nextLine();

            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String response = scanner.nextLine();

        if (response.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
