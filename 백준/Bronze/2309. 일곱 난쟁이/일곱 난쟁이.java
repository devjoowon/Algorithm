import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		int spy1 = 0;
		int spy2 = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					spy1 = arr[i];
					spy2 = arr[j];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(spy1 == arr[i] || spy2 == arr[i]) continue;
			System.out.println(arr[i]);
		}
	}

}