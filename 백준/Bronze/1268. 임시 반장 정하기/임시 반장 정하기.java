import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int[][] table = new int[count][5];
		int n1 = 0;
		int n2 = 0;
		
		for(int i = 0; i < count; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < 5; j++) {
				table[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i = 0; i < count; i++) {
			Set<Integer> set = new HashSet<>();
			
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < count; k++) {
					if(i == k) {
						continue;
					}
					if(table[i][j] == table[k][j]) {
						set.add(k);
					}
				}
			}
			if(n2 < set.size()) {
				n2 = set.size();
				n1 = i + 1;
			}
		}
		if(n1 == 0) {
			System.out.println(1);
		}else {
			System.out.println(n1);
		}
	}

}
