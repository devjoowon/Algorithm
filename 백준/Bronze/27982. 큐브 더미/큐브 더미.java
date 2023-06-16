import java.util.Scanner;

public class Main {
    static final int MAX = 7;
    static boolean[][][] Cube = new boolean[MAX][MAX][MAX];
    static int N, M, X, Y, Z;
    static int Answer;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();
            Z = sc.nextInt();
            Cube[X][Y][Z] = true;
        }
        sc.close();
    }

    public static void settings() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (Cube[i][j][k]) {
                        if (Cube[i + 1][j][k] && Cube[i - 1][j][k] && Cube[i][j + 1][k] && Cube[i][j - 1][k] && Cube[i][j][k + 1]
                                && Cube[i][j][k - 1]) {
                            Answer++;
                        }
                    }
                }
            }
        }
    }

    public static void findAnswer() {
        System.out.println(Answer);
    }

    public static void main(String[] args) {
        input();
        settings();
        findAnswer();
    }
}
