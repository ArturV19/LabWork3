package matrix;

/**
 * Класс служит для описания объектов - вещественных матриц.
 * Также содержит методы для работы с вещественными матрицами.
 */
public class RealMatrix {

    private double[][] array;

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
     * TODO:
     * <p>
     * Транспонирование матрицы.
     *
     * @param matrix - исходная матрица.
     * @return - транспонированная матрица.
     */
    public RealMatrix transposeOfMatrix(RealMatrix matrix) {
        return matrix;
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
}
