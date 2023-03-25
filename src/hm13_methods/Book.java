package hm13_methods;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int publishedYear;

    public Book(String bookName, Author bookAuthor, int publishedYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishedYear = publishedYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
