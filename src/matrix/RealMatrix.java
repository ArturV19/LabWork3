package matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Класс служит для описания объектов - вещественных матриц.
 * Также содержит методы для работы с вещественными матрицами.
 */
public class RealMatrix {

    private double[][] array;

    /**
     * Конструктор матрицы.
     *
     * @param array - массив вещественных чисел.
     */
    public RealMatrix(double[][] array) {
        this.array = array;
    }

    /**
     * TODO:
     * <p>
     * Сложение двух матриц.
     *
     * @param matrix1 - первая слагаемая матрица.
     * @param matrix2 - вторая слагаемая матрица.
     * @return - сумма матриц.
     */
    public RealMatrix sumOfTwoMatrtix(RealMatrix matrix1, RealMatrix matrix2) {
        return matrix1;
    }


    /**
     * TODO:
     * <p>
     * Вычитание двух матриц.
     *
     * @param matrix1 - уменьшаемая матрица.
     * @param matrix2 - вычитаемая матрица.
     * @return - сумма матриц.
     */
    public RealMatrix differenceOfTwoMatrtix(RealMatrix matrix1, RealMatrix matrix2) {
        return matrix1;
    }

    /**
     * TODO:
     * <p>
     * Умножение двух матриц.
     *
     * @param matrix1 - первая слагаемая.
     * @param matrix2 - вторая слагаемая.
     * @return - произведение матриц.
     */
    public RealMatrix multiplicationOfTwoMatrix(RealMatrix matrix1, RealMatrix matrix2) {
        return matrix1;
    }

    /**
     * Транспонирование матрицы.
     * A^T[i][j] = A[j][i]
     *
     * @param matrix - исходная матрица.
     * @return - транспонированная матрица.
     */
    public static RealMatrix transposeOfMatrix(RealMatrix matrix) {
        double[][] originalArray = matrix.getArray();
        double[][] newArray = new double[originalArray[0].length][originalArray.length];
        for (int line = 0; line < originalArray[0].length; line++) {
            for (int row = 0; row < originalArray.length; row++) {
                newArray[line][row] = originalArray[row][line];
            }
        }

        return new RealMatrix(newArray);
    }

    /**
     * TODO:
     * <p>
     * Анализ матрицы - проверка типа.
     * 1.) Квадратная?
     * 2.) Диагональная?
     * 3.) Нулевая?
     * 4.) Единичная?
     *
     * @param matrix - анализируемая матрица.
     * @return
     */
    public void analysisOfMatrix(RealMatrix matrix) {

    }


    /**
     * Получение элементов матрицы в виде двумерного массива.
     *
     * @return - двумерный массив.
     */
    public double[][] getArray() {
        return array;
    }

    /**
     * Задание элементов матрицы в виде двумерного массива.
     *
     * @param array - двумерный массив.
     */
    public void setArray(double[][] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        RealMatrix realMatrix = (RealMatrix) obj;
        if(Arrays.deepEquals(this.array,(realMatrix.getArray()))){
            return true;
        }
        return false;
    }
}
