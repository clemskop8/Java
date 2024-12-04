public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public void checkout() {
        isCheckedOut = true;
    }

    public void checkin() {
        isCheckedOut = false;
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Доступна: " + (isCheckedOut ? "Нет" : "Да"));
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getTitle() {
        return title;
    }
}
