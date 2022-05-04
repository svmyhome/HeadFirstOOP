package EnumsClass;

public class EnumTest {
    enum Day {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    public static void main(String[] args) {

        Day mon = Day.Monday;
        System.out.println(mon);
        /**  выводит список*/
        Day[] days = Day.values(); // Записывает все значения в архив
        for (Day index : days) {
            System.out.println(index);
        }
        System.out.println("The number of the " + Day.Tuesday + " is " + Day.Tuesday.ordinal()); // показывает номер дня
    //преобразование типов

        String str = Day.Monday.toString();
        System.out.println(str);

        Day newDay = Day.valueOf("Monday");
        System.out.println(newDay);

        int index = Day.Monday.ordinal();
        System.out.println(Day.values()[index + 3]);


    }
}
