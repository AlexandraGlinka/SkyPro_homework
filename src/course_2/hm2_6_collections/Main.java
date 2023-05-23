package course_2.hm2_6_collections;

import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        // Код должен работать с любой последовательностью и объемом списка чисел.
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && prevNum != num) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
        Set<String> uniqueStrings = new HashSet(strings);
        System.out.println(uniqueStrings);
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
        Set<String> uniqueStrings = new HashSet(strings);
        System.out.println(strings.size() - uniqueStrings.size());
    }
}

