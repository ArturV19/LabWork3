package tests.matrix_tests.RealMatrix_tests;

import exeptions.DimensionsOfMatricesAreNotEqualExeption;
import matrix.RealMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование метода сложения двух матриц.
 */
class RealMatrix_sumOfTwoMatrix_Tests {

    @Test
    void testSumOfTwoMatrix_1() throws DimensionsOfMatricesAreNotEqualExeption {
        double[][] array = {{1, 2}, {3, 4}};
        RealMatrix realMatrix1 = new RealMatrix(array);

        RealMatrix realMatrix2 = new RealMatrix(new double[][]{{1, 2}, {0, 1}});

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{2, 4}, {3, 5}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected, realMatrix1.sumOfTwoMatrtix(realMatrix2), "Неккоректный результат сложения");
    }


    @Test
    void testSumOfTwoMatrix_2() throws DimensionsOfMatricesAreNotEqualExeption {
        double[][] array = {{0, 0}, {0, 0}};
        RealMatrix realMatrix1 = new RealMatrix(array);

        RealMatrix realMatrix2 = new RealMatrix(new double[][]{{0.5}});

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{0.5, 0.5}, {0.5, 0.5}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected, realMatrix1.sumOfTwoMatrtix(realMatrix2), "Неккоректный результат сложения");
    }


    @Test
    void testSumOfTwoMatrix_3() throws DimensionsOfMatricesAreNotEqualExeption {
        double[][] array = {{0, 0}, {0, 0}};
        RealMatrix realMatrix1 = new RealMatrix(array);

        RealMatrix realMatrix2 = new RealMatrix(new double[][]{{0.5, 4}});

        Exception e = null;

        assertThrows(DimensionsOfMatricesAreNotEqualExeption.class, () -> realMatrix1.sumOfTwoMatrtix(realMatrix2));
    }
}
