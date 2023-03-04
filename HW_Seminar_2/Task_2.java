
import java.io.IOException;


import java.util.Arrays;
import java.util.logging.*;


public class Task_2 {

//    Реализуйте алгоритм сортировки пузырьком числового массива,
//    результат после каждой итерации запишите в лог-файл.

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_2.class.getName());
        FileHandler fh = new FileHandler("Log.txt"); // true - ecли хочешь видеть историю всех запусков программы
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] arr = {5, 8, 9, 7, 6, 4, 8, 9, 4};
        int temp;
        logger.setUseParentHandlers(false);
        logger.info("start sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                logger.info("итерация j" + Arrays.toString(arr));
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            logger.info("Проход № " + (i + 1)  + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
