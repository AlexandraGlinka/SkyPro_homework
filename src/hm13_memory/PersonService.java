package hm13_memory;

public class PersonService {
    public void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        System.out.println(person);
    }
    public void changePerson2(Person person2) {
        person2.setName("Ilya");
        person2.setSurname("Lagutenko");
        System.out.println(person2);
    }
}
