public class Main {
    /**
     * Создать массив из 5 сотрудников
     */
    public static void main(String[] args) {
        // Создаю массив из 5 сотрудников
        Employee[] employeeArray = new Employee[5];
        // Заполняю его (все данные случайны)
        employeeArray[0] = new Employee(1, "Александров Арсений Дмитриевич", "Дессинатор", "Arsen.Alexandrov@email.com", 375296472891L, 55.500, 30);
        employeeArray[1] = new Employee(2, "Федоров Давид Сергеевич", "Инженер", "David.Fedorov@email.com", 375298267026L, 75.300, 25);
        employeeArray[2] = new Employee(3, "Соколова Варвара Евгеньевна", "Конструктор", "Varvara.Sokol@email.com", 375293769174L, 50.700, 29);
        employeeArray[3] = new Employee(4, "Власова Кристина Константиновна", "Художник", "Kris.Vlasova@email.com", 375298690278L, 49.800, 27);
        employeeArray[4] = new Employee(5, "Елизаров Иван Кириллович", "Юрист", "Ivan.Elizar@email.com", 375297690653L, 70.200, 32);
        // Распечатываю в консоль полученный массив
        for (int j = 0; j < 5; j++) {
            employeeArray[j].printInfo();
        }
        //Создаю массив парков и аттракционов в этих парках
        Park.ParkAttraction[] attractionsMinsk = {
                new Park("Горького", "Минск").new ParkAttraction("Колесо обозрения-54 метра(Открытая кабинка)", "15:00-21:00", 4.5),
                new Park("Горького", "Минск").new ParkAttraction("Колесо обозрения-54 метра(Закрытая кабинка)", "15:00-21:00", 5.5)
        };
        Park.ParkAttraction[] attractionsGrodno = {
                new Park("Жилибера", "Гродно").new ParkAttraction("Колесо обозрения-42 метра", "9:00-21:00", 4.5),
                new Park("Жилибера", "Гродно").new ParkAttraction("Космическое такси", "10:00-21:00", 4.5)
        };
        Park.ParkAttraction[] attractionsBrest = {
                new Park("Культуры и отдыха", "Брест").new ParkAttraction("Колесо обозрения-40 метра", "11:00-20:00", 3.2),
                new Park("Культуры и отдыха", "Брест").new ParkAttraction("Солнышко", "11:00-20:00", 4.5)
        };
        Park[] parksArray = {
                new Park("Горького", "Минск", attractionsMinsk),
                new Park("Жилибера", "Гродно", attractionsGrodno),
                new Park("Культуры и отдыха", "Брест", attractionsBrest)
        };

        //Так же распечатываю в консоль полученный массив
        for (int i = 0; i < 3; i++) {
            parksArray[i].printPark();
        }
        //Вношу изменения
        parksArray[0].getAttraction()[1].setCost(4.5);
        parksArray[1].getAttraction()[0].setTime("12:00-20:00");
        parksArray[2].getAttraction()[0].setCost(4.5);
        //И проверяю
        System.out.println("Корректировка данных");
        for (int i = 0; i < 3; i++) {
            parksArray[i].printPark();
        }
    }
}
