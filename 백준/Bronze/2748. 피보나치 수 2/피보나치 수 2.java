import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long sum = 1;
		long n1 = 0;
		long n2 = 1;
		
		for(int i=1; i<n; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		System.out.println(sum);
	}
}
