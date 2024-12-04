import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> checkedOutBooks;

    public Reader(String name) {
        this.name = name;
        this.checkedOutBooks = new ArrayList<>();
    }

    public void checkoutBook(Book book) {
        if (!book.isCheckedOut()) {
            book.checkout();
            checkedOutBooks.add(book);
        } else {
            System.out.println("Книга \"" + book.getTitle() + "\" уже на руках.");
        }
    }

    public void checkinBook(Book book) {
        if (checkedOutBooks.contains(book)) {
            book.checkin();
            checkedOutBooks.remove(book);
        } else {
            System.out.println("Эта книга не на руках у читателя.");
        }
    }

    public void displayInfo() {
        System.out.println("Читатель: " + name);
        System.out.println("Книги на руках:");
        if (checkedOutBooks.isEmpty()) {
            System.out.println("Нет книг.");
        } else {
            for (Book book : checkedOutBooks) {
                book.displayInfo();
            }
        }
    }
}
