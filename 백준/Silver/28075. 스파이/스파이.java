import java.util.Scanner;

public class Main {
    static int[][] progress;
    static int N, M, ret;

    public static void dfs(int day, int sum, int prevJ) {
        if (day == N) {
            if (sum >= M)
                ret++;
            return;
        }
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                int nextSum = sum;
                if (j == prevJ)
                    nextSum += progress[i][j] / 2;
                else
                    nextSum += progress[i][j];
                dfs(day + 1, nextSum, j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        progress = new int[2][3];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                progress[i][j] = scanner.nextInt();
            }
        }
        dfs(0, 0, -1);
        System.out.println(ret);
    }
}
