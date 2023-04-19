import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int acc = 0;
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i = 0; i < N; i ++) {
			P[i] = sc.nextInt();
		}
		
		Arrays.sort(P);
		for(int i = 0; i < P.length; i++) {
			acc += P[i];
			sum += acc;
		}
		
		System.out.println(sum);
	}

}
