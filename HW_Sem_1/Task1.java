package HW_Sem_1;

import java.util.Scanner;

public class Task1 {
//    Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число");
        int number= input.nextInt();
        input.close();
        int sum = 0,multiply = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
            multiply *= i;
        }
        System.out.printf("n-ое треугольного число = %d\n", sum);
        System.out.printf(" произведение чисел от 1 до n = %d", multiply);
    }
}

//public class Work1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        System.out.printf("Triangle number = %d\n", triangleNum(number));
//        System.out.printf("Factorial number = %d", factNum(number));
//        sc.close();
//    }
//
//
//    public static int triangleNum(int number) {
//        int triangleNumber = (number * (number + 1)) / 2;
//        return triangleNumber;
//    }
//
//    public static int factNum(int number) {
//        if (number == 0) return 1;
//        return number*factNum(number-1);
//
//    }
//}
