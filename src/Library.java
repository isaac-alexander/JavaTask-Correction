// 11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books ;

    public  Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(String book) {
        return books.add(book);
    }

    public boolean removeBook(String book) {
        return books.remove(book);
    }

    public void printBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

}
