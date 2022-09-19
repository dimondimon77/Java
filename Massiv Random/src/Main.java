import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int len;
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите длину массива = ");
        len = in.nextInt();
        int[] massiv = new int[len];
        for (int i=0;i<massiv.length;i++)
            massiv[i] = (int) (Math.random() * len);
        for (int i: massiv)
            System.out.print( i + " " );
    }
}