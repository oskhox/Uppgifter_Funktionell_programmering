package Uppgift_1_filter_map;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String colour;
    private int rating;
    private String owner;
    private boolean factBook;
    private boolean fictionBook;

    public Book(String title, String author, String genre, String colour, int rating, String owner, boolean factBook, boolean fictionBook) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.colour = colour;
        this.rating = rating;
        this.owner = owner;
        this.factBook = factBook;
        this.fictionBook = fictionBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titel) {
        this.title = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isFactBook() {
        return factBook;
    }

    public void setFactBook(boolean factBook) {
        this.factBook = factBook;
    }

    public boolean isFictionBook() {
        return fictionBook;
    }

    public void setFictionBook(boolean fictionBook) {
        this.fictionBook = fictionBook;
    }
}