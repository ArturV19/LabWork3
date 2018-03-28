package exeptions;

/**
 * Исключение для ситуаций, когда рамеры матриц должны быть одинаковы, но это не так.
 */
public class DimensionsOfMatricesAreNotEqualExeption extends Exception {
    public DimensionsOfMatricesAreNotEqualExeption() {
        super("Ошибка! Размеры двумерных матриц не одинаковы!");
    }
}
