import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("--Первое задание--");
        printThreeWords();

        System.out.println("--Второе задание--");
        checkSumSign(5, 5); //Сумма положительная
        checkSumSign(8, -9); //Сумма отрицательная

        System.out.println("--Третье задание--");
        printColor(-1); //Красный
        printColor(28); //Желтый
        printColor(101); //Зеленый

        System.out.println("--Четвертое задание--");
        compareNumbers(10, 10); //a>=b
        compareNumbers(5, 6); //a<b

        System.out.println("--Пятое задание--");
        System.out.println(checkSumRange(10, 5)); //true
        System.out.println(checkSumRange(0, 0)); //false
        System.out.println(checkSumRange(10, 11)); //false

        System.out.println("--Шестое задание--");
        checkNumber(201); //Число положительное
        checkNumber(-197); //Число отрицательное

        System.out.println("--Седьмое задание--");
        System.out.println(isNegative(5)); //false
        System.out.println(isNegative(-5)); //true

        System.out.println("--Восьмое задание");
        printStrings("Hello", 4);

        System.out.println("--Девятое задание--");
        System.out.println(isLeapYear(1900)); //false
        System.out.println(isLeapYear(1992)); //true
        System.out.println(isLeapYear(2000)); //true

        System.out.println("--Десятое задание--");
        int[] arrOne = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arrTwo = { 0, 0, 1, 1, 0, 1, 0, 0, 1, 1 };
        changeArray(arrOne); //[0, 0, 1, 1, 0, 1, 0, 0, 1, 1]
        changeArray(arrTwo); //[1, 1, 0, 0, 1, 0, 1, 1, 0, 0]

        System.out.println("--Одиннадцатое задание--");
        insertArray(); //[1....100]

        System.out.println("--Двенадцатое задание--");
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 0, 1};
        multiplicationArray(arrThree); //[ 2, 10, 6, 4, 11, 8, 10, 4, 8, 0, 2]

        System.out.println("--Тринадцатое задание--");
        diagonalArray(9); // таблица 9х9 диагонально заполненная 1

        System.out.println("--Четырнадцатое задание--");
        initialArray(10, 3); // массив длиной 10 заполненный 3
    }

    /**
     * Создайте метод printThreeWords(),
     * который при вызове должен отпечатать в столбец три слова:
     * Orange, Banana, Apple
     */

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    /**
     * Создайте метод checkSumSign(),
     * в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
     * то вывести в консоль сообщение "Сумма положительная", в противном случае - "Сумма отрицательная".
     */

    public static void checkSumSign(int a, int b) {
        int sum = a+b;

        if (sum>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

    }

    /**
     * Создайте метод printColor(),
     * в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0(0 включительно), то в консоль метод должен вывести сообщение "Красный",
     * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то "Желтый",
     * если больше 100 (100 исключительно) -"Зеленый".
     */

    public static void printColor(int value){
        if(value <= 0){
            System.out.println("Красный");
        }
        else if (value <= 100) {
                System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    /**
    *Создайте метод compareNumbers(),
     * в теле которого объявите две int переменные а и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Если, а больше или равно b, то необходимо вывести в консоль сообщение "а >= b",
     * в противном случае "а < b";
     */

    public static void compareNumbers(int a, int b){
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }

    /**
     * Напишите метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да - вернуть true, в противном случае - false.
     */

    public static boolean checkSumRange(int a, int b){
        int sum = a+b;
        return sum >= 10 && sum <= 20;
    }

    /**
     * Напишите метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */

    public static void checkNumber(int a){
        if (a>=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    /**
     * Напишите метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * Замечание: ноль считаем положительным числом.
     */

    public static boolean isNegative(int a){
        return a < 0;
    }

    /**
     * Напишите метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void printStrings(String text, int number){
        for(int i = 0; i < number; i++){
            System.out.println(text);
        }
    }

    /**
     * Напишите метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й - високосный.
     */

    public static boolean isLeapYear(int year){
        if (year % 400 == 0){
            return true;
        }
        else if (year % 100 == 0){
            return false;
        }
        else {
            return year % 4 ==0;
        }
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void changeArray (int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] == 0) ? 1:0;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 .... 100;
     */

    public static void insertArray (){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    public static void multiplicationArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], .., [n][n];
     */

    public static void diagonalArray(int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            array[i][i] = 1;
            array[i][a - 1 - i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
     */

    public static void initialArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}