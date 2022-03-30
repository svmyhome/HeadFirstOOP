package CatDog;

public class MainCat {
    public static void main(String[] args) {
        System.out.println("countCat " + Cat.countCat);
        System.out.println("CountAll" + Animal.countAll);
        Cat cat1 = new Cat("barsic", 15, true);
        Dog dog1 = new Dog("Barbos", 13);
        System.out.println("countCat " + Cat.countCat);
        System.out.println("countDof " + Dog.countDog);
        cat1.PrintCat();
        System.out.println(cat1.tail);
        Cat cat2 = new Cat("12312d", 15, false);
        System.out.println("countCat " + Cat.countCat);
        cat2.PrintCat();
        System.out.println(cat2.tail);
        System.out.println("CountAll" + Animal.countAll);
    }
}
