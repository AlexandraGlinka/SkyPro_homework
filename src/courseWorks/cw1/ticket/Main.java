package courseWorks.cw1.ticket;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите что-нибудь - ");
        String message = sc.next();

        // длина строки
        // индесы

        int lengthOfMessage = message.length();
        String part1;
        String part2;

        part1 = message.substring(0, lengthOfMessage / 2);

        if (lengthOfMessage % 2 == 0) { // привет - 012345 - 6
            part2 = message.substring(lengthOfMessage / 2, lengthOfMessage);
        } else { // привет! - 0123456 - 7 - 3,5
            part2 = message.substring(lengthOfMessage / 2 + 1, lengthOfMessage);
            System.out.println("Длина строки нечетная, середина сообщения - " + message.charAt(lengthOfMessage / 2));
        }

        System.out.println("Певрая часть сообщения - " + part1);
        System.out.println("Вторая часть сообщения - " + part2);
    }
}
