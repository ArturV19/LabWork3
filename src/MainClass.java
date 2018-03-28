import menu.MainMenu;

import java.util.Scanner;

/**
 * Лабораторная работа №2, часть 1.
 * Вариант 10.
 * Точка входа в приложение.
 *
 * @author Артур Воеков 6344-010302D.
 * @java10.
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Java 10!");
        /*
        var f = new Integer(10);
        System.out.println(f);
        System.out.println(sum(0,2));
        */
        MainMenu.run();
    }

    private static int sum(int a, int b) {
        var in = 5;
        var scanner = new Scanner(System.in);
        return in;
    }
}
