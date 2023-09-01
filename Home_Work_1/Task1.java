package Home_Work_1;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int nTriangle = countNTriangle(n);
            System.out.println("Треугольное число: " + nTriangle);
        }
    }

    public static int countNTriangle(int n) {
        return n * (n + 1) / 2;
    }

}
