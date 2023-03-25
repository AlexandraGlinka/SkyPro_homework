package hm13_methods;

public class Author {
    private String authorFirstName;
    private String authorSurname;

    public Author(String authorFirstName, String authorSurname) {
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public String toString() {
        return authorFirstName + " " + authorSurname;
    }

}
