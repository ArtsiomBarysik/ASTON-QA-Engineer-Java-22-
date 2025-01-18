package homework.junit;
import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeWork14Tests {
    @Test
    @DisplayName("Проверка функции c нулем")
    public void factorialWithZero() {
        assertTrue(Main.getFactorial(0) == 1);
    }
    @Test
    @DisplayName("Проверка функции c допустимым числом")
    public void factorialWithNumber() {
        assertTrue(Main.getFactorial(5) == 120);
    }
    @Test
    @DisplayName("Проверка функции на отрицательное число")
    public void factorialWithNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.getFactorial(-1);
        });
    }
    @Test
    @DisplayName("Проверка функции на недопустимое число")
    public void factorialWithBigNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.getFactorial(32);
        });
    }
}
