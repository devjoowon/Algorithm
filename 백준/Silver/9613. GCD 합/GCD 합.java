import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스의 개수
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();	// 수의 개수
			int[] nums = new int[n];
			
			for(int j = 0; j < n; j++) {
				nums[j] = sc.nextInt();	// 수 입력하기
			}
			
			long sum = 0;
			for(int j = 0; j < n; j++) {
				for(int k = j; k < n; k++) {
					if(j != k) {
						sum += gcd(nums[j], nums[k]);
					}
				}
			}
			System.out.println(sum);
		}
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}
