public class Main {
    /**
     * Создать массив из 5 сотрудников
     */
    public static void main(String[] args) {
        // Создаю массив из 5 сотрудников
        Employee[] employeeArray = new Employee[5];
        // Заполняю его (все данные случайны)
        employeeArray[0] = new Employee(1, "Александров Арсений Дмитриевич","Дессинатор","Arsen.Alexandrov@email.com",375296472891L, 55.500,30);
        employeeArray[1] = new Employee(2, "Федоров Давид Сергеевич","Инженер","David.Fedorov@email.com",375298267026L, 75.300, 25);
        employeeArray[2] = new Employee(3, "Соколова Варвара Евгеньевна", "Конструктор", "Varvara.Sokol@email.com", 375293769174L,50.700, 29);
        employeeArray[3] = new Employee(4, "Власова Кристина Константиновна", "Художник", "Kris.Vlasova@email.com", 375298690278L, 49.800, 27);
        employeeArray[4] = new Employee(5, "Елизаров Иван Кириллович", "Юрист", "Ivan.Elizar@email.com", 375297690653L, 70.200, 32);
        // Распечатываю в консоль полученный массив
        employeeArray[0].printInfo();
        employeeArray[1].printInfo();
        employeeArray[2].printInfo();
        employeeArray[3].printInfo();
        employeeArray[4].printInfo();
        //По аналогии со вторым заданием делаю массив парков
        Park[] parksArray = new Park[3];
        parksArray[0] = new Park("Горького", "Минск","Колесо обозрения-54 метра","15:00-21:00",5.2);
        parksArray[1] = new Park("Жилибера", "Гродно","Колесо обозрения-42 метра","12:00-20:00",5.2);
        parksArray[2] = new Park("Парк культуры и отдыха", "Брест","Колесо обозрения-40 метров","11:00-20:00",5.2);
        //Так же распечатываю в консоль полученный массив
        parksArray[0].printPark();
        parksArray[1].printPark();
        parksArray[2].printPark();
        }
    }
