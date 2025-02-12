package Uppgift_1;

import java.util.ArrayList;

public class allBooks {

    ArrayList<Book> library = new ArrayList<Book>();

    Book b1 = new Book("The Lost City", "Emily Walker", "Adventure", "Deep Blue",
            4, "Sarah Thompson", false, true);
    Book b2 = new Book("The History of Ancient Rome", "Marcus Lewis", "History", "Red",
            4, "James Harris", true, false);
    Book b3 = new Book("Whispers in the Wind", "Nora Sullivan", "Romance", "Pastel Pink",
            3, "Sophia Clark", false, true);
    Book b4 = new Book("Science Uncovered", "Dr. Olivia Grant", "Science", "White",
            5, "Mark Patterson", true, false);
    Book b5 = new Book("Into the Void", "Nora Sullivan", "Science Fiction", "Dark Purple",
            4, "David Mitchell", false, true);
    Book b6 = new Book("The Art of Cooking", "Julia Collins", "Culinary", "Green",
            4, "Emma Robinson", true, false);
    Book b7 = new Book("The Phantom's Lair", "Richard Reed", "Romance", "Black",
            2, "Nathan Carter", false, true);
    Book b8 = new Book("Unveiling the Truth of the Earth", "Dr. Helen Pierce", "Geology", "Earth Brown",
            5, "David Anderson", true, false);
    Book b9 = new Book("The Chronicles of Eldoria", "Aidan Brooks", "Romance", "Gold",
            4, "Sophia Clark", false, true);
    Book b10 = new Book("The Secrets of the Human Brain", "Dr. Helen Pierce", "Psychology", "Light Blue",
            3, "Oliver Scott", true, false);

    public allBooks() {
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        library.add(b6);
        library.add(b7);
        library.add(b8);
        library.add(b9);
        library.add(b10);
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }
}