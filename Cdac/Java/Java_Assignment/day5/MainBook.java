
class Book 
{
    private String title;
    private String author;

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle()
     {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    @Override
    public String toString() 
    {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Library class to manage books
class Library {
    private static final int MAX_BOOKS = 100; // Maximum number of books in the library
    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public void addBook(Book book) 
    {
        if (bookCount < MAX_BOOKS) 
        {
            books[bookCount++] = book;
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    public void removeBook(Book book)
    {
        for (int i = 0; i < bookCount; i++) 
        {
            if (books[i].equals(book)) 
            {
                // Shift books to fill the gap caused by removal
                for (int j = i; j < bookCount - 1; j++) 
                {
                    books[j] = books[j + 1];
                }
                bookCount--;
                return; // Exit the loop after removing the book
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void displayBooks() 
    {
        if (bookCount == 0) 
        {
            System.out.println("The library is empty.");
        } 
        else
         {
            System.out.println("Books in the library:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}

public class MainBook
 {
    public static void main(String[] args) 
    {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // Displaying books in the library
        library.displayBooks();

        // Removing a book from the library
        Book bookToRemove = new Book("To Kill a Mockingbird", "Harper Lee");
        library.removeBook(bookToRemove);

        // Displaying books again after removal
        library.displayBooks();
    }
}
