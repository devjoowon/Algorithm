import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        double V = 0;
        for (int i = 0; i < N; i++) {
            double a = 1 - (V / 100.0);
            double b = 1 - (A[i] / 100.0);
            V = (1 - (a * b)) * 100;
            System.out.printf("%.6f%n", V);
        }

        scanner.close();
    }
}
