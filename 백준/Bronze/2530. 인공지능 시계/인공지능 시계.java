import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	// 시 
		int B = sc.nextInt();	// 분
		int C = sc.nextInt();	// 초
		int D = sc.nextInt();	// 요리하는 데 필요한 시간 (초)
		
		int now = A*3600 + B*60 + C;
		int sum = now + D;
		
		int hour = (sum / 3600) % 24;
		int min = (sum % 3600) / 60;
		int sec = (sum % 3600) % 60;
		System.out.println(hour + " " + min + " " + sec);
	}

}