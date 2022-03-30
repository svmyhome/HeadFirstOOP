package CatDog;

public class Animal {
    String name;
    int age;
    static int countAll = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        countAll++;
    }
}
