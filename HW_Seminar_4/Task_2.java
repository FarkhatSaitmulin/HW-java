package HW_Seminar_4;

import java.util.Collections;
import java.util.LinkedList;

public class Task_2 {

// Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9);
        System.out.println(list + "Исходный лист");
        enqueue(list, 4);
        System.out.println(list + " Добавили в конец очереди новый элемент");
        System.out.println(dequeue(list) + " - первый элемент");
        System.out.println(list + " лист без удаленного элемента");
        System.out.println(first(list) + " - первый элемент");
        System.out.println(list + " лист вместе с первым элементом");
    }

    public static void enqueue(LinkedList<Integer> enq, int number) {
        enq.add(number);                                                 // добавляет элемент

    }

    public static Integer dequeue(LinkedList<Integer> deq) {
        int temp = deq.get(0);                                         // возвращает возвращает
        deq.remove(0);                                           // удалить
        return temp;

    }

    public static int first(LinkedList<Integer> frs) {
        return frs.get(0);
    }

}
