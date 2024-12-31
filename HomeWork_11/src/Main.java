public class Main {
    public static void main(String[] args) {
        Animal test = new Animal("Йося");
        test.run(10);
        test.swim(0);
        Cat josep = new Cat("Йося","Хаки");
        josep.run(201);
        josep.swim(10);
        Dog dog1 = new Dog("Шарик","синий");
        dog1.run(-10);
        dog1.run(499);
        dog1.run(501);
        dog1.swim(-99);
        dog1.swim(9);
        dog1.swim(99);
        System.out.println("животные " + Animal.getAnimalClassCount());
        System.out.println("общее " + Animal.getTotalCount());
        System.out.println("коты " + Cat.getCatClassCount());
        System.out.println("собаки " + Dog.getDogClassCount());
        josep.checkSatiety();
    }
}