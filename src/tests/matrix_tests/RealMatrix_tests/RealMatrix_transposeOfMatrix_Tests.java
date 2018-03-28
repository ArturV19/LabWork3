package tests.matrix_tests.RealMatrix_tests;

import matrix.RealMatrix;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование функции транспонирования матрицы.
 */
class RealMatrix_transposeOfMatrix_Tests {

    @org.junit.jupiter.api.Test
    void testTransposeOfMatrix1() {
        double[][] array = {{1,2},{3,4}};
        RealMatrix realMatrix = new RealMatrix(array);
        RealMatrix realMatrixTranspose = RealMatrix.transposeOfMatrix(realMatrix);

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{1,3},{2,4}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected,realMatrixTranspose,"Неккоректный результат транспонирования");
    }

    @org.junit.jupiter.api.Test
    void testTransposeOfMatrix2() {
        double[][] array = {{1},{2},{3}};
        RealMatrix realMatrix = new RealMatrix(array);
        RealMatrix realMatrixTranspose = RealMatrix.transposeOfMatrix(realMatrix);

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{1,2,3}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected,realMatrixTranspose,"Неккоректный результат транспонирования");
    }
}