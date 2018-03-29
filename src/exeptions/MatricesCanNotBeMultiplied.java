package exeptions;

/**
 * Исключение для ситуаций, когда размеры матриц не подходят для умножения.
 */
public class MatricesCanNotBeMultiplied extends Exception {
    public MatricesCanNotBeMultiplied() {
        super("Ошибка! Матрицы не могут быть умножены!");
    }
}
