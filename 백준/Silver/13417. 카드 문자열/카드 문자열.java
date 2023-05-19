import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int index = 0;
			String result = sc.next();
			
			for (int i = 0; i < N - 1; i++) {
				char c = sc.next().charAt(0);
				int k = index;
				boolean s = true;
				
				while (k >= 0) {
					if (result.charAt(k) >= c) {
						k--;
					} else {
						s = false;
						break;
					}
				}

				if (s) {
					result = c + result;
					index++;
				} else
					result = result + c;
			}
			System.out.println(result);
		}
	}

}
