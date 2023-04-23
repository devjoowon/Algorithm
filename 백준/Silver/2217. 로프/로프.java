import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rope = new int[N];
		for(int i = 0; i < N; i++) {
			rope[i] = sc.nextInt();
		}
		Arrays.sort(rope);
		Integer[] ropeObj = Arrays.stream(rope).boxed().toArray(Integer[]::new);
		Arrays.sort(ropeObj, Collections.reverseOrder());
		
		int[] result = new int[N];
		for(int i = 0; i < N; i++) {
			result[i] = ropeObj[i] * (i + 1);
		}
		System.out.println(Arrays.stream(result).max().getAsInt()); 
	}

}
