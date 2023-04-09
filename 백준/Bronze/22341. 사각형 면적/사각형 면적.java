import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        int C = sc.nextInt();
        int cy = N;
        int cx = N;
        while (C-- > 0) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            if (y > cy || x > cx) continue;
            int ny = y;
            int nx = cx;
            int w = y * cx;
            if (w < cy * x) {
                ny = cy;
                nx = x;
            }
            cy = ny;
            cx = nx;
        }
        System.out.println(cy * cx);
    }
}