import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	// 요리시간(초)
		
		int A = 0;	// 버튼 A를 누르는 횟수
		int B = 0;	// 버튼 B를 누르는 횟수
		int C = 0;	// 버튼 C를 누르는 횟수
		
		if(T % 10 != 0) {
			System.out.println(-1);
		}else {
			A = T / 300;
			T = T % 300;
			
			B = T / 60;
			T = T % 60;
			
			C = T / 10;
			
			System.out.println(A + " " + B + " " + C);
		}
		
	}

}