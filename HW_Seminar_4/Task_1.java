package HW_Seminar_4;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task_1 {

    //    Пусть дан LinkedList с несколькими элементами.
    //    Реализуйте метод, который вернёет «перевёрнутый» список.
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 6,5,9,7,2,3,6,7);
        reversed(list);
        System.out.println(list);

    }
    private static List<Integer> reversed (List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
