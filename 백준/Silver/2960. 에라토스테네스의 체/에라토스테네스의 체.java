import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		boolean[] primes = new boolean[N+1];
		int cnt = 0;
		int ans = 0;
		
		for(int i = 2; i <= N; i++) {
			primes[i] = true;
		}
		
		for(int i = 2; i <= N; i++) {
			for(int j = i; j <= N; j += i) {
				if(primes[j]) {
					primes[j] = false;
					cnt ++;
					if(cnt == K) {
						ans = j;
						break;
					}
				}
			}
			if(cnt == K) {
				break;
			}
		}
		System.out.println(ans);
	}
	
}
