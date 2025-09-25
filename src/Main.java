// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("OOP Concepts", "Grady Booch"));

        // Create user
        User user1 = new User("Alice");

        // Show books
        System.out.println("Books in library:");
        library.showBooks();

        // Issue book
        library.issueBook("Java Basics", user1);

        // Show books again
        library.showBooks();

        // Return book
        library.returnBook("Java Basics", user1);

        // Show books again
        library.showBooks();
    }
}
