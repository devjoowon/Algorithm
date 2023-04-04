import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 수의 개수
		int[] number = new int[n];
		
		for(int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		
		for(int i = 0; i < n; i++) {
			System.out.println(number[i]);
		}
	}

}