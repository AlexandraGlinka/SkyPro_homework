package hm12_classes;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой"); // создали объект класса со свойствами
        Author rowling = new Author("Джоан", "Роулинг");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1870);
        Book harryPotter = new Book("Гарри Поттер", rowling, 1997);

        System.out.println("warAndPeace.toString() = " + warAndPeace.toString());
        System.out.println("harryPotter.toString() = " + harryPotter.toString());

        warAndPeace.setPublishedYear(1867);

        System.out.println();

        System.out.println("warAndPeace.toString() = " + warAndPeace.toString());

        System.out.println();

        // создаем нового автора и новую книгу
        Author newAuthor = new Author("Джоан", "Роул инг");
        // пробел в фамилии - чтобы проверить, что проверка работает
        Book newBook = new Book("Гарри Поттер", newAuthor, 1997);

        System.out.println(rowling.equals(newAuthor));
        System.out.println(harryPotter.equals(newBook));
    }
}

//        System.out.println("tolstoy.getFirstName() = " + tolstoy.getFirstName());
//        System.out.println("tolstoy.getSurname() = " + tolstoy.getSurname());
//        System.out.println("rowling.getFirstName() = " + rowling.getFirstName());
//        System.out.println("rowling.getSurname() = " + rowling.getSurname());


//        System.out.println("warAndPeace.getBookName() = " + warAndPeace.getBookName());
//        System.out.println("warAndPeace.getAuthorName() = " + warAndPeace.getAuthorName());
//        System.out.println("warAndPeace.getPublishedYear() = " + warAndPeace.getPublishedYear());
//
//        System.out.println("harryPotter.getBookName() = " + harryPotter.getBookName());
//        System.out.println("harryPotter.getAuthorName() = " + harryPotter.getAuthorName());
//        System.out.println("harryPotter.getPublishedYear() = " + harryPotter.getPublishedYear());
//        System.out.println("harryPotter.toString() = " + harryPotter.toString());
