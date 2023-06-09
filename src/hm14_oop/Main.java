package hm14_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 90, 80, 90, 90, 95),
                new Gryffindor("Гермиона Грейнджер", 85, 100, 90, 85, 90),
                new Gryffindor("Рон Уизли", 40, 30, 80, 70, 75)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 40, 50, 55, 80,70),
                new Hufflepuff("Седрик Диггори", 80, 40, 80,55,60),
                new Hufflepuff("Джастин Финч-Флетчли", 60, 80, 40, 20, 55)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 40, 80, 55, 80,30, 45),
                new Ravenclaw("Падма Патил", 80, 40, 70,55,60, 80),
                new Ravenclaw("Маркус Белби", 60, 55, 60, 20, 55, 95)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 60, 40, 90, 70,30, 100),
                new Slytherin("Грэхэм Монтегю", 20, 40, 70,55,50, 80),
                new Slytherin("Грегори Гойл", 40, 40, 85, 20, 65, 60),
                new Slytherin("Маркус Белби", 45, 55, 60, 75, 55, 50)
        };

        PrintService printService = new PrintService();
        printService.print(hufflepuffs);
        System.out.println();

        System.out.println("Сравнение студентов с одного факультета");
        CompareService compareService = new CompareService();
        compareService.compareGryffindorStrudents(gryffindors[0], gryffindors[1]);
        compareService.compareHufflepuffStrudents(hufflepuffs[0], hufflepuffs[1]);
        compareService.compareRavenclawStrudents(ravenclaws[0], ravenclaws[1]);
        compareService.compareSlytherinStrudents(slytherins[0], slytherins[1]);

        System.out.println();

        System.out.println("Сравнение студентов с разных факультетов");
        compareService.compareAnyStrudents(gryffindors[0], slytherins[0]);
//        printService.print(gryffindors);
//        System.out.println();
//        printService.print(hufflepuffs);
//        System.out.println();
//        printService.print(ravenclaws);
//        System.out.println();
//        printService.print(slytherins);
    }
}
/*
Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
 */
