package hm13_methods;

import hm12_classes.Author;
import hm12_classes.Book;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой"); // создали объект класса со свойствами
        Author rowling = new Author("Джоан", "Роулинг");

        Book warAndPeace2 = new Book("Война и мир", tolstoy, 1870);
        Book harryPotter2 = new Book("Гарри Поттер", rowling, 1997);

        System.out.println("warAndPeace.getBookName() = " + warAndPeace2.getBookName());
        System.out.println("warAndPeace.getAuthorName() = " + warAndPeace2.getAuthorName());
        System.out.println("warAndPeace.getPublishedYear() = " + warAndPeace2.getPublishedYear());

        warAndPeace2.setPublishedYear(1867);

        System.out.println();
        System.out.println("warAndPeace.getPublishedYear() = " + warAndPeace2.getPublishedYear());
        System.out.println();

        System.out.println("harryPotter.getBookName() = " + harryPotter2.getBookName());
        System.out.println("harryPotter.getAuthorName() = " + harryPotter2.getAuthorName());
        System.out.println("harryPotter.getPublishedYear() = " + harryPotter2.getPublishedYear());
    }
}
