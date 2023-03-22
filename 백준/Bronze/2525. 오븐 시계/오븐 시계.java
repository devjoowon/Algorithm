import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();	// 현재 시
		int m = sc.nextInt();	// 현재 분
		int c = sc.nextInt();	// 요리하는데 필요한 시간 (분)
				
		int hm = h * 60 + m;	// 현재 시각 (분으로 변환)
		int sum = hm + c;		// 현재 시간 + 요리 시간 (분)
		
		int hour = (sum / 60) % 24;
		int min = sum % 60;
		
		System.out.println(hour + " " + min);
	}
	
}