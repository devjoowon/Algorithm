import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int F, S, G, U, D;
	static boolean visited[];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		F = sc.nextInt();
		S = sc.nextInt();
		G = sc.nextInt();
		U = sc.nextInt();
		D = sc.nextInt();
		
		visited = new boolean[F + 1];
		
		int result = bfs();
		
		if(result < 0) {
			System.out.println("use the stairs");
		}else {
			System.out.println(result);
		}
	}
	
	public static int bfs() {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(S);
		visited[S] = true;
		
		int size = 0;
		int cnt = -1;
		while (!queue.isEmpty()) {
			size = queue.size();
			cnt++;
			
			for(int s = 0; s < size; s++) {
				int cur = queue.poll();
				
				if(cur == G) {
					return cnt;
				}
				
				if(cur + U <= F && !visited[cur + U]) {
					queue.offer(cur + U);
					visited[cur + U] = true;
				}
				
				if(cur - D > 0 && !visited[cur - D]) {
					queue.offer(cur - D);
					visited[cur - D] = true;
				}
			}
		}
		
		return -1;
	}

}
