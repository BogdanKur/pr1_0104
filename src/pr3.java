import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        System.out.print("Результат: ");
        if (absA > absB) System.out.println(a);
        else if (absB > absA) System.out.println(b);
        else System.out.println("equal");
    }
}
