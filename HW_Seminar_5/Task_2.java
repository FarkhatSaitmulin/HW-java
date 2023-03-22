package HW_Seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Task_2 {
    //Пусть дан список сотрудников, Написать программу, которая найдёт и выведет повторяющиеся
    // имена с количеством повторений. Отсортировать по убыванию популярности.
    public static void main(String[] args) {
        Map<String, String> listPerson = new HashMap<>();

        listPerson.put("Крутова", "Анна");
        listPerson.put("Юрин", "Иван");
        listPerson.put("Савина", "Марина");
        listPerson.put("Чернышов", "Светлана");
        listPerson.put("Лугова", "Мария");
        listPerson.put("Владимирова", "Светлана");
        listPerson.put("Федорова", "Марина");
        listPerson.put("Петрова", "Светлана");


        Map<String, Integer> Count = new HashMap<>();
        int someKey,defaultVal = 0;


        for (Map.Entry<String, String> item : listPerson.entrySet()) {

            someKey = Count.getOrDefault(item.getValue(), defaultVal);
            Count.put(item.getValue(), ++ someKey );
        }

        List<Integer> sortedList = new ArrayList<>(Count.values());
        sortedList = sortedList.stream().sorted().toList();

        for (int i = sortedList.size() - 1; i >= 0 ; i--) {
            for (Map.Entry<String, Integer> item : Count.entrySet()){
                if (sortedList.get(i) == item.getValue()) {
                    System.out.println(item.getKey() + " : " + item.getValue() + " раз(а)" );
                }

            }

        }
    }
}