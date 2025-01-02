/** Создать классы Собака и Кот с наследованием от класса Животное.
 Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 Результатом действия будет печать в консоль.
 У каждого животного есть ограничение на действия (бег: кот 200 метров, собака 500 метров;
 плавание: кот не умеет плавать, собака 10 метров)
 Добавить подсчет созданных котов, собак и животных.
 Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
 1. Сделать так, чтобы в миске с едой не могло получиться количества еды
 (например, в миске 10 еды, а кот пытается покушать 15-20).
 2. Каждому коту нужно добавить поле сытости (когда создаем котов, они голодны).
 Если коту удалось покушать (хватило еды), сытость = true.
 3. Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт
 (это сделано для упрощения логики программы).
 4. Создать массив котов и миску с едой, попросить всех котов покушать из этой миски
 и потом вывести информацию о сытости котов в консоль.
 5. Добавить метод, с помощью которого можно было бы добавлять еду в миску.
 */
public class Main {
    public static void main(String[] args) {
        // Создаю животных
        Animal lizard = new Animal("Кеша");
        Dog dog = new Dog("Шрек", "Зеленый");
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Чип", "Хаки");
        catArray[1] = new Cat("Тимофей", "Чёрный");
        catArray[2] = new Cat("Семён", "Белый");
        catArray[3] = new Cat("Шери", "Пепельный");
        catArray[4] = new Cat("Йося", "Хаки");
        // Проверяю методы бега и плаванья
        lizard.run(10);
        lizard.swim(10);
        dog.run(499);
        dog.run(550);
        dog.swim(-1);
        dog.swim(9);
        dog.swim(11);
        catArray[1].run(180);
        catArray[4].run(500);
        catArray[2].swim(15);
        // Считаю количество животных
        System.out.println("Кол-во животных класса Animal: " + Animal.getAnimalClassCount());
        System.out.println("Кол-во животных класса Dog: " + Dog.getDogClassCount());
        System.out.println("Кол-во животных класса Cat: " + Cat.getCatClassCount());
        System.out.println("Общее кол-во животных класса Animal и наследников: " + Animal.getTotalCount());
        // Создаю миску без еды, наполняю ее и проверяю кол-во еды
        Bowl firstBowl = new Bowl(0);
        firstBowl.checkFood();
        firstBowl.addFood(24);
        firstBowl.checkFood();
        // Кормлю массив котов
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eatFromBowl(5,firstBowl);
        }
        // В миске остается 4 единицы еды, Йося остался голодным, проверяю остаток еды
        firstBowl.checkFood();
        // Проверяю их сытость
        for (int i = 0; i<catArray.length; i++) {
            catArray[i].checkSatiety();
        }
        // Проверка 2 задания
        Circle circle =  new Circle(3, "Black", "Red");
        Rectangle rectangle = new Rectangle(14, 4, "Green", "Blue");
        Triangle triangle = new Triangle(2, 2, 2, "Grey", "Yellow");
        circle.printCharacteristics();
        rectangle.printCharacteristics();
        triangle.printCharacteristics();
    }
}