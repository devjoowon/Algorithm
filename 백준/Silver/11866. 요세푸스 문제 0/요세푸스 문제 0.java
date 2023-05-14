import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 1; i <= N; i++){
			que.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		while(que.size() > 1) {
			
			for(int i = 0; i < K - 1; i++) {
				int val = que.poll();
				que.offer(val);
			}
			
			sb.append(que.poll()).append(", ");
		}
		
		sb.append(que.poll()).append('>');
		System.out.println(sb);
	}

}
