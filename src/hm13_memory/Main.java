package hm13_memory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Напишите метод, который изменяет значение переменной типа int.
        // Объявите метод changeValue, который принимает параметр типа int под названием value.
        // Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
        // В методе main объявите переменную типа int под названием value и запишите туда значение 33.
        // В следующей строке вызовите метод changeValue и передайте в него эту переменную.
        int value = 33;
        System.out.println("Задание 5");
        System.out.println(value); //33
        changeValue(value);//22
        System.out.println(value); //33

        System.out.println();
        System.out.println("Задание 6");
        Integer value2 = 33;
        System.out.println(value2);
        changeValue2(value2);
        System.out.println(value2);

        System.out.println();
        System.out.println("Задание 7");
        Integer[] value3 = {3,4};
        System.out.println(Arrays.toString(value3));
        changeValue3(value3);
        System.out.println(Arrays.toString(value3));

        System.out.println();
        System.out.println("Задание 8");
        Integer[] value4 = {3,4};
        System.out.println(Arrays.toString(value4));
        changeValue4(value4);
        System.out.println(Arrays.toString(value4));

        System.out.println();
        System.out.println("Задание 9");
        PersonService personService = new PersonService();
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        personService.changePerson(person);
        System.out.println(person);

        System.out.println();
        System.out.println("Задание 10");
        Person person2 = new Person("Lyapis", "Trubetskoy");
        System.out.println(person2);
        personService.changePerson2(person2);
        System.out.println(person2);
    }

    private static void changeValue(int value) {
        value = 22;
        System.out.println(value);
    }
    private static void changeValue2(Integer value2) {
        value2 = 22;
        System.out.println(value2);
    }
    private static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value3));
    }
    private static void changeValue4(Integer[] value4) {
        value4[0] = 99;
        System.out.println(Arrays.toString(value4));
    }

}
