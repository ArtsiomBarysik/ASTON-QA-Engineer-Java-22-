/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 * MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные
 * исключения MyArraySizeException и MyArrayDataException
 * вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        try {
            int result = sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
//Метод преобразования и суммирования массива из String в int
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива не 4х4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Недопустимый тип переменной в ячейке массива: [" + i + "] [" + j + "], переменная: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}
//Исключение размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException (String message) {
        super(message);
    }
}
//Исключение неверного типа переменной в массиве
class MyArrayDataException extends Exception {
    public MyArrayDataException (String message) {
        super(message);
    }
}
