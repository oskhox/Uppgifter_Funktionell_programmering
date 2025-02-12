package Uppgift_1_filter_map;

import java.util.ArrayList;

public class Main {

    ArrayList<Book> allBooks;

    Main(){
    allBooks = new allBooks().getLibrary();

    //filter
    filterByAuthor(allBooks, "Dr. Helen Pierce");
    filterByColour(allBooks, "Pastel Pink");
    countBooksByOwner(allBooks, "Sophia Clark");

    //mappning
    mapTitle(allBooks);
    mapAuthors(allBooks);
    mapTitleOwner(allBooks, "Sophia Clark");
    }

    public void filterByAuthor(ArrayList<Book> ab, String author) {
    ab.stream()
            .filter(a -> a.getAuthor().equalsIgnoreCase(author))
            .forEach(a -> System.out.println(a.getTitle() + " is written by " + a.getAuthor() + "."));
    }

    public void filterByColour(ArrayList<Book> ab, String colour) {
        ab.stream()
                .filter(a -> a.getColour().equalsIgnoreCase(colour))
                .forEach(a -> System.out.println(a.getTitle() + " by " + a.getAuthor() +
                " is " + a.getColour() + " in colour."));
    }

    public void countBooksByOwner(ArrayList<Book> ab, String owner) {
        long totalOwned = ab.stream()
                .filter(a -> a.getOwner().equalsIgnoreCase(owner))
                .count();
        System.out.println(owner + " owns " + totalOwned + " books.");
    }

    public void mapTitle(ArrayList<Book> ab) {
        System.out.println("All titles:");
        ab.stream().map(Book::getTitle)
                .forEach(s -> System.out.println(s));
    }

    public void mapAuthors(ArrayList<Book> ab) {
        System.out.println("All authors:");
        ab.stream().map(Book::getAuthor)
                .distinct()
                .forEach(s -> System.out.println(s));
    }

    public void mapTitleOwner(ArrayList<Book> ab, String owner) {
        System.out.println("All titles owned by "  + owner + ":");
        ab.stream()
                .filter(a -> a.getOwner().equalsIgnoreCase(owner))
                .map(Book::getTitle)
                .forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        Main m1 = new Main();
    }
}