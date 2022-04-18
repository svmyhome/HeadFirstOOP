package ArraysTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {

        System.out.println("_------------------------ ARR 1-------------------------------------------");
        ArrayList<String> arr1 = new ArrayList<>();
        System.out.println("Lenght of arr1 " + arr1.size() + "-> " + arr1);
        arr1.add("First");
        arr1.add("Second");
        System.out.println("Before adding in arr1 " + arr1.get(1));
        arr1.add(1, "New second");
        System.out.println("After adding in arr1 " + arr1.get(1));
        arr1.set(1, "Set new five");
        System.out.println("After set of value :    " + arr1.get(1));
        System.out.println("Index of 'Second' : " + arr1.indexOf("Second"));
        System.out.println("ARR1 " + arr1.toString());
        System.out.println("'Set new five' is contains "+ arr1.contains("Set new five"));
        System.out.println("Before remove element First in arr1 " + arr1.size() + "-> " + arr1.toString());
        arr1.remove("First");
        System.out.println("After remove element First in arr1 " + arr1.size() + "-> " + arr1.toString());
        System.out.println("Remove element " + arr1.removeIf(x -> x.contains("Set new fiv")) + "-> " + arr1.toString());
        arr1.clear();
        System.out.println("After clear Lenght of arr1 is " + arr1.size() + "-> " + arr1.toString());

        System.out.println("_------------------------ ARR 2   AND ARR 3-------------------------------------------");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Monday");
        arr2.add("Tuesday");
        arr2.add("Wednesday");
        arr2.add("Thursday");
        arr2.add("Friday");
        arr2.add("Saturday");
        arr2.add("Sunday");
        ArrayList<String> arr3 = new ArrayList<>(arr2);
        System.out.println("Lenght of arr2 " + arr2.size() + "-> " + arr2);
        System.out.println("Lenght of arr3 " + arr3.size() + "-> " + arr3);
        System.out.println(arr2.get(1));
        System.out.println("Lenght of arr1 " + arr1.size() + "-> " + arr1.toString());

        System.out.println("_------------------------ ARR 4   AND ARR 5-------------------------------------------");
        /** Сравнение двух массивов и удаление элементов не принадлежащих переданной коллекции */
        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("Gren");
        arr4.add("Red");
        arr4.add("Blue");
        ArrayList<String> arr5 = new ArrayList<>();
        arr5.add("Gren");
        arr5.add("Black");
        arr5.add("Blue");
        System.out.println("Array arr4 is containing : " + arr4);
        System.out.println("Array arr5 is containing : " + arr5);
        arr4.retainAll(arr5);
        System.out.println("Удаляет элементы, не принадлежащие переданной коллекции: ARR4 " + arr4);
        System.out.println("В Arr5 оставляет все как есть" + arr5);

        System.out.println("_------------------------ ARR 6   AND ARR7-------------------------------------------");
        /** Сравнение двух массивов и удаление всех элементов, которые есть в обеих коллекциях */
        ArrayList<String> arr6 = new ArrayList<>(20);
        arr6.add("Gren");
        arr6.add("Red");
        arr6.add("Blue");
        ArrayList<String> arr7 = new ArrayList<>();
        arr7.add("Gren");
        arr7.add("Black");
        arr7.add("Blue");
        System.out.println("Array arr6 is containing : " + arr6);
        System.out.println("Array arr7 is containing : " + arr7);
        arr6.removeAll(arr7);
        System.out.println("Удаляет элементы, принадлежащие обеим коллекциям: ARR6 " + arr6);
        System.out.println("В Arr7 оставляет все как есть" + arr7);

    }
}
