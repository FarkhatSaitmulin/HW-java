package HW_Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(0, 20));
        }
        System.out.println(list);
        int index = list.size();
        for (int j = 0; j < index; j++) {
            if (list.get(j) % 2 == 0 & list.get(j) != 0) {
                list.remove(j);
                index --;
                j --;
            }
        }
        System.out.println(list);
    }
}