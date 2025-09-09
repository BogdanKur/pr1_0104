import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Числа на которые " +
                number + " делится без остатка:");
        for (int i = number; i != 0; i--) {
            if(number % i == 0)
                System.out.println(i);
        }
    }
}