package tests.matrix_tests.RealMatrix_tests;

import matrix.RealMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование метода проверки, является ли RealMatrix-матрица нулевой.
 */
class RealMatrix_matrixIsZeros_Tests {

    @Test
    void testMatrixIsZeros_ZeroMatrix_1() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0}, {0, 0}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsZeros(realMatrix), "Проверка того, является ли матрица нулевой неккоректна");
    }


    @Test
    void testMatrixIsZeros_ZeroMatrix_2() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0}, {0, 0}, {0, 0}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsZeros(realMatrix), "Проверка того, является ли матрица нулевой неккоректна");
    }


    @Test
    void testMatrixIsZeros_ZeroMatrix_IdentityMatrix() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsZeros(realMatrix), "Проверка того, является ли матрица нулевой неккоректна");
    }


    @Test
    void testMatrixIsZeros_NonZeroMatrix() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0}, {0, 1}});

        //Эталонный ответ:
        boolean answerExpected = false;

        assertEquals(answerExpected, RealMatrix.matrixIsZeros(realMatrix), "Проверка того, является ли матрица нулевой неккоректна");
    }
}