package tests.matrix_tests.RealMatrix_tests;

import matrix.RealMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование метода транспонирования матрицы.
 */
class RealMatrix_transposeOfMatrix_Tests {


    @Test
    void testTransposeOfMatrix_1() {
        double[][] array = {{1, 2}, {3, 4}};
        RealMatrix realMatrix = new RealMatrix(array);
        RealMatrix realMatrixTranspose = RealMatrix.transposeOfMatrix(realMatrix);

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{1, 3}, {2, 4}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected, realMatrixTranspose, "Неккоректный результат транспонирования");
    }


    @Test
    void testTransposeOfMatrix_2() {
        double[][] array = {{1}, {2}, {3}};
        RealMatrix realMatrix = new RealMatrix(array);
        RealMatrix realMatrixTranspose = RealMatrix.transposeOfMatrix(realMatrix);

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{1, 2, 3}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected, realMatrixTranspose, "Неккоректный результат транспонирования");
    }


    @Test
    void testTransposeOfMatrix_3() {
        double[][] array = {{1.5}};
        RealMatrix realMatrix = new RealMatrix(array);
        RealMatrix realMatrixTranspose = RealMatrix.transposeOfMatrix(realMatrix);

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{1.5}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected, realMatrixTranspose, "Неккоректный результат транспонирования");
    }
}