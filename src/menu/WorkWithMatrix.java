package menu;

import java.util.Scanner;

/**
 * Описание пункта меню, отвечающего за работа пользователя с матрицами.
 */
public class WorkWithMatrix {

    public static void run() {
        String userChoice;

        while (true) {
            System.out.println("\n Начало ввода:");
            System.out.println("Введите высоту первой матрицы \n" +
                    "(ввод не натурального значения в данный момент приведёт к возврату в главное меню программы)");
            userChoice = MainMenu.scanner.next();

            int heightOfFirstMatrix;

            //Проверка, можно ли привести ввод пользователя к целому:
            if (userChoice.matches("[-+]?\\d+")) {
                heightOfFirstMatrix = Integer.parseInt(userChoice);
                heightOfFirstMatrix = new Integer("5");

                System.out.println("work");
            } else {
                System.out.println("Введено не целое число, возврат в главное меню...");
                break;
            }
        }
    }

    /**
     * Основная работа программы.
     *
     * @param heightOfFirstMatrix - количество строк в первой матрице.
     */
    public static void mainJobWithMatrix(int heightOfFirstMatrix) {
        int lengthOfFirstMatrix = MainMenu.scanner.nextInt();

    }
}
