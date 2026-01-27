// 17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public String title;
    public List<String> directors;
    public List<String>  actors;
    public List<String> reviews;

    public Movie(String title) {
        this.title = title;
        this.directors = new ArrayList<>();
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public boolean addDirector(String director) {
        return this.directors.add(director);
    }
    public boolean addActor(String actor) {
        return this.actors.add(actor);
    }

    public boolean addReview(String review) {
        return this.reviews.add(review);
    }
     public void reviewDetails() {
        for (String reviews : this.reviews) {
            System.out.println( this.title + " " + reviews);
        };
     }
}
