import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 여학생의 수
		int m = sc.nextInt();	// 남학생의 수
		int k = sc.nextInt();	// 인턴쉽 참여 인원 수
		
		int team = 0;	// 팀의 수
		
		while(n >= 2 && m >= 1 && m + n >= 3 + k) {
			n -= 2;
			m -= 1;
			team ++;
		}
		
		System.out.println(team);
		sc.close();
	}

}