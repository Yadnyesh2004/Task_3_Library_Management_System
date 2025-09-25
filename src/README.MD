1. Book.java

“This class represents a book in the library.

Each book has a title, an author, and an availability status (whether it is available or already issued).

I also created methods to check if a book is available and to change its status when issued or returned.

The toString() method helps in printing book details properly.”

2. User.java

“This class represents a user of the library.

For now, I kept it simple with just a name.

Later, we could expand this to store details like user ID or list of borrowed books.”

3. Library.java

“This is the most important class because it manages all the books.

I used an ArrayList to store multiple books.

There are methods like:

addBook() → to add a new book to the library.

showBooks() → to display all books with their current status.

issueBook() → to issue a book to a user, changing its status from available to issued.

returnBook() → to return a book and make it available again.

Basically, this class handles the main logic of the library.”

4. Main.java

“This is the driver class where the program starts.

In the main() method, I first created a library and added two books.

Then I created a user named Alice.

I displayed the books, then showed how a book is issued and how it gets updated.

Finally, Alice returns the book, and we see the updated list again.”