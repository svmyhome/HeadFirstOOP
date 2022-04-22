package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
    public static void main(String[] args) {
        /** Adds all values to the collection */
        System.out.println("================== Adds all values to the collection =================");
        ArrayList<Integer> listAddAll = new ArrayList<>();
        Collections.addAll(listAddAll, 1, 2, 3, 4, 5);
        for (int index : listAddAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Changes all values in the collection */
        System.out.println("================== Changes all values in the collection =================");
        ArrayList<Integer> listFillAll = new ArrayList<>();
        Collections.addAll(listFillAll, 1, 2, 3, 4, 5);
        for (int index : listFillAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.fill(listFillAll, 100);
        for (int index : listFillAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Replaces all similar values in the collection */
        System.out.println("================== Replaces all similar values in the collection =================");
        ArrayList<Integer> listReplaceAll = new ArrayList<>();
        Collections.addAll(listReplaceAll, 1, 2, 3, 2, 4, 5, 2);
        for (int index : listReplaceAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.replaceAll(listReplaceAll, 2, 22);
        for (int index : listFillAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Copies the first collection to the second collection */
        System.out.println("================== Copies the first collection to the second collection  =================");
        ArrayList<Integer> listCopySrc = new ArrayList<>();
        Collections.addAll(listCopySrc, 7, 8, 9);
        ArrayList<Integer> listCopyDest = new ArrayList<>();
        Collections.addAll(listCopyDest, 1, 2, 3, 2, 4, 5, 2);
        for (int index : listCopyDest) {
            System.out.print(index);
        }
        System.out.println();
        Collections.copy(listCopyDest, listCopySrc);
        for (int index : listCopyDest) {
            System.out.print(index);
        }
        System.out.println();
        /** Changes the order of all values in the collection */
        System.out.println("================== Changes the order of all values in the collection =================");
        ArrayList<Integer> listReverseAll = new ArrayList<>();
        Collections.addAll(listReverseAll, 1, 2, 3, 4, 5);
        for (int index : listReverseAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.reverse(listReverseAll);
        for (int index : listReverseAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Sorts all values to the collection */
        System.out.println("================== Sorts all values to the collection =================");
        ArrayList<Integer> listSortAll = new ArrayList<>();
        Collections.addAll(listSortAll, 8, 7, 3, 1, 5);
        for (int index : listSortAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.sort(listSortAll);
        for (int index : listSortAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Rotates all values to the collection */
        System.out.println("================== Rotates all values to the collection =================");
        ArrayList<Integer> listRotatesAll = new ArrayList<>();
        Collections.addAll(listRotatesAll, 1, 2, 3, 4, 5, 6, 7);
        for (int index : listRotatesAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.rotate(listRotatesAll, 3);
        for (int index : listRotatesAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Shuffles all values to the collection */
        System.out.println("================== Rotates all values to the collection =================");
        ArrayList<Integer> listShufflesAll = new ArrayList<>();
        Collections.addAll(listShufflesAll, 1, 2, 3, 4, 5, 6, 7);
        for (int index : listShufflesAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.shuffle(listShufflesAll);
        for (int index : listShufflesAll) {
            System.out.print(index);
        }
        System.out.println();
        /** Searching min value to the collection */
        System.out.println("================== Searching min value to the collection =================");
        ArrayList<Integer> listMinAll = new ArrayList<>();
        Collections.addAll(listMinAll, 1, 2, 3, 4, 5, 6, 7);
        int minV = Collections.min(listMinAll);
        System.out.println(minV);
        System.out.println();
        /** Searching max value to the collection */
        System.out.println("================== Searching max value to the collection =================");
        ArrayList<Integer> listMaxAll = new ArrayList<>();
        Collections.addAll(listMaxAll, 1, 2, 3, 4, 5, 6, 7);
        int maxV = Collections.max(listMaxAll);
        System.out.println(maxV);
        System.out.println();
        /** Frequencies the value to the collection */
        System.out.println("================== Frequencies the value to the collection =================");
        ArrayList<Integer> listFrequenceAll = new ArrayList<>();
        Collections.addAll(listFrequenceAll, 1, 2, 3, 2, 5, 2, 7);
        for (int index : listFrequenceAll) {
            System.out.print(index);
        }
        System.out.println();
        System.out.println("The two is " + Collections.frequency(listFrequenceAll, 2));
        System.out.println();
        /** Binary searching the value to the collection */
        System.out.println("================== Binary searching the value to the collection =================");
        System.out.println("================== Before Binary searching You must sorts the value to the collection =================");
        ArrayList<Integer> listBSearchAll = new ArrayList<>();
        Collections.addAll(listBSearchAll, 1, 2, 3, 4, 5, 6, 7);
        for (int index : listBSearchAll) {
            System.out.print(index);
        }
        System.out.println();
        Collections.sort(listBSearchAll);
        System.out.println("The three is " + Collections.binarySearch(listBSearchAll, 3));
        System.out.println("The two is " + Collections.binarySearch(listBSearchAll, 2));
        System.out.println("The zero is " + Collections.binarySearch(listBSearchAll, 0));
        System.out.println();
        /** Compares the elements of two collections */
        System.out.println("================== Compares the elements of two collections =================");
        ArrayList<Integer> listCompares1All = new ArrayList<>();
        Collections.addAll(listCompares1All, 1, 2, 3, 4, 5);
        for (int index : listCompares1All) {
            System.out.print(index);
        }

        ArrayList<Integer> listCompares2All = new ArrayList<>();
        Collections.addAll(listCompares2All, 1, 2, 3, 4, 5);
        for (int index : listCompares2All) {
            System.out.print(index);
        }

        ArrayList<Integer> listCompares3All = new ArrayList<>();
        Collections.addAll(listCompares3All, 6, 8, 7, 9, 45);
        for (int index : listCompares3All) {
            System.out.print(index);
        }
        System.out.println();
        System.out.println("Elements of the collection are equal " + Collections.disjoint(listCompares1All, listCompares2All));
        System.out.println("Elements of the collection are not equal " + Collections.disjoint(listCompares1All, listCompares3All)); // Возвращает true если не один эдемент не совпал
        System.out.println();
    }
}
