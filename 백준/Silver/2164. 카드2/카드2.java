import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 1; i <= N; i++){
			que.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(que.size() != 1){
			sb.append(que.poll()).append(" ");
			que.add(que.poll());
		}
		System.out.println(que.poll());
	}

}
