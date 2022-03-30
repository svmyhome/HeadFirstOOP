package CatDog;

public class Cat extends Animal{

    boolean tail;
    static int countCat = 0;
    public Cat(String name, int age, boolean tail) {
        super(name, age);
        this.tail = tail;
        countCat++;
    }

    public void PrintCat() {
        System.out.println("The Name of the cat is " + name);
    }
}
