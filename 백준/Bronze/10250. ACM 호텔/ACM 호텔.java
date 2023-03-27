import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	// 테스트 데이터 수
		
		for(int i=0; i < T; i++) {
			
			int H = sc.nextInt();	// 호텔의 층 수
			int W = sc.nextInt();	// 각 층의 방 수
			int N = sc.nextInt();	// N번째 손님
			
			int roomNum = 0;
			// 로직
			if((N % H) == 0) {
				roomNum = H * 100 + (N / H);
			} else {
				roomNum = (N % H)*100 + (N / H + 1);
			}
			
			
			// 출력
			System.out.println(roomNum);
		}
		
	}

}