package Objects;

import java.util.ArrayList;

public class ObjectsTest {
    public static void main(String[] args) {
        ArrayList<Object> arrObj = new ArrayList<>();
        arrObj.add("ПРивет");
        arrObj.add(1);

        boolean arr0 = arrObj.get(0) instanceof String;
        boolean arr1 = arrObj.get(1) instanceof Integer;
        System.out.println("Проверяет является ли переменная String " + arr0);
        System.out.println("Проверяет является ли переменная Integer " + arr1);

        // После записи в object тип теряется, снова приводим к первоначальному типу

        String s1 = (String) arrObj.get(0);
        int i1 = (int) arrObj.get(1);


    }
}
