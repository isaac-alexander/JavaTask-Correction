// 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.


import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private List<Book> books = new ArrayList<Book>();

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

}
