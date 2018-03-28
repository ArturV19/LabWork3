package menu;

import java.util.Scanner;

/**
 * Главное меню.
 */
public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Запуск главного меню.
     */
    public static void run() {
        String userChoice;

        metka:
        while (true) {
            System.out.println(" ");
            System.out.println("Главное меню программы:");
            System.out.println("1 или work - работа с матрицами");
            System.out.println("2 или help - помощь по работе с программой");
            System.out.println("0 или exit - выход");

            userChoice = scanner.next();
            userChoice = parserOfUserChoice(userChoice);

            switch (userChoice) {
                case "1": {
                    WorkWithMatrix.run();
                    break;
                }
                case "2": {
                    ReferenceView.viewReference();
                    break;
                }
                case "0": {
                    System.out.println("До свидания, пользователь!");
                    System.out.println("Удачного дня!");
                    break metka;
                }
                default: {
                    System.out.println("Ошибка, не распознана команда: " + userChoice);
                }
            }
        }
    }

    /**
     * Преобразование ввода пользователя к виду 1,2,3.
     *
     * @param userChoice - выбор пользователя.
     * @return - строка состоящая из одного корректного символа, если команда введена верно.
     */
    private static String parserOfUserChoice(String userChoice) {
        switch (userChoice.toLowerCase()) {
            case "work": {
                return "1";
            }
            case "help": {
                return "2";
            }
            case "exit": {
                return "0";
            }
            default: {
                return userChoice;
            }
        }
    }

}
