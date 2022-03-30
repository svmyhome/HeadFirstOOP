package CatDog;

public class Dog extends Animal{

    static int countDog = 0;
    public Dog(String name, int age) {
        super(name, age);
        countDog++;
    }
}
