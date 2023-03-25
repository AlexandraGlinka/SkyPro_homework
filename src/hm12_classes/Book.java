package hm12_classes;

public class Book { // создали класс Book
    private String bookName; // задали ему свойства
    private Author authorName;
    private int publishedYear;

    // создали конструктор, который создает объект и возвращает ему значения с помощью this
    // т.к. нет Static, то будет this
    public Book(String bookName, Author authorName, int publishedYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
    }

    // создает геттер, который возвращает значения
    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            // сначала сравниваем классы!
            return false;
        }
        Book newBook = (Book) other;
        return bookName.equals(newBook.bookName);
        // т.е. здесь возвращается значение true/false в зависимости от равенства НАЗВАНИЯ КНИГИ?
        // а если я хочу проверить на равенстве с учетом двух полей?
        // например название книги и автор. как это прописать?
    }
}
