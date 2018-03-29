package matrix;

import menu.MainMenu;

/**
 * Класс содердит методы ввода массивов, позже преобразованных в матрицы.
 */
public class WriteMatrix {

    /**
     * Ввод матрицы при заранее известной длине.
     *
     * @param heightOfMatrix - высота (количество строк) матрицы.
     * @return - массив вещественных чисел.
     */
    public static double[][] writeMatrix(int heightOfMatrix) {
        System.out.println("Введите длину матрицы:");

        int lengthOfMatrix = MainMenu.scanner.nextInt();

        double[][] arrayOfDouble = new double[heightOfMatrix][lengthOfMatrix];

        System.out.println("Введите матрицу:");

        for (int line = 0; line < heightOfMatrix; line++) {
            for (int row = 0; row < lengthOfMatrix; row++) {
                arrayOfDouble[line][row] = MainMenu.scanner.nextDouble();
            }
        }

        return arrayOfDouble;
    }

    /**
     * Ввод массива - основы матрицы при заранее неизвестных размерах.
     *
     * @return - массив вещественных чисел, введённый пользователем.
     */
    public static double[][] writeMatrix() {
        System.out.println("Введите размеры матрицы:");
        int heightOfMatrix = MainMenu.scanner.nextInt();
        int lengthOfMatrix = MainMenu.scanner.nextInt();

        double[][] arrayOfDouble = new double[heightOfMatrix][lengthOfMatrix];

        System.out.println("Введите матрицу:");

        for (int line = 0; line < heightOfMatrix; line++) {
            for (int row = 0; row < lengthOfMatrix; row++) {
                arrayOfDouble[line][row] = MainMenu.scanner.nextDouble();
            }
        }

        return arrayOfDouble;
    }
}
