package menu;

import exeptions.DimensionsOfMatricesAreNotEqualExeption;
import exeptions.MatricesCanNotBeMultiplied;
import matrix.RealMatrix;
import matrix.WriteMatrix;

import java.util.Scanner;

/**
 * Описание пункта меню, отвечающего за работа пользователя с матрицами.
 */
public class WorkWithMatrix {

    public static void run() {
        String userChoice;
        System.out.println("'+' - Сложение");
        System.out.println("'-' - Вычитание");
        System.out.println("'*' - Произведение");
        System.out.println("'A' - Анализ");
        System.out.println("'T' - Транспонирование");

        while (true) {
            System.out.println("\n Начало ввода:");
            System.out.println("Введите высоту первой матрицы: \n" +
                    "(ввод не натурального значения в данный момент приведёт к возврату в главное меню программы)");
            userChoice = MainMenu.scanner.next();

            int heightOfFirstMatrix;

            //Проверка, можно ли привести ввод пользователя к целому:
            if (userChoice.matches("[-+]?\\d+")) {
                heightOfFirstMatrix = Integer.parseInt(userChoice);

                mainJobWithMatrix(heightOfFirstMatrix);
            } else {
                System.out.println("Введено не целое число, возврат в главное меню...");
                break;
            }
        }
    }

    /**
     * TODO:
     * <p>
     * Основная работа программы.
     *
     * @param heightOfFirstMatrix - количество строк в первой матрице.
     */
    public static void mainJobWithMatrix(int heightOfFirstMatrix) {
        RealMatrix matrix = new RealMatrix(WriteMatrix.writeMatrix(heightOfFirstMatrix));

        System.out.println("Введите команду: ");
        String userChoiceOperation = MainMenu.scanner.next();

        switch (userChoiceOperation){
            case"+":{
                RealMatrix matrix2 = new RealMatrix(WriteMatrix.writeMatrix());
                try {
                    System.out.println("\n Результат:");
                    System.out.println(matrix.sumOfTwoMatrtix(matrix2).toString());
                } catch (DimensionsOfMatricesAreNotEqualExeption dimensionsOfMatricesAreNotEqualExeption) {
                    dimensionsOfMatricesAreNotEqualExeption.printStackTrace();
                }
                break;
            }
            case"-":{
                RealMatrix matrix2 = new RealMatrix(WriteMatrix.writeMatrix());
                try {
                    System.out.println("\n Результат:");
                    System.out.println(matrix.differenceOfTwoMatrtix(matrix2).toString());
                } catch (DimensionsOfMatricesAreNotEqualExeption dimensionsOfMatricesAreNotEqualExeption) {
                    dimensionsOfMatricesAreNotEqualExeption.printStackTrace();
                }
                break;
            }
            case"*":{
                RealMatrix matrix2 = new RealMatrix(WriteMatrix.writeMatrix());
                try {
                    System.out.println("\n Результат:");
                    System.out.println(matrix.multiplicationOfTwoMatrix(matrix2).toString());
                } catch (MatricesCanNotBeMultiplied matricesCanNotBeMultiplied) {
                    matricesCanNotBeMultiplied.printStackTrace();
                }
                break;
            }
            case "A":{
                System.out.println("\n Результат:");
                RealMatrix.analysisOfMatrix(matrix);
                break;
            }
            case "T":{
                System.out.println("\n Результат:");
                System.out.println(RealMatrix.transposeOfMatrix(matrix).toString());
                break;
            }
            default:{
                System.out.println("Ошибка! Неизвестная команда.");
            }
        }
    }
}
