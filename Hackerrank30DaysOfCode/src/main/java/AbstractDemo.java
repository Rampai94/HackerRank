import java.util.*;

/**
 * javathirtydaysofcode
 *
 * @author RP53993 (ramamity94@gmail.com) created on 8/11/2019 inside the package - PACKAGE_NAME
 **/
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {

    private int price;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    void display() {
        System.out.print("Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Price: " + price);
    }
}

public class AbstractDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
