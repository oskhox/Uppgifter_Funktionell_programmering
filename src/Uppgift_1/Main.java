package Uppgift_1;

import java.util.ArrayList;

public class Main {

    ArrayList<Book> allBooks;

    Main(){
    allBooks = new allBooks().getLibrary(); //hämtar in alla böcker

    filterAuthor(allBooks, "Dr. Helen Pierce");
    filterColour(allBooks, "Pastel Pink");
    countBooksByOwner(allBooks, "Sophia Clark");
    }

    public void filterAuthor(ArrayList<Book> ab, String author) {
    ab.stream()
            .filter(a -> a.getAuthor().equalsIgnoreCase(author))
            .forEach(a -> System.out.println(a.getTitle() + " is written by " + a.getAuthor() + "."));
    }

    public void filterColour(ArrayList<Book> ab, String colour) {
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

    public static void main(String[] args) {
        Main m1 = new Main();
    }
}
