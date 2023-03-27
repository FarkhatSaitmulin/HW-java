package Seminar_6;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) throws Exception {
        List<Notebook> list = new ArrayList<>();

        Notebook note1 = new Notebook("lenova", 17.0, "i5", "windows", 8, 128);
        Notebook note2 = new Notebook("asus", 15.6, "i7", "windows", 16, 128);
        Notebook note3 = new Notebook("hp", 15.6, "i3", "linux", 8, 128);
        Notebook note4 = new Notebook("macbook", 13.3, "i5", "ios", 8, 254);
        Notebook note5 = new Notebook("macbook", 13.3, "i3", "ios", 4, 128);
        Notebook note6 = new Notebook("macbook", 15.6, "i5", "ios", 8, 128);
        Notebook note7 = new Notebook("acer", 15.6, "i3", "windows", 4, 128);

        Collections.addAll(list, note1, note2, note3, note4, note5, note6, note7);

        System.out.print("""

                1 - модель
                2 - диогональ экрана
                3 - процессор
                4 - операционная система
                5 - оперативная память
                6 - объем накопителя
                введите критерий сортировки через пробел:\s""");

        Scanner in = new Scanner(System.in);
        String[] choice = in.nextLine().split(" ");
        try {
            for (String str : choice) {

                switch (str) {
                    case "1": {
                        System.out.print("введите модель (acer, lenova, hp, asus, macbook): ");
                        modelSort(list, in.next());
                        break;
                    }
                    case "2": {
                        System.out.print("введите размер диогонали (13.3, 15.6, 17.0): ");
                        sizeSort(list, in.next());
                        break;
                    }
                    case "3": {
                        System.out.print("введите модель процессора (i3, i5, i7): ");
                        cpuSort(list, in.next());
                        break;
                    }
                    case "4": {
                        System.out.println("введите операционную систему (Linux, ): ");
                        osSort(list, in.next());
                        break;
                    }
                    case "5": {
                        System.out.print("введите объем ОЗУ: ");
                        ramSort(list, in.next());
                        break;
                    }
                    case "6": {
                        System.out.println();
                        ssdSort(list, in.next());
                        break;
                    }

                    default:
                        throw  new RuntimeException();

                }

            }

        } catch (RuntimeException e) {
            System.out.println("не правильный ввод данных");
        }
        in.close();
    }
    private static void modelSort(List<Notebook> list, String str) {

        list.removeIf(item -> !str.equals(item.getModel()));
    }

    private static void sizeSort(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getSize().toString()));
    }

    private static void cpuSort(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getCpu().toString()));
    }

    private static void osSort(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getOs().toString()));
    }

    private static void ramSort(List<Notebook> list, String str) {
        list.removeIf(item -> !(item.getRam() == Integer.parseInt(str)));
    }

    private static void ssdSort(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getSsd().toString()));
    }
}