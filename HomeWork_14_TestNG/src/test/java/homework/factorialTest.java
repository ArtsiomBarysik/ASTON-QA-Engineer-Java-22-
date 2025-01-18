package homework;

import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class factorialTest {
    @Test (description = "Проверка функции с нулем")
    public void factorialWithZero() {
        Assert.assertEquals(Main.getFactorial(0), 1);
    }

    @Test (description = "Проверка функции с допустимым числом")
    public void factorialWithNumber() {
        Assert.assertEquals(Main.getFactorial(5), 120);
    }

    @Test (description = "Проверка функции на исключение при отрицательном числе")
    public void factorialWithNegativeNumber() {
        Assert.expectThrows(IllegalArgumentException.class, () -> {
            Main.getFactorial(-1);
        });
    }
    @Test (description = "Проверка функции на исключение при недопустимом числе")
    public void factorialWithBigNumber() {
        Assert.expectThrows(IllegalArgumentException.class, () -> {
            Main.getFactorial(32);
        });
    }
}
