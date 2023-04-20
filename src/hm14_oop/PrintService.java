package hm14_oop;

public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Список факультета Гриффиндор:");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor);
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Список факультета Пуффендуй:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff);
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Список факультета Когтевран:");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw);
        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Список факультета Когтевран:");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin);
        }
    }
}
