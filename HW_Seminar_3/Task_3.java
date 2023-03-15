package HW_Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_3 {

    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(0, 100));
        }
        int minL = minList(list);
        int maxL = maxlist(list);
        double meanL = meanlist(list);
        System.out.println(list);
        System.out.printf("Минимальное элемент в листе: %d\nМаксимальный элемент в листе: %d\n" +
                "Среднее арифметическое значение листа: %.2f",minL,maxL,meanL);
    }

    public static int minList(List<Integer> listInt) {
        int minValue = listInt.get(0);

        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) < minValue) minValue = listInt.get(i);

        }
        return minValue;
    }

    public static int maxlist(List<Integer> listInt) {
        int maxValue = listInt.get(0);

        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) > maxValue) maxValue = listInt.get(i);

        }
        return maxValue;
    }

    public static double meanlist(List<Integer> listInt) {
        double sumValue = 0;
        double meanValue;
        for (int i = 0; i < listInt.size(); i++) {
            sumValue += listInt.get(i);
        }
        meanValue = sumValue / listInt.size();
        return meanValue;
    }
}