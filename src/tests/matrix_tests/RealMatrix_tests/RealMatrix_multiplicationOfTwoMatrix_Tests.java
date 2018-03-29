package tests.matrix_tests.RealMatrix_tests;

import exeptions.MatricesCanNotBeMultiplied;
import matrix.RealMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование метода произведения матриц.
 */
class RealMatrix_multiplicationOfTwoMatrix_Tests {

    @Test
    void testMultiplicationOfTwoMatrix_1() throws MatricesCanNotBeMultiplied {
        double[][] array1 = {{1, 2}, {3, 4}};
        RealMatrix realMatrix1 = new RealMatrix(array1);

        double[][] array2 = {{1, 2}, {0, 1}};
        RealMatrix realMatrix2 = new RealMatrix(array2);

        //Эталонные данные:
        RealMatrix realMatrixExpected = new RealMatrix(new double[][]{{1.0, 4.0}, {3.0, 10.0}});

        //Сравнение результатов работы с эталонными данными:
        assertEquals(realMatrixExpected, realMatrix1.multiplicationOfTwoMatrix(realMatrix2), "Неккоректный результат произведения");
    }
}