import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int result = 1;
        Scanner scanner = new  Scanner(System.in);
        System.out.print("¬ведите целое число: ");
        int f = scanner.nextInt();
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("–езультат =" + result);
    }
}