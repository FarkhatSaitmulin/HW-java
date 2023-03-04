package HW_Sem_1;

import java.util.Arrays;
import java.util.Scanner;
public class Task_3 {
    // Реализовать простой калькулятор

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String[] input = in.nextLine().split(" ");
        in.close();
        //System.out.println(Arrays.toString(input));
        float firstNum = Integer.parseInt(input[0]);
        float secondNum = Integer.parseInt(input[2]);
        //float result;
        switch (input[1]) {
            case "+" -> System.out.println(firstNum + secondNum);
            case "-" -> System.out.println(firstNum + secondNum);
            case "*" -> System.out.println(firstNum + secondNum);
            case "/" -> {
                if (secondNum != 0) {
                    System.out.println(firstNum / secondNum);
                } else {
                    System.out.println("деление на ноль");
                }
            }
            default -> {
            }
        }
    }
}