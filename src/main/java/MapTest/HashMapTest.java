package MapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static HashMap<Integer, String> hashMapArray = new HashMap<>();

    public static void main(String[] args) {
        HashMapTest hashMapTest = new HashMapTest();
        hashMapTest.addElement(0, "Kat0");
        hashMapTest.addElement(1, "Kat1");
        hashMapTest.addElement(2, "Kat2");
        hashMapTest.addElement(3, "Kat3");


        System.out.println(hashMapArray);
        System.out.println("Collection size is " + hashMapArray.size());
        System.out.println("key2  is in the HashMap " + hashMapArray.containsKey(2));
        System.out.println("key2  is contains" + hashMapArray.get(2));
        System.out.println("key2  is remove" + hashMapArray.remove(2));
        System.out.println("key2  is not  in the HashMap " + hashMapArray.containsKey(2));
        System.out.println("Value 'Kat1'  is in the HashMap " + hashMapArray.containsValue("Kat1"));
        /** Cicle 1 for key and value*/
        System.out.println("----------------- Cicle 1 for key and value ---------------");
        for (Integer index : hashMapArray.keySet()) {
            System.out.println("Value with key" + index + "  = " + hashMapArray.get(index));
        }
        /** Cicle 2 for key and value*/
        System.out.println("-------------------- Cicle 2 for key and value ---------------");
        for (Map.Entry<Integer,String> val1 : hashMapArray.entrySet()) {
            Integer index = val1.getKey();
            String name = val1.getValue();
            System.out.println(index + " : " + name);
        }    
        
    }

    public void addElement(Integer index, String name) {
        hashMapArray.put(index, name);
    }
}
