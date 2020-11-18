package single_responsibility.problemcode;

/**
 * This is a simple book class with some fields. Nothing fancy.
 * I am not making fields private so that we don't need to deal with getters and setters
 * and can focus on the logic instead.
 */
public class Book {
    public String name;
    String authorName;
    int year;
    public int price;
    String isbn;

    public Book(String name, String authorName, int year, int price, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }
}
