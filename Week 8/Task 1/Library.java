import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                book.displayInfo();
            }
        }
    }
}
