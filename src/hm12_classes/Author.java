package hm12_classes;

public class Author {
    private String firstName;
    private String surname;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    // чтобы автора преобразовать в строку
    public String toString() {
        return firstName + " " + surname;
    }
}
