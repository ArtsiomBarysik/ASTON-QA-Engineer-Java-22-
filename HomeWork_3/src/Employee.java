/**
 * Создать класс "сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутри класса "Сотрудник" написать метод, который выводит информацию об объекте в консоль.
 */

public class Employee {
    private int pnId; //Исключительно для удобства(по заданию этого поля нет)
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private double salary;
    private int age;
    // конструктор класса Employee
    public Employee (int pnId, String fullName, String position, String email, long phoneNumber, double salary, int age){
        this.pnId = pnId;
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    // Метод, который выводит информацию о сотрудниках в консоль
    public void printInfo() {
        System.out.println("Анкета сотрудника: " +pnId);
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}