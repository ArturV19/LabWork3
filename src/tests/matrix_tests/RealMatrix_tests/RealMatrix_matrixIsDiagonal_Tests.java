package tests.matrix_tests.RealMatrix_tests;

import matrix.RealMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тестирование функции проверки, является ли RealMatrix-матрица диагональной.
 */
public class RealMatrix_matrixIsDiagonal_Tests {
    @Test
    void testMatrixIsDiagonal_ZeroDiagonalMatrix() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0}, {0, 0}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsDiagonal(realMatrix), "Проверка того, является ли матрица диагональной неккоректна");
    }


    @Test
    void testMatrixIsDiagonal_ZeroNonDiagonalMatrix() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0}, {0, 0}, {0, 0}});

        //Эталонный ответ:
        boolean answerExpected = false;

        assertEquals(answerExpected, RealMatrix.matrixIsDiagonal(realMatrix), "Проверка того, является ли матрица диагональной неккоректна");
    }


    @Test
    void testMatrixIsDiagonal_ZeroMatrix_IdentityMatrix() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsDiagonal(realMatrix), "Проверка того, является ли матрица диагональной неккоректна");
    }


    @Test
    void testMatrixIsDiagonal_NonZeroDiagonalMatrix_1() {
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0}, {0, 1}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsDiagonal(realMatrix), "Проверка того, является ли матрица диагональной неккоректна");
    }

    @Test
    void testMatrixIsDiagonal_NonZeroDiagonalMatrix_2(){
        RealMatrix realMatrix = new RealMatrix(new double[][]{{0, 0.0}, {0, 1}});

        //Эталонный ответ:
        boolean answerExpected = true;

        assertEquals(answerExpected, RealMatrix.matrixIsDiagonal(realMatrix), "Проверка того, является ли матрица диагональной неккоректна");
    }
}
