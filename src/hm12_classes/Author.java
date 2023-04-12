package hm12_classes;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }

    // чтобы автора преобразовать в строку
    @Override
    public String toString() {
        return firstName + " " + surname;
    }
}
