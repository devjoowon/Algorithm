import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arrA = new int[N];
		int[] arrB = new int[N];
		
		for(int i = 0; i < N; i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			arrB[i] = sc.nextInt();
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		int[] result = new int[N];
		for(int i = 0; i < N; i++) {
			result[i] = arrA[i] * arrB[N-1-i];
		}
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}

}
