import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		if((v - b) % (a - b) == 0) {
			System.out.println((v - b) / (a - b));
		}else {
			System.out.println((v - b) / (a - b) + 1);
		}
		
	}

}