package Uppgift_1_filter_map;

import java.util.ArrayList;
import java.util.List;

public class Main {

    ArrayList<Book> allBooks;

    Main() {
        allBooks = new allBooks().getLibrary();

        //filter
        //filterByAuthor(allBooks, "Dr. Helen Pierce");
        //filterByColour(allBooks, "Pastel Pink");
        //countBooksByOwner(allBooks, "Sophia Clark");

        //mappning
        //mapTitle(allBooks);
        //mapAuthors(allBooks);
        //mapTitleOwner(allBooks, "Sophia Clark");

        //flatmap
        //List<List<Book>> bothLists = mergeLists();
        //flattenedTitles(bothLists);

        //reduce
        averageGrade(allBooks);
        allTitlesOneString(allBooks);
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
        System.out.println("All titles owned by " + owner + ":");
        ab.stream()
                .filter(a -> a.getOwner().equalsIgnoreCase(owner))
                .map(Book::getTitle)
                .forEach(s -> System.out.println(s));
    }

    //Skapar två listor med samma böcker och lägger båda i en tredje lista
    public List<List<Book>> mergeLists() {
        List<Book> booklist1 = new allBooks().getLibrary();
        List<Book> booklist2 = new allBooks().getLibrary();
        List<List<Book>> bothLists = new ArrayList<>();
        bothLists.add(booklist1);
        bothLists.add(booklist2);
        return bothLists;
    }

    public void flattenedTitles(List<List<Book>> superList) {
        System.out.println("Titles in merged duplicated lists: ");
        superList.stream()
                .flatMap(b -> b.stream())
                .forEach(s -> System.out.println(s.getTitle()));
    }

    public void averageGrade(ArrayList<Book> ab) {
        System.out.print("Average rounded grade of all books is: ");
        int avg = ab.stream()
                .map(Book::getRating)
                .reduce(0, (c, d) -> c + d) / ab.size();
        System.out.println(avg);
    }

    public void allTitlesOneString(ArrayList<Book> ab) {
        System.out.println("All titles together are: ");
        String all = ab.stream()
                .map(Book::getTitle)
                .reduce("", (u, e) -> u + e + ", ");
        System.out.println(all);
    }

    public static void main(String[] args) {
        Main m1 = new Main();
    }
}