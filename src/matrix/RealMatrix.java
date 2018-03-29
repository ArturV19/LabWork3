package matrix;

import exeptions.DimensionsOfMatricesAreNotEqualExeption;
import exeptions.MatricesCanNotBeMultiplied;

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
     * Слажение данной матрицы со слагаемой матрицей.
     *
     * @param matrix2 - слагаемая матрица.
     * @return - сумма двух матриц.
     * @throws DimensionsOfMatricesAreNotEqualExeption - когда размеры матриц не подходят для сложения.
     */
    public RealMatrix sumOfTwoMatrtix(RealMatrix matrix2) throws DimensionsOfMatricesAreNotEqualExeption {

        //Массив, который станет основой для возвращаемой матрицы:
        double[][] respondingArray;

        //Если первая матрица - единичная:
        if (matrixIsIdentity(this)) {
            respondingArray = new double[matrix2.array.length][matrix2.array[0].length];
            for (int line = 0; line < matrix2.array.length; line++) {
                for (int row = 0; row < matrix2.array[0].length; row++) {
                    respondingArray[line][row] = matrix2.array[line][row] + this.array[0][0];
                }
            }
            return new RealMatrix(respondingArray);
        }

        //Если вторая матрица - единичная:
        else if (matrixIsIdentity(matrix2)) {
            respondingArray = new double[this.array.length][this.array[0].length];
            for (int line = 0; line < this.array.length; line++) {
                for (int row = 0; row < this.array[0].length; row++) {
                    respondingArray[line][row] = this.array[line][row] + matrix2.array[0][0];
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
                for (int line = 0; line < this.array.length; line++) {
                    for (int row = 0; row < this.array[0].length; row++) {
                        respondingArray[line][row] = this.array[line][row] + matrix2.array[line][row];
                    }
                }
                return new RealMatrix(respondingArray);
            }
        }
    }


    /**
     * Вычитание матрицы из данной.
     *
     * @param matrix2 - вычитаемая матрица.
     * @return - результат вычитания.
     * @throws DimensionsOfMatricesAreNotEqualExeption - когда размеры матриц не подходят для операции разности.
     */
    public RealMatrix differenceOfTwoMatrtix(RealMatrix matrix2) throws DimensionsOfMatricesAreNotEqualExeption {

        //Массив, который станет основой для возвращаемой матрицы:
        double[][] respondingArray;

        //Если вторая матрица - единичная:
        if (matrixIsIdentity(matrix2)) {
            respondingArray = new double[this.array.length][this.array[0].length];
            for (int line = 0; line < this.array.length; line++) {
                for (int row = 0; row < this.array[0].length; row++) {
                    respondingArray[line][row] = this.array[line][row] - matrix2.array[0][0];
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
                for (int line = 0; line < this.array.length; line++) {
                    for (int row = 0; row < this.array[0].length; row++) {
                        respondingArray[line][row] = this.array[line][row] - matrix2.array[line][row];
                    }
                }
                return new RealMatrix(respondingArray);
            }
        }
    }


    /**
     * Умножение двух матриц.
     *
     * @param matrix2 - вторая слагаемая.
     * @return - произведение матриц.
     */
    public RealMatrix multiplicationOfTwoMatrix(RealMatrix matrix2) throws MatricesCanNotBeMultiplied {
        double[][] respondingArray;

        //Если матрицы не единичные:
        if (!matrixIsIdentity(this) && !matrixIsIdentity(matrix2)) {
            if (this.array[0].length != matrix2.array.length) {
                throw new MatricesCanNotBeMultiplied();
            }

            int m = this.array.length;
            int n = this.array[0].length;
            int k = matrix2.array[0].length;

            //Массив - основа для матрицы-произведения:
            respondingArray = new double[m][k];

            //Вспомогательная переменная для вычисления текущего элементы матрицы-произведения:
            double element;

            for (int line = 0; line < m; line++) {
                for (int row = 0; row < k; row++) {
                    element = 0;
                    for (int i = 0; i < n; i++) {
                        element += (this.array[line][i] * matrix2.array[i][row]);
                    }
                    array[line][row] = element;
                }
            }

            return new RealMatrix(array);
        }

        //Если первая матрица - единичная:
        else if (matrixIsIdentity(this)) {
            respondingArray = new double[matrix2.array.length][matrix2.array[0].length];
            for (int line = 0; line < matrix2.array.length; line++) {
                for (int row = 0; row < matrix2.array[0].length; row++) {
                    respondingArray[line][row] = matrix2.array[line][row] * this.array[0][0];
                }
            }

            return new RealMatrix(respondingArray);
        }

        //Если вторая матрица - единичная:
        else {
            respondingArray = new double[this.array.length][this.array[0].length];
            for (int line = 0; line < this.array.length; line++) {
                for (int row = 0; row < this.array[0].length; row++) {
                    respondingArray[line][row] = this.array[line][row] * matrix2.array[0][0];
                }
            }

            return new RealMatrix(respondingArray);
        }
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
     * Анализ матрицы - проверка типа матрицы:
     * 1.) Квадратная?
     * 2.) Диагональная?
     * 3.) Нулевая?
     * 4.) Единичная?
     *
     * @param matrix - анализируемая матрица.
     *               <p>
     *               Итог работы метода - вывод результатов анализа матрицы в консоль.
     */
    public static void analysisOfMatrix(RealMatrix matrix) {
        if (matrix.array.length == matrix.array[0].length) {
            System.out.println("1. Матрица квадратная");
        } else {
            System.out.println("1. Матрица НЕ квадратная");
        }

        if (matrixIsDiagonal(matrix)) {
            System.out.println("2. Матрица диагональная");
        } else {
            System.out.println("2. Матрица НЕ диагональная");
        }

        if (matrixIsZeros(matrix)) {
            System.out.println("3. Матрица нулевая");
        } else {
            System.out.println("3. Матрица НЕ нулевая");
        }

        if (matrixIsIdentity(matrix)) {
            System.out.println("4. Матрица единичная");
        } else {
            System.out.println("4. Матрица НЕ единичная");
        }
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
     * Проверка, является ли матрица диагональной.
     * Сначала идёт проверка на квадратичность.
     * Затем, если матрица квадратная, последовательно проверяются все элементы матрицы,
     * кроме элементов на главной диагонали.
     *
     * @param realMatrix - проверяемая матрица.
     * @return результат проверки.
     */
    public static boolean matrixIsDiagonal(RealMatrix realMatrix) {
        int height = realMatrix.array.length;
        int length = realMatrix.array[0].length;
        if (height != length) {
            return false;
        }
        for (int n = 0; n < height; n++) {
            for (int m = 0; m < length; m++) {
                if (n != m) {
                    if (realMatrix.array[n][m] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    /**
     * Проверка, является ли матрица нулевой.
     * Последовательно проверяются все элементы матрицы.
     *
     * @param realMatrix - проверяемая матрица.
     * @return результат проверки.
     */
    public static boolean matrixIsZeros(RealMatrix realMatrix) {
        int height = realMatrix.array.length;
        int length = realMatrix.array[0].length;
        for (int n = 0; n < height; n++) {
            for (int m = 0; m < length; m++) {
                if (realMatrix.array[n][m] != 0) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * Проверка, является ли матрица единичной.
     *
     * @param realMatrix - проверяемая матрица.
     * @return результат проверки.
     */
    public static boolean matrixIsIdentity(RealMatrix realMatrix) {
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
