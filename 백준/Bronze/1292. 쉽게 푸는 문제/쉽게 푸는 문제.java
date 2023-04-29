import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int n = 300;
		int[] arr = new int[45150];
		int index = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1 ; j <= i; j++) {
				arr[index++] = i;
			}
		}
		for(int i = A-1; i <= B-1; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
