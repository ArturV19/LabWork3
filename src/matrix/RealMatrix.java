package matrix;

import exeptions.DimensionsOfMatricesAreNotEqualExeption;

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
     * Сложение двух матриц.
     *
     * @param matrix2 - вторая слагаемая матрица.
     * @return - сумма матриц.
     */
    public RealMatrix sumOfTwoMatrtix(RealMatrix matrix2) throws DimensionsOfMatricesAreNotEqualExeption {

        //Массив, который станет основой для возвращаемой матрицы:
        double[][] respondingArray;

        //Если первая матрица - единичная:
        if (matrixIsIdentity(this)) {
            respondingArray = new double[matrix2.array.length][matrix2.array[0].length];
            for (int x = 0; x < matrix2.array.length; x++) {
                for (int y = 0; y < matrix2.array[0].length; y++) {
                    respondingArray[x][y] = matrix2.array[x][y] + this.array[0][0];
                }
            }
            return new RealMatrix(respondingArray);
        }

        //Если вторая матрица - единичная:
        else if (matrixIsIdentity(matrix2)) {
            respondingArray = new double[this.array.length][this.array[0].length];
            for (int x = 0; x < this.array.length; x++) {
                for (int y = 0; y < this.array[0].length; y++) {
                    respondingArray[x][y] = this.array[x][y] + matrix2.array[0][0];
                }
            }
            return new RealMatrix(respondingArray);
        }

        //Если обе матрицы не единичные:
        else {

            //Если размеры матриц не равны:
            if ((this.array.length != matrix2.array.length) || (matrix2.array[0].length != matrix2.array[0].length)) {
                throw new DimensionsOfMatricesAreNotEqualExeption();
            }

            //Если размеры матриц равны:
            else {
                respondingArray = new double[this.array.length][this.array[0].length];
                for (int x = 0; x < this.array.length; x++) {
                    for (int y = 0; y < this.array[0].length; y++) {
                        respondingArray[x][y] = this.array[x][y] + matrix2.array[x][y];
                    }
                }
                return new RealMatrix(respondingArray);
            }
        }
    }


    /**
     * Вычитание двух матриц.
     *
     * @param matrix2 - вычитаемая матрица.
     * @return - сумма матриц.
     */
    public RealMatrix differenceOfTwoMatrtix(RealMatrix matrix2) throws DimensionsOfMatricesAreNotEqualExeption {

        //Массив, который станет основой для возвращаемой матрицы:
        double[][] respondingArray;

        //Если вторая матрица - единичная:
        if (matrixIsIdentity(matrix2)) {
            respondingArray = new double[this.array.length][this.array[0].length];
            for (int x = 0; x < this.array.length; x++) {
                for (int y = 0; y < this.array[0].length; y++) {
                    respondingArray[x][y] = this.array[x][y] - matrix2.array[0][0];
                }
            }
            return new RealMatrix(respondingArray);
        } else {
            //Если размеры матриц не равны:
            if ((this.array.length != matrix2.array.length) || (matrix2.array[0].length != matrix2.array[0].length)) {
                throw new DimensionsOfMatricesAreNotEqualExeption();
            }

            //Если размеры матриц равны:
            else {
                respondingArray = new double[this.array.length][this.array[0].length];
                for (int x = 0; x < this.array.length; x++) {
                    for (int y = 0; y < this.array[0].length; y++) {
                        respondingArray[x][y] = this.array[x][y] + matrix2.array[x][y];
                    }
                }
                return new RealMatrix(respondingArray);
            }
        }
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


    /**
     * Проверка, является ли матрица единичной.
     *
     * @param realMatrix - проверяемая матрица.
     * @return результат проверки.
     */
    private static boolean matrixIsIdentity(RealMatrix realMatrix) {
        if (realMatrix.getArray().length == 1) {
            if (realMatrix.getArray()[0].length == 1) {
                return true;
            }
        }
        return false;
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
        if (Arrays.deepEquals(this.array, (realMatrix.getArray()))) {
            return true;
        }
        return false;
    }
}
