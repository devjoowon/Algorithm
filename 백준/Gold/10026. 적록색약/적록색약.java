import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int n; 
	static char[][] grid; // n*n grid
	static boolean[][] visited;
	static int[] dx = {0, -1, 0, 1}; 
	static int[] dy = {1, 0, -1, 0};
	static int ans1 = 0; // 적록색약이 아닌 사람
	static int ans2 = 0; // 적록색약인 사람
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		grid = new char[n][n];
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine(); // RRRRR
			for(int j = 0; j < n; j++) {
				grid[i][j] = str.charAt(j); // R R R R R
			}
		}
		
		// 1. 적록색약이 아닌 사람
		// 구역 개수 구하기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					dfs(i, j);
					ans1++;
				}
			}
		}
		
		// 2. 적록색약인 사람
		// G인 경우 R로 변경
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(grid[i][j] == 'G') {
					grid[i][j] = 'R'; 
				}
			}
		}
		
		// 방문 체크 초기화
		visited = new boolean[n][n]; 
		
		// 구역 개수 구하기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					dfs(i, j);
					ans2++;
				}
			}
		}
		
		System.out.println(ans1 + " " + ans2);
	}
	
	// 상하좌우 방문 체크
	public static void dfs(int x, int y) {
		
		visited[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if(grid[nx][ny] == grid[x][y] && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
		
	}

}
