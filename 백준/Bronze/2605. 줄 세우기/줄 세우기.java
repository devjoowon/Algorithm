import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int num = sc.nextInt();		// 학생수
		
		for(int i = 1; i <= num; i++) {
			int lot = sc.nextInt();		// 제비뽑기 수
			list.add(i);
			list.add(i - lot, i);
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}