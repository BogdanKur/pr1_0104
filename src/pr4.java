import java.util.Random;
import java.util.Scanner;

public class pr4 {
    public static void printArray(int[] a) {
        System.out.print("Массив: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        // Задача 1: Создание и заполнение массива
        System.out.print("Введите размер массива (≤ 100): ");
        int n = rand.nextInt(100) + 1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        printArray(arr);

        // Задача 2: Сумма квадратов элементов
        int sumOfSquares = 0;
        for (int j : arr) {
            sumOfSquares += j * j;
        }
        System.out.println("Сумма квадратов элементов: " + sumOfSquares);

        // Задача 3: Вывод элементов, кратных 3
        System.out.print("Элементы, кратные 3: [");
        boolean first = true;
        for (int j : arr) {
            if (j % 3 == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(j);
                first = false;
            }
        }
        System.out.println("]");
    }
}
