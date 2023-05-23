package course_2.hm2_4_exceptions;

import course_2.hm2_4_exceptions.exception.BadConfirmPasswordException;
import course_2.hm2_4_exceptions.exception.BadPasswordException;
import course_2.hm2_4_exceptions.exception.WrongLoginException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void authorizationInfoCheck(String login, String password, String confirmPassword)
            throws WrongLoginException, BadPasswordException, BadConfirmPasswordException {
        //Pattern pattern = Pattern.compile("[a-zA-Z0-9_]+"); //  любой символ кроме латиницы, цифр или нижнего подчёркивания;
        //Matcher matcherLogin = pattern.matcher(login);
        //Matcher matcherPassword = pattern.matcher(password);
        if ((login.length() > 20) || !login.matches("[a-zA-Z0-9_]+")) { // login.matches("\\W")
            throw new WrongLoginException();
        }
        if ((password.length() > 20) || !password.matches("[a-zA-Z0-9_]+")) {
            throw new BadPasswordException();
        }
        if (confirmPassword != password) {
            throw new BadConfirmPasswordException();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();
        System.out.print("Введите пароль повторно: ");
        String confirmPassword = sc.nextLine();

        try {
            authorizationInfoCheck(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Логин введен некорректно");
        } catch (BadPasswordException e) {
            System.out.println("Пароль введен некорректно");
        } catch (BadConfirmPasswordException e) {
            System.out.println("Пароли не совпадают");
        } finally {
            System.out.println("Проверка завершена");
        }
    }
}
