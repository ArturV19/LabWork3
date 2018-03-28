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
        int lengthOfMatrix = MainMenu.scanner.nextInt();
        double[][] arrayOfDouble = new double[heightOfMatrix][lengthOfMatrix];

        for (int line = 0; line < heightOfMatrix; line++) {
            for (int row = 0; row < lengthOfMatrix; row++) {
                arrayOfDouble[line][row] = MainMenu.scanner.nextDouble();
            }
        }

        return arrayOfDouble;
    }
}
