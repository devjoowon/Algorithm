import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();
		int cnt = 0;
		
		for(int j=0; j<arr.length; j++) {
			if(v == arr[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}